package M_C_references;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 构造器引用
 * 与方法应用类似
 */
public class Constructorref {
    @Test
    public void conTest1(){
        Supplier<ArrayList> supplier=new Supplier<ArrayList>() {
            @Override
            public ArrayList get() {
                return new ArrayList();
            }
        };
        supplier.get();

        System.out.println("=========构造器引用：===========");
        Supplier<ArrayList> supplier1=ArrayList::new;
        supplier1.get();
    }

    /**
     * 数组引用
     */
    @Test
    public void arrTest(){
        Function<Integer,String[]> function=len->new String[len];
        String[] arr=function.apply(5);
        System.out.println(Arrays.toString(arr));

        Function<Integer,String[]> function1=String[]::new;
        String[] arr1=function1.apply(6);
        System.out.println(Arrays.toString(arr1));
    }

}
