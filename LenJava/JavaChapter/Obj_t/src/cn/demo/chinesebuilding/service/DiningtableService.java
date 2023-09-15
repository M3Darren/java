package cn.demo.chinesebuilding.service;

import cn.demo.chinesebuilding.dao.DiningtableDao;
import cn.demo.chinesebuilding.domain.Diningtable;

import java.util.List;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class DiningtableService {
     private DiningtableDao diningtableDao=new DiningtableDao();
     public List<Diningtable> list(){//返回餐桌列表
          List<Diningtable> diningtables = diningtableDao.queryMulti("select id,state from diningtable", Diningtable.class);
          return diningtables;
     }
     //根据id查询餐桌是否存在
     public Diningtable getDiningtableByid(int id){
          return diningtableDao.queryString("select * from diningtable where id=?",Diningtable.class,id);
     }

     //如果·餐桌可预订，将其状态更新
     public boolean orderDiningTable(int id,String ordername,String ordertel){
          int update = diningtableDao.update("update diningtable set state='已预订',ordername=?,ordertel=? where id=?", ordername, ordertel,id);
          return update>0;
     }
     //更新餐桌状态的方法（供点餐时使用billservice）
     public boolean updateDiningTableState(int id,String state ){
          int update = diningtableDao.update("update diningTable set state=? where id=?", state, id);
          return update>0;
     }

}
