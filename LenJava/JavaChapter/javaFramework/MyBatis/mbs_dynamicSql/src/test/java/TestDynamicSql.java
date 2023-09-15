import com.loy.mybatis.mapper.DynamicSql;
import com.loy.mybatis.pojo.Employee;
import com.loy.mybatis.utils.MapperUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestDynamicSql {

    DynamicSql mapperObj = MapperUtils.getMapperObj(DynamicSql.class);


    @Test
    public void  getEmpByConditionTest(){
         List<Employee> zhangsan = mapperObj.getEmpByWhere(new Employee(null, "aa", 0));
        System.out.println(zhangsan);

        List<Employee> lisi = mapperObj.getEmpByWhere(new Employee(null, "aa", 0));
        System.out.println(lisi);
    }

    @Test
    public void deleteEmpByForeachTest(){
        int i = mapperObj.deleteEmpByForeach(new Integer[]{2, 3, 4});
        System.out.println(i);
    }

    @Test
    public void insertEmpByForeachTest(){
        Employee aa = new Employee(null, "bb", 11);
        Employee bb = new Employee(null, "dd", 13);
        Employee cc = new Employee(null, "cc", 14);
        List<Employee> list = Arrays.asList(aa, bb, cc);
        int i = mapperObj.insertEmpByForeach(list);
        System.out.println(i);
    }
}
