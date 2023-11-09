package com.kaka.houserent.view;

import com.kaka.houserent.domain.House;
import com.kaka.houserent.service.HouseService;
import com.kaka.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;//控制菜单显示
    private char key = ' ';//接收用户输入选择

    //显示房屋信息
    private HouseService houseService = new HouseService(2);
    public void listHouse(){
        System.out.println("======================房屋列表====================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t\t状态");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i] );
        }
        System.out.println("=================================================\n");
    }

    //新增房屋
    public void addHouse(){
        System.out.println("====================新增房屋信息====================");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String adress = Utility.readString(8);
        System.out.print("房租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(8);
        //添加新的房屋信息
        House newHouse = new House(0, name, phone, adress, rent, state);
        if (houseService.add(newHouse)){
            System.out.println("添加房屋成功");
        }else {
            System.out.println("添加房屋失败");
        }
    }


    //删除房屋信息
    public void delHouse(){
        System.out.println("====================删除房屋信息====================");
        System.out.print("请输入房屋编号（-1退出）：");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("取消删除房屋信息");
            return;
        }
        char choice = Utility.readConfirmSelection();//该方法有循环判断的逻辑，必须输入
        if (choice == 'Y'){
            if (houseService.del(delId)){
                System.out.println("删除成功");
            }else {
                System.out.println("没找到房屋信息，删除失败");
            }
        }else {
            System.out.println("取消删除房屋信息");
        }
    }

    //退出确认
    public void exitHouse(){
        char c = Utility.readConfirmSelection();
        if (c == 'Y'){
            loop = false;
        }
    }

    //查找房屋信息
    public void findHouse(){
        System.out.println("====================查找房屋信息====================");
        System.out.print("请输入id：");
        int findId = Utility.readInt();
        //调用方法
        House house = houseService.findByiId(findId);
        if (house != null){
            System.out.println(house);
        }else {
            System.out.println("查无此房");
        }
    }

    //修改房屋信息
    public void updataHouse(){
        System.out.println("====================修改房屋信息====================");
        System.out.println("请输入要修改的房屋的信(-1表示退出)");
        int upDataId = Utility.readInt();
        if (upDataId == -1){
            System.out.println("取消修改房屋信息");
            return;
        }
        House house = houseService.findByiId(upDataId);
        if (house == null){
            System.out.println("房屋信息不存在");
            return;
        }

        //修改名字
        System.out.println("姓名(" + house.getName() + "):");
        //不修改信息的话这里给一个默认值“”
        String name = Utility.readString(8, "");
        //如果输入的不是空字符串，就是说明修改了数据
        if (!"".equals(name)){
            house.setName(name);
        }

        //修改电话
        System.out.println("电话(" + house.getPhone() + "):");
        //不修改信息的话这里给一个默认值“”
        String phone = Utility.readString(12, "");
        //如果输入的不是空字符串，就是说明修改了数据
        if (!"".equals(phone)){
            house.setPhone(phone);
        }

        //修改地址
        System.out.println("地址(" + house.getAddress() + "):");
        //不修改信息的话这里给一个默认值“”
        String address = Utility.readString(12, "");
        //如果输入的不是空字符串，就是说明修改了数据
        if (!"".equals(address)){
            house.setAddress(address);
        }

        //修改月租
        System.out.println("月租(" + house.getRent() + "):");
        //不修改信息的话这里给一个默认值“”
        int rent = Utility.readInt(-1);
        //如果输入的不是空字符串，就是说明修改了数据
        if (rent != -1){
            house.setRent(rent);
        }

        //修改状态
        System.out.println("状态(" + house.getState() + "):");
        //不修改信息的话这里给一个默认值“”
        String  state = Utility.readString(3,"");
        //如果输入的不是空字符串，就是说明修改了数据
        if (!"".equals(state)){
            house.setState(state);
        }

    }

    //界面方法，显示主菜单
    public void mainMeun(){
        do {
            System.out.println("=======房屋出租系统菜单========");
            System.out.println("\t\t1 新 增 房 源 信 息");
            System.out.println("\t\t2 查 找 房 源 信 息");
            System.out.println("\t\t3 删 除 房 源 信 息");
            System.out.println("\t\t4 修 改 房 源 信 息");
            System.out.println("\t\t5 显 示 房 源 信 息");
            System.out.println("\t\t6 退            出");
            System.out.print("请输入你的选择1 - 6：");
            key = Utility.readChar();
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                   updataHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                   exitHouse();
                    break;
            }
        }while (loop);
    }
}
