package com.java_learn.oop_advanced.inner_;

public class MemberInner {
    public static void main(String[] args) {
        /**
         * 成员内部类
         */
        M_Outer m_outer = new M_Outer();
        m_outer.show();
        //外部其他类访问成员内部类
        //方法1
        M_Outer.M_Inner m_inner = m_outer.new M_Inner();
        m_inner.M_met();
//        方法2：创建一个方法返回成员内部类的对象
        m_outer.innerInstance().M_met();

    }
}
class M_Outer{
    private int age=12;
    class M_Inner{
        private  int a=21;

        public void M_met(){
            System.out.println("这里是成员内部类的方法");
        }
    }
    public  void show(){//在外部类方法中实例化再调用
        M_Inner m_inner = new M_Inner();
        m_inner.M_met();
    }
    public M_Inner innerInstance(){
        return new M_Inner();
    }
}