package cn.demo.houserent;

public class HouseService {
    /*
    增删改查操作
     */
    //保存房屋信息
    private House[] houses;

    public HouseService(int size) {
        houses = new House[size];
    }

    public House[] list() {
        return houses;
    }

    //添加操作
    //记录当前房屋个数
    private int houseNum;

    public boolean add(House newhouse) {
        if (houseNum == houses.length) {
            System.out.println("容量已满");
            return false;
        }
        //添加新的房屋后，数量加一
        newhouse.setId(houseNum);
        houses[houseNum] = newhouse;
        houseNum++;
        return true;
    }

    public boolean del(int id) {//考虑元素删除后，空元素需要往后顺位
        for (int i = 0; i < houseNum; i++) {
            if (houses[i].getId() == id) {
                houses[i] = null;
                return true;
            }
        }

        return false;
    }

    public House mod(int id){
        for (int i = 0; i <houseNum ; i++) {
            if(houses[i].getId()==id){
                return houses[i];
            }
        }
        return null;
    }

    public House[] findInt(int type, int par) {//用在范围查找和删除
        House[] arr = new House[houseNum];
        for (int i = 0, j = 0; i < houseNum; i++) {
            if (type == 1 && houses[i].getId() == par) {
                arr[j++] = houses[i];
            } else if (type == 3 && houses[i].getRent() == par) {
                arr[j++] = houses[i];
            }
        }
        return arr;
    }

}
