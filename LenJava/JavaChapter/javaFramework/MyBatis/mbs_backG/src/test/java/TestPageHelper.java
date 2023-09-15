import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.loy.mybatis.mapper.EmployeeMapper;
import com.loy.mybatis.pojo.Employee;
import com.loy.mybatis.utils.MapperUtils;
import org.junit.Test;

import java.util.List;

public class TestPageHelper {

    /**
     * index：当前页码起始索引
     * pageSize：每页显示数量
     * pageNum：当前页码
     * index=(pageNum-1)*pageSize
     */
    @Test
    public void testPage(){
        EmployeeMapper mapperObj = MapperUtils.getMapperObj(EmployeeMapper.class);
//查询功能前开启分页
        PageHelper.startPage(1,4);
        List<Employee> employees = mapperObj.selectByExample(null);
//        employees.forEach(employee -> System.out.println(employee));
//在查询后获取分页信息：5表示导航分页数，即类似123,234,345
        PageInfo<Employee> employeePageInfo = new PageInfo<>(employees, 3);
        System.out.println(employeePageInfo);
    }
}
