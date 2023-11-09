package com.kaka.houserent.view;

import com.kaka.houserent.domain.House;
import com.kaka.houserent.service.HouseService;
import com.kaka.houserent.utils.Utility;

public class HouseView {
    private boolean loop = true;//控制菜单显示
    private char key = ' ';//接收用户输入选择
    private HouseService houseService = new HouseService(10);
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
        System.out.println("================================================\n");
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
                    System.out.println("新增");
                    break;
                case '2':
                    System.out.println("查找");
                    break;
                case '3':
                    System.out.println("删除");
                    break;
                case '4':
                    System.out.println("修改");
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    System.out.println("退出");
                    loop = false;
                    break;
            }
        }while (loop);
    }
}
