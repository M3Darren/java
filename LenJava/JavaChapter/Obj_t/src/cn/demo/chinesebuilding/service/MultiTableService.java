package cn.demo.chinesebuilding.service;

import cn.demo.chinesebuilding.dao.MultiTableDao;
import cn.demo.chinesebuilding.domain.MultiTableBean;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class MultiTableService {

   private MultiTableDao multiTableDao= new MultiTableDao();
    //测试多表的查询
    @Test
    public void TestMultiTable(){
        List<MultiTableBean> multiTableBeans = multiTableDao.queryMulti("select bill.*,menu.mname as name from bill,menu where bill.menuId=menu.id", MultiTableBean.class);

        for(MultiTableBean list:multiTableBeans){
            System.out.println(list);
        }
    }
}
