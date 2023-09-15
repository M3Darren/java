package Functionals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Functional_t1 {
    /**
     * java内置的4大核心函数式接口：
     * 消费型：Consumer<T>      void accept(T t)
     * 供给型：Supplier<T>      T get()
     * 函数型：Function<T,R>    R apply(T t)
     * 断定型：Predicate<T>     boolean test(T t)
     */

    public void testCon(double money,Consumer<Double> consumer){
        consumer.accept(money);
    }
    @Test
    public void testConsumer(){
        testCon(300,new Consumer<Double>(){
            @Override
            public void accept(Double aDouble) {
                System.out.println("今天购物消费："+aDouble+"元");
            }
        });
        System.out.println("======Lambda表达式写法：======");
        testCon(400,money-> System.out.println("话费充值："+money));
    }



    public List<String> filterString(List<String> list, Predicate<String> pre){
        ArrayList<String> filterList=new ArrayList<>();
        for (String s : list){
            if(pre.test(s)){//根据Predicate的方法给定规则筛选字符串（可自定义重写该方法）
                filterList.add(s);
            }
        }
        return filterList;
    }
    @Test
    public void testPredicate(){
        List<String> list= Arrays.asList("北京","天津","南京");
        List<String> filterStr=filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(filterStr);

        System.out.println("======Lambda表达式：=======");
        List<String> filterStr1=filterString(list,s -> s.contains("京"));
    }

}
