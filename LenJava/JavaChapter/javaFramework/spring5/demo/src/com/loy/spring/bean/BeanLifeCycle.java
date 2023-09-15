package com.loy.spring.bean;

public class BeanLifeCycle {
    //演示bean生命周期
    private String beanName;

    public BeanLifeCycle() {
        System.out.println("第一步：调用无参构造");
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
        System.out.println("第二步：调用set方法设置属性值");
    }
    public void init(){
        System.out.println("第三步：调用init初始化方法");//需要在xml文件bean标签设置init-method属性，值为该方法名（init）
    }
    public void destroy(){
        System.out.println("第五步：销毁bean");
    }
}
