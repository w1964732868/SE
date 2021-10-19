package com.wu.base1;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/29
 * @description 变量作用域
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Demo08 {
    //属性

    //类变量
    //=是赋值运算符  2500赋值给salary
    static double salary = 2500; //自动int->double

    //实例变量:从属于类 可以不初始化  成员变量 名字见名知意
    String name;//驼峰
    int age;

    //常量 修饰符不存在先后顺序
    final static double PI = 3.14;
    static final double PI1 = 3.14;


    //mian 方法
    public static void main(String[] args) {
        //局部变量:必须声明和初始化 仅在main这个方面内 有效
        int num = 10;//要初始化 驼峰
        System.out.println(num);//结果:10

        //变量类型 变量名 = new Demo08();
        Demo08 demo08 = new Demo08();
        System.out.println(demo08.age);//有一个默认初始值 0  结果:0
        System.out.println(demo08.name);//有一个默认初始值 null  除了基本类型 其他默认值均为null 结果:null
        //类变量
        System.out.println(salary);//带static 可以直接输出  结果:2500.0

        //常量
        System.out.println(PI);//结果:3.14
        System.out.println(PI1);//结果:3.14
    }

    //其他方法 驼峰
    public void addData() {

    }
}
