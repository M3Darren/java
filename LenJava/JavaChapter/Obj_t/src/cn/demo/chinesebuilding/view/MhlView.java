package cn.demo.chinesebuilding.view;

import cn.demo.chinesebuilding.domain.Bill;
import cn.demo.chinesebuilding.domain.Diningtable;
import cn.demo.chinesebuilding.domain.Employee;
import cn.demo.chinesebuilding.domain.Menu;
import cn.demo.chinesebuilding.service.BillService;
import cn.demo.chinesebuilding.service.DiningtableService;
import cn.demo.chinesebuilding.service.EmployeeService;
import cn.demo.chinesebuilding.service.MenuService;
import cn.demo.chinesebuilding.utils.Utility;
import org.junit.jupiter.api.Test;

import javax.sound.midi.Soundbank;
import java.util.List;

/**
 * @author ECHOm6
 * @version 1.0
 * @Summary 显示满汉楼主菜单界面
 */
public class MhlView {
    private boolean loop = true;//控制是否退出菜单
    private String key = "";//接收用户输入
    private EmployeeService employeeService = new EmployeeService();
    private DiningtableService diningtableService = new DiningtableService();

    private MenuService menuService = new MenuService();//操作菜品
    private BillService billService = new BillService();

    public static void main(String[] args) {
        MhlView mhlView = new MhlView();
        mhlView.mainMenu();
    }

    public void mainMenu() {
        while (loop) {
            System.out.println("=========满汉楼============");
            System.out.println("\t\t 1.登录满汉楼");
            System.out.println("\t\t 2.退出");
            System.out.println("请输入你的选择：");
            key = Utility.readString(1);
            switch (key) {
                case "1":
                    System.out.println("请输入员工号：");
                    String id = Utility.readString(50);
                    System.out.println("请输入密码：");
                    String pwd = Utility.readString(50);
                    //数据库判断登录是否成功
                    Employee employee = employeeService.getEmployeeByIdAndPwd(id, pwd);
                    if (employee != null) {
                        System.out.println("" + employee.getEmpname() + "登录成功");
                        //显示二级菜单
                        while (loop) {
                            System.out.println("========二级菜单========");
                            System.out.println("\t\t 1.显示餐桌状态");
                            System.out.println("\t\t 2.预定餐桌");
                            System.out.println("\t\t 3.显示所有菜品");
                            System.out.println("\t\t 4.点餐服务");
                            System.out.println("\t\t 5.查看账单");
                            System.out.println("\t\t 6.结账");
                            System.out.println("\t\t 9.退出");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
//                           System.out.println("显示餐桌状态");
                                    List<Diningtable> list = diningtableService.list();
                                    System.out.println("\t\t编号\t\t状态");
                                    for (Diningtable diningtable : list) {
                                        System.out.println(diningtable);
                                    }
                                    break;
                                case "2":
                                    orderDiningtable();
                                    break;
                                case "3":
//                                    System.out.println("显示菜品");
                                    listMenu();
                                    break;
                                case "4":
//                                    System.out.println("点餐服务");
                                    orderMenu();
                                    break;
                                case "5":
//                                    System.out.println("查看账单");
                                    orderList();
                                    break;
                                case "6":
//                                    System.out.println("结账");
                                    orderInvoicing();
                                    break;
                                case "9":
                                    loop = false;//这里与外层循环同一个控制变量
                                    break;
                                default:
                                    System.out.println("输入有误");
                            }
                        }
                    } else {
                        System.out.println("登录失败");
                    }
                    break;
                case "2":
                    loop = false;
                    break;
                default:
                    System.out.println("输入有误，重新输入");
            }
        }
        System.out.println("已退出");
    }

    //预定餐桌
    public void orderDiningtable() {
        System.out.println("=====预定餐桌");
        System.out.println("请选择预定餐桌编号（-1退出）：");
        int orderid = Utility.readInt();
        if (orderid == -1) {
            System.out.println("取消预定");
            return;
        }
        System.out.print("是否预定");
        char key = Utility.readConfirmSelection();//该方法已经转化为大写字母
        if (key == 'Y') {
            //根据orderid返回diningtable对象
            Diningtable diningtableByid = diningtableService.getDiningtableByid(orderid);
            if (diningtableByid == null) {
                System.out.println("餐桌不存在");
                return;
            }
            if (!("空".equals(diningtableByid.getState()))) {
                //餐桌状态不为空，说明餐桌在用餐或者已经预定
                System.out.println("当前餐桌不可预定");
                return;
            }
            System.out.println("预订人：");
            String ordername = Utility.readString(10);
            System.out.println("预订人电话：");
            String ordertel = Utility.readString(20);

            //此时可以更新餐桌状态
            if (diningtableService.orderDiningTable(orderid, ordername, ordertel)) {
                System.out.println("预定成功");
            } else {
                System.out.println("预定失败");
            }

        } else {
            System.out.println("=========取消预定===========");
        }

    }

    //获取菜品列表
    public void listMenu() {
        List<Menu> menus = menuService.menuList();
        System.out.println("\t\t编号\t\t菜名\t\t类型\t\t价格");
        for (Menu list : menus) {
            System.out.println(list);
        }
    }

    //点餐
    public void orderMenu() {
        System.out.println("输入点餐桌号(退出-1)：");
        int orderDiningTableId = Utility.readInt();
        if (orderDiningTableId == -1) {
            System.out.println("========取消点餐========");
            return;
        }
        System.out.println("输入菜品号(退出-1)：");
        int orderMenuId = Utility.readInt();
        if (orderMenuId == -1) {
            System.out.println("========取消点餐========");
            return;
        }
        System.out.println("输入菜品数量(退出-1)：");
        int nums = Utility.readInt();
        if (nums == -1) {
            System.out.println("========取消点餐========");
            return;
        }

        //验证餐桌号是否存在
        Diningtable diningtable = diningtableService.getDiningtableByid(orderDiningTableId);
        if (diningtable == null) {
            System.out.println("=====餐桌号不存在=====");
            return;
        }
        //验证菜品编号
        Menu menu = menuService.getMenuByid(orderMenuId);
        if (menu == null) {
            System.out.println("======菜品不存在=======");
            return;
        }
        if (billService.orderMenu(orderMenuId, nums, orderDiningTableId)) {
            System.out.println("===点餐成功====");
        } else {
            System.out.println("===点餐失败");
        }

    }

    //账单
    public void orderList(){
        System.out.println("请输入餐桌号(取消-1)：");
        int diningTableId = Utility.readInt();
        if (diningTableId==-1){
            System.out.println("取消");
        }

        List<Bill> bills = billService.ordersList(diningTableId);
        System.out.println("==="+diningTableId+"号账单===");
        for (Bill list:bills){
            System.out.println(list);
        }
    }

    //结账
    public void orderInvoicing(){
        System.out.println("请输入结账餐桌号(退出-1)：");
        int orderDiningTableId = Utility.readInt();

        System.out.println("请选择支付方式：");
        String type = Utility.readString(10);
        char c = Utility.readConfirmSelection();
        if(c=='Y'){
            boolean invoicing = billService.invoicing(type, orderDiningTableId);
             if(invoicing){
                 System.out.println("结账成功");
             }else{
                 System.out.println("结账失败");
             }
        }
    }

}
