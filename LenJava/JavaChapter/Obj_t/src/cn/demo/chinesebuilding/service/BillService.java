package cn.demo.chinesebuilding.service;

import cn.demo.chinesebuilding.dao.BillDao;
import cn.demo.chinesebuilding.domain.Bill;
import cn.demo.chinesebuilding.domain.Menu;

import java.util.List;
import java.util.UUID;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary
 */
public class BillService {
    private BillDao billDao = new BillDao();//用于操作bill表数据
    private MenuService menuService = new MenuService();//用于获取菜品单价
    private DiningtableService diningtableService = new DiningtableService();//用于获取餐桌状态；

    //编写点餐
    //更新餐桌状态
    public boolean orderMenu(int menuId, int nums, int dingTableId) {
        //生成账单号
        String billId = UUID.randomUUID().toString();
        //使用MenuService.getMenuById方法查询该菜品单价
        Menu menus = menuService.getMenuByid(menuId);

        //将账单生成到bill表
        int update = billDao.update("insert into bill values(null,?,?,?,?,?,now(),'未结账')",
                billId, menuId, nums, menus.getMprice() * nums, dingTableId
        );
        if (update <= 0) {
            return false;
        }
        //账单生成之后更新餐桌状态
        return diningtableService.updateDiningTableState(dingTableId, "就餐中");
    }

    //获取账单
    public List<Bill> ordersList(int diningTableId) {
        List<Bill> bills = billDao.queryMulti("select * from bill where diningtableId=?", Bill.class, diningTableId);
        return bills;
    }


    //    结账


    public boolean invoicing(String type,int diningTableId) {
        //判断账单是否有未结账更改账单状态
        Bill bill = billDao.queryString("select * from bill where diningtableId=? and state='未结账'", Bill.class, diningTableId);
        if(bill!=null){
            int update = billDao.update("update bill set state=? where diningtableId=?", type, diningTableId);
            //更改餐桌状态
            diningtableService.orderDiningTable(diningTableId,"","");
            boolean state = diningtableService.updateDiningTableState(diningTableId, "空闲");
            if(update>0 && state){
                return  true;
            }
        }


        return false;

    }
}
