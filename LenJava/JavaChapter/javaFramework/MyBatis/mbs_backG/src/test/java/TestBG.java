import com.loy.mybatis.mapper.EmployeeMapper;
import com.loy.mybatis.pojo.Employee;
import com.loy.mybatis.pojo.EmployeeExample;
import com.loy.mybatis.utils.MapperUtils;
import org.junit.Test;

import java.util.List;

public class TestBG {
    EmployeeMapper mapperObj = MapperUtils.getMapperObj(EmployeeMapper.class);
    @Test
    public void testSelect(){
//        查询全部数据
        List<Employee> employees = mapperObj.selectByExample(null);
        employees.forEach(emp-> System.out.println(emp));
//        根据条件查询
        EmployeeExample example = new EmployeeExample();
        example.createCriteria().andEnameEqualTo("aa");
        //使用or()方法实现or关键字查询
//        example.or().andDidIsNotNull();
        List<Employee> employeeList = mapperObj.selectByExample(example);
        employeeList.forEach(employee -> System.out.println(employee));
    }

    @Test
    public void testUpdate(){
//        updateByPrimaryKey当某个字段为空时会更改该字段为null
        mapperObj.updateByPrimaryKey(new Employee( 5,null, (short) 22,1));
//        updateByPrimaryKeySelective当某个字段为空，不会更改该字段的值
        mapperObj.updateByPrimaryKeySelective(new Employee( 1,null, (short) 22,1));
    }

}
