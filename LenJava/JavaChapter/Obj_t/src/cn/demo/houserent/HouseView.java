package cn.demo.houserent;

public class HouseView {
    /*
    系统界面
     */
    private boolean loop=true;
    private  char key=' ';
    public void mainMenu(){
         do {
             System.out.println("-------========房屋出租系统=========--------");
             System.out.println("\t\t\t1.新 增 房 源");
             System.out.println("\t\t\t2.查 找 房 屋");
             System.out.println("\t\t\t3.删 除 房 屋");
             System.out.println("\t\t\t4.修 改 房 屋 信 息");
             System.out.println("\t\t\t5.房 屋 列 表");
             System.out.println("\t\t\t6.退 出");
             System.out.println("请选择（1~6）：");
             key=Utility.readChar();
             switch (key){
                 case '1':
                     System.out.println("新增");
                     addHouse();
                     break;
                 case '2':
                     System.out.println("查找");
                     findHouse();
                     break;
                 case '3':
                     System.out.println("删除");
                     delHouse();
                     break;
                 case '4':
                     System.out.println("修改");
                     modHouse();
                     break;
                 case '5':
                     System.out.println("列表");
                     listHouse();
                     break;
                 case '6':
                     System.out.println("退出");
                     loop=false;
                     break;
             }
         }while (loop);
    }
   //定义系统容量
    private HouseService houseServices=new HouseService(10);

    //添加操作
    public void addHouse(){
        System.out.println("======添加======");
        System.out.print("姓名：");
        String name=Utility.readString(8);
        System.out.print("电话：");
        String phone=Utility.readString(12);
        System.out.print("地址：");
        String address=Utility.readString(16);
        System.out.print("月租：");
        int rent=Utility.readInt();
        System.out.print("状态：");
        String state=Utility.readString(3);
        House newhouse=new House(name,phone,address,rent,state);
        if (houseServices.add(newhouse)){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    //查找
    public void findHouse(){//此处代码在delHouse();modHouse()方法可复用
        System.out.println("请选择查找方式：");
        System.out.println("1.id");
        System.out.println("2.地区");
        System.out.println("3.月租");
        System.out.println("4.状态");
        char fkey=Utility.readChar();
        switch (fkey){
            case '1':
                System.out.print("请输入要查找的id：");
                int id=Utility.readInt();
                showArr(houseServices.findInt(1,id));
                break;
            case '2':
                System.out.print("请输入要查找的地区：");
                break;
            case '3':
                System.out.print("请输入要查找的月租：");
                int rent=Utility.readInt();
                showArr(houseServices.findInt(3,rent));
                break;
            case '4':
                System.out.print("请输入要查找的状态：");
                break;
        }

    }
    //删除
    public void delHouse(){
        System.out.println("请输入需要删除的id号：");
        int id=Utility.readInt();
        if(houseServices.del(id)){
            System.out.println("删除成功");
        }else{
            System.out.println("m没有找到此id");
        }
    }
    //修改
    public void modHouse(){
        System.out.println("请输入需要修改的id：");
        House res=houseServices.mod(Utility.readInt());
        if (res !=null){
            System.out.print("姓名（"+res.getName()+"）：");
            String name=Utility.readString(8,"");
            System.out.print("电话（"+res.getPhone()+"）：");
            String phone=Utility.readString(12,"");
            System.out.print("地址（"+res.getAddress()+"）：");
            String address=Utility.readString(16,"");
            System.out.print("状态（"+res.getState()+"）：");
            String state=Utility.readString(3,"");
            System.out.print("租金（"+res.getRent()+"）：");
            int rent=Utility.readInt(-1);
            if(!"".equals(name)){
            res.setName(name);
            }
            if(!"".equals(phone)){
                res.setPhone(phone);
            }
            if(!"".equals(address)){
                res.setAddress(address);
            }
            if(!"".equals(state)){
                res.setState(state);
            }
            if (rent!=-1){
                res.setRent(rent);
            }
        }
        else{
            System.out.println("没有找到对应信息");
        }
        System.out.println("修改成功");
    }

    //房屋列表
    public void listHouse(){
        System.out.println("======列表======");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（已出租/未出租）");
        House[] houses= houseServices.list();
        showArr(houses);
    }
//用于输出检索列表提高复用性
    public void  showArr(House[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==null){
                break;
            }
            System.out.println(arr[i]);
        }
    }
}
