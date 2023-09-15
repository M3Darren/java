import com.loy.mybatis.mapper.ParamMapper;
import com.loy.mybatis.mapper.SpecialSqlMapper;
import com.loy.mybatis.pojo.User;
import com.loy.mybatis.utils.MapperUtils;
import org.junit.Test;

import java.util.List;

public class TestSpecialSql {
    private final SpecialSqlMapper mapperObj = MapperUtils.getMapperObj(SpecialSqlMapper.class);

    @Test
    public void selectLikeTest(){
        List<User> users = mapperObj.selectLike("l");
        System.out.println(users);
    }

    @Test
    public void deleteSomeTest(){
        int i = mapperObj.deleteSomeUser("4,5,6");
        System.out.println(i);
    }

//    获取指定数据表信息
    @Test
    public void getTableTest(){
        List<User> mUser = mapperObj.getUserByTable("m_user");
        System.out.println(mUser);
    }

//    获取自增主键
    @Test
    public void getAutoKey(){
        User user = new User(null, "王五", "sss111");
        mapperObj.getAutoKey(user);
        //此时调用上述的user即可获取id，因为映射文件keyProperty将自增属性值映射给id
//        解决问题：不需要查询此数据，就可以将id用作连表插入其他数据
        System.out.println(user.getId());
    }
}
