package com.loy.spb_web.config;

import com.loy.spb_web.pojo.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.util.StringUtils;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;
import org.springframework.web.accept.ParameterContentNegotiationStrategy;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.util.UrlPathHelper;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Configuration(proxyBeanMethods = false)
public class WebConfig {
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
        methodFilter.setMethodParam("_m");
        return methodFilter;
    }


    //自定义SpringMVC功能
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return new WebMvcConfigurer() {
            //开启矩阵变量
            @Override
            public void configurePathMatch(PathMatchConfigurer configurer) {
                UrlPathHelper urlPathHelper = new UrlPathHelper();
                urlPathHelper.setRemoveSemicolonContent(false);
                configurer.setUrlPathHelper(urlPathHelper);
            }

            //自定义Converter，例如完成场景：请求传入数据cat=阿喵,3；封装为cat实体类的name=阿喵，age=3；
            @Override
            public void addFormatters(FormatterRegistry registry) {
                registry.addConverter(new Converter<String, Cat>() {
                    @Override
                    public Cat convert(String source) {
                        // 啊猫,3
                        if(!StringUtils.isEmpty(source)){
                            Cat pet = new Cat();
                            String[] split = source.split(",");
                            pet.setName(split[0]);
                            pet.setAge(Integer.parseInt(split[1]));
                            return pet;
                        }
                        return null;
                    }
                });
            }

            //设置策略，使自定义的converter可使用format参数进行协商

            @Override
            public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
                HashMap<String, MediaType> mediaType = new HashMap<>();
                mediaType.put("json",MediaType.APPLICATION_JSON);
                mediaType.put("xml",MediaType.APPLICATION_XML);
                //加入自定义converter
                mediaType.put("loy",MediaType.parseMediaType("application/loy-agreement"));
                ParameterContentNegotiationStrategy strategy = new ParameterContentNegotiationStrategy(mediaType);
                //可加入多个策略除了自定义的，还有默认的请求头策略，即通过accept：application/loy
                HeaderContentNegotiationStrategy strategy1 = new HeaderContentNegotiationStrategy();
                configurer.strategies(Arrays.asList(strategy,strategy1));
            }

            //添加自定义converter
            @Override
            public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
                converters.add(new LoyMessageConverter());
            }
        };
    }

   /*此方法需要该类实现WebMvcConfigurer接口
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        UrlPathHelper urlPathHelper = new UrlPathHelper();
        urlPathHelper.setRemoveSemicolonContent(false);
        configurer.setUrlPathHelper(urlPathHelper);
    }*/
}
