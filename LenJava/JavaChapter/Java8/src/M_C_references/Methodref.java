package M_C_references;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * 方法引用场景：当Lambda体已有实现方法，可使用方法引用
 * 本质：是Lambda表达式
 * 使用格式：类（或对象）::方法名
 * 具体分为三种情况：
 * 1.对象::非静态方法
 * 2.类::静态方法
 * 3.类：非静态方法
 * 使用要求：接口中的方法形参列表和返回类型必须和方法引用的方法一致
 */
public class Methodref {

    //    情形一：对象::非静态方法
//    使用前提:
//    void accept(T t)
//    void println(T t)
    @Test
    public void aSituation() {
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("hello");
        System.out.println("======方法引用=======");
        PrintStream out = System.out;
        Consumer<String> consumer1 = out::println;
        consumer1.accept("word");
    }

    //    情形二：类::静态方法
//    使用前提：
//    Comparator：int compare(T o1,T o2)
//    Integer：   int compare(T o1,T o2)
    public void bSituation() {
        Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(comparator.compare(12, 2));
        System.out.println("======方法引用======");
        Comparator<Integer> comparator1 = Integer::compare;
        System.out.println(comparator1.compare(1, 2));
    }

    //    情形三：类::非静态方法（与前两个不同，参数列表可不同）
//    Comparator：int compare(T s1,T s2)
//    String：    int s1.compareTo(s2)
    public void cSituation() {
        Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
        System.out.println(comparator.compare("abc", "abd"));
        System.out.println("========方法引用========");
        Comparator<String> comparator1 = String::compareTo;
        System.out.println(comparator1.compare("ss", "sas"));
    }



}
