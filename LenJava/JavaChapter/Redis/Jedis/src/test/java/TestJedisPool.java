import com.loy.JedisConnectionFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.HashMap;

public class TestJedisPool {
    private Jedis jedis;
     @BeforeEach
    void setUp(){
         jedis=JedisConnectionFactory.getJedis();
         jedis.auth("111111");
         jedis.select(0);
     }
     @AfterEach
     void tearDown(){
         if(jedis!=null){
             jedis.close();
         }
     }

     @Test
    public void testHash(){
         HashMap<String, String> map = new HashMap<>();
         map.put("name","zhangsan");
         map.put("id","1");
         Long hset = jedis.hset("javaUser:1", "name","zhangsan");
         Long hset1 = jedis.hset("javaUser:2", map);
         System.out.println(hset1+"\n"+hset);
     }

}
