package com.java_learn.jdbc_.connectionPool.BasicDao;

import com.java_learn.jdbc_.connectionPool.BasicDao.dao.ActorDao;
import com.java_learn.jdbc_.connectionPool.BasicDao.javabean.Actor;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class TestActorDao {
   @Test
   public void testActorDao(){//查询多行结果
      ActorDao actorDao=new ActorDao();
      //查询
      List<Actor> actors = actorDao.queryMulti("select * from l827 where id >?", Actor.class, 1);
      for (Actor actor:actors){
         System.out.println(actor);
      }

      //dml
     int rows= actorDao.update("insert into l827 values(null,?,?,?,?)","哈哈","男",12,"123");
      System.out.println(rows);
   }

}
