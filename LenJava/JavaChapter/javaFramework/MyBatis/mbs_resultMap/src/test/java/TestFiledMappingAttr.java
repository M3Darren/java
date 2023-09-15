import com.loy.mybatis.mapper.DeptMapper;
import com.loy.mybatis.mapper.FiledMappingAttr;
import com.loy.mybatis.pojo.Department;
import com.loy.mybatis.pojo.Employee;
import com.loy.mybatis.utils.MapperUtils;
import org.junit.Test;

public class TestFiledMappingAttr {
    FiledMappingAttr mapperObj = MapperUtils.getMapperObj(FiledMappingAttr.class);
    @Test
    public void testGetEmp(){
        Employee empById = mapperObj.getEmpById(1);
        System.out.println(empById);
    }

    @Test
    public void testGetEmpInfo(){
        Employee empById = mapperObj.getEmpInfo(1);
        System.out.println(empById);
    }

//    分步查询
    @Test
    public void getEmpStepOneTest(){
        Employee empStepOne = mapperObj.getEmpStepOne(1);
        System.out.println(empStepOne);
    }

//    测试延迟加载
    @Test
    public void testLazyLoading(){
        Employee empStepOne = mapperObj.getEmpStepOne(1);
        String empName = empStepOne.getEmpName();

        System.out.println(empName);
        System.out.println("============");
        System.out.println(empStepOne.getDepartment());
    }


//    测试一对多
DeptMapper mapperObj1 = MapperUtils.getMapperObj(DeptMapper.class);
    @Test
    public void testGetDeptAndEmp(){

        Department deptAndEmp = mapperObj1.getDeptAndEmp(1);
        System.out.println(deptAndEmp);
    }

    @Test
    public void testStepResultMap(){
        Department department = mapperObj1.getDEStepOne("技术部");
        System.out.println(department.getDeptName());
    }
}
