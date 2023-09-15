import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

public class TestJedis {
    private Jedis jedis;
    //建立连接
    @BeforeEach
    void setUp(){
        jedis=new Jedis("192.168.240.133",6379);
        jedis.auth("111111");
        jedis.select(0);
    }
    @Test
    public void testString(){
        String result = jedis.set("javaName", "zhangsan");
        System.out.println(result);
        String s = jedis.get("javaName");
        System.out.println(s);
    }
}
