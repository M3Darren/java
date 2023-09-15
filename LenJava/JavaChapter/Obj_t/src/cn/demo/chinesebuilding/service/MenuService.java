package cn.demo.chinesebuilding.service;

import cn.demo.chinesebuilding.dao.MenuDao;
import cn.demo.chinesebuilding.domain.Menu;

import java.util.List;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class MenuService {
   private MenuDao menuDao=new MenuDao();
   public List<Menu> menuList(){
      return menuDao.queryMulti("select * from menu",Menu.class);
   }

   //根据菜品id号查询该菜品的单价
   public Menu getMenuByid(int id){
      return menuDao.queryString("select * from menu where id=?",Menu.class,id);
   }
}
