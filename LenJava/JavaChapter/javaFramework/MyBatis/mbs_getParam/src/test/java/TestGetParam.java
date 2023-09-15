import com.loy.mybatis.mapper.ParamMapper;
import com.loy.mybatis.pojo.User;
import com.loy.mybatis.utils.MapperUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestGetParam {
    private final ParamMapper mapperObj = MapperUtils.getMapperObj(ParamMapper.class);
    @Test
    public void registerTest( ) {

        int i = mapperObj.registerUser("lisi", "root123");
        System.out.println(i);
    }
    @Test
    public void registerParamTest( ) {

        int i = mapperObj.registerUserParam("wangwu", "root123123");
        System.out.println(i);
    }
    @Test
    public void checkLoginTest( ) {
        Map<String, Object> map=new HashMap<>();
        map.put("username","lisi");
        map.put("passwd","root123");
        User user = mapperObj.checkLoginUser(map);
        System.out.println(user);
    }

    @Test
    public void insertTest( ) {
        int i = mapperObj.insertUser(new User(null, "aaa", "aaa"));
        System.out.println(i);
    }

    @Test
    public void countTest(){
        int i = mapperObj.countUser();
        System.out.println(i);
    }
}
