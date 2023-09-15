package Optional_;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Optional.of(T t)  创建Optional实例，t必须非空
 * Optional.empty()  创建空的Optional实例
 *
 * 防止空指针的方法：
 * Optional.ofNullable(T t)  t可为空
 * Optional.orElse(T t) 如果当前Optional内的t1为非空则返回t1，否则返回t
 */
public class Optt1 {
    public void t1(){
        ArrayList<Object> objects = new ArrayList<>();
        Optional<ArrayList<Object>> objects1 = Optional.of(objects);

    }
}
