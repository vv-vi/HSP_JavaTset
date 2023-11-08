package com.kaka.houserent;

import com.kaka.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        //创建Houseview对象，并且显示主菜单，是整个程序的入口
        new HouseView().mainMeun();
        System.out.println("====退出房屋出租系统=====");
    }
}
