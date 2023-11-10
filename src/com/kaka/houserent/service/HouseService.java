package com.kaka.houserent.service;

import com.kaka.houserent.domain.House;

/**
 * HouseService. java<=>类[业务层]
 * //定义House[] ,保存House对象
 * 1. 响应HouseView的调用
 * 2.完成对房屋信息的各种操作(增删改查c [create ]r[read]u[update ]d[delete])
 */

public class HouseService {
    private House[] houses;//保存House对象
    private int houseNum = 1;//记录有多少个房屋信息
    private int idCounter = 1;//记录当前的id增长到哪个值

    public HouseService(int size) {
        houses = new House[size];//当创建HouseService的时候，指定数组的大小
        //方便测试，创建一个房屋对象
        houses[0] = new House(1, "aa", "123", "x区", 2000, "未出租");
    }

    //查找房屋信息
    public House findByiId(int findId){
        //遍历数组
        for (int i = 0; i < houseNum; i++) {
            //如果找到了，就返回房屋信息
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        //没有找到就返回空
        return null;
    }

    //删除房屋信息
    public boolean del(int delId) {
        //如果删除就要找到对象对应的数组下标，但是下标不等于编号
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            //要删除的访问id，是数组下标为i的元素
            if (delId == houses[i].getId()) {
                index = i;
            }
            //如果没找到
            if (index == -1) {
                return false;
            }
        }
        //如果找到
        for (int i = 0; i < houseNum - 1; i++) {
            //这里是把要删除的房屋信息放在数组的最后一个
            houses[i] = houses[i+1];
        }
        //把当有存在的房屋信息的最后一个，设置为null;
        //--houseNum的意思是houseNum - 1，然后前移一位
        houses[--houseNum] = null;
        return true;
    }

    //新增房屋信息
    public boolean add(House newHouse) {
        //判断房屋的数量是否等于了数组的长度
        if (houseNum == houses.length) {
            System.out.println("数组已满");
            return false;
        }
        //把newHouse加入到数组中，房屋信息+1
        houses[houseNum++] = newHouse;
        //设计一个id自增的机制，然后更新newHouse的id
        newHouse.setId(++idCounter);
        return true;
    }

    //list列表，返回House
    public House[] list() {
        return houses;
    }
}
