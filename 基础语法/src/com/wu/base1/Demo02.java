package com.wu.base1;

import java.util.List;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/28
 * @description 变量要初始化  ==java强类型语言==  基本/引用数据类型 默认值
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Demo02 {

    //成员变量 实例变量
    //8大基本数据类型
    private boolean bool;
    private byte bt;
    private short st;
    private char ch;
    private int i;
    private long l;
    private float f;
    private double d;

    //引用类型变量
    //引用数据类型 默认值均为null
    //类
    private String str;
    private static String depart;
    //接口
    private List<String> list;
    //数组
    private String[] keys;

    public static void main(String[] args) {
        //在方法里面的变量 是局部变量
        //a要初始化 局部变量一定要初始化 成员变量可以不要初始化
        String a = "hello";
        int num = 10;
        System.out.println(a);
        System.out.println(num);

        //1个字节byte(B)   8位bit(b)
        //1B = 8byte
        //1024B = 1KB
        //1024KB = 1M兆
        //1024M = 1G
        //1024G = 1TB


        //8个基本数据类型
        //数字  整数 byte/short/int/long
        //1字节/2字节/4字节/8字节  B
        //8位/16位/32位/64位      b
        //     小数 float/double
        //文字 char
        //是否 boolean

        //整数
        int num1 = 10; //常用
        byte num2 = 20;
        short num3 = 30;
        long num4 = 40L;//L区分


        //小数
        float num5 = 50.1f;
        double num6 = 3.14159265358;

        //文字 字符 字母、数字、字和符号
        char name = 'A';
        //char name2 = '中国'; 应该是一个字
        //String字符串不是关键字是个(类)

        //是否
        boolean flag = true;


        //引用数据类型
        //类 接口 数组等
        //String就是个类 Byte Short Integer Long Float Double Character Boolean包装类 也是类


        System.out.println("===========================");
        final String design = "初始化";//局部变量一定要初始化
        final String designTest = null;//要初始化
        int size = 10;//要初始化
        Demo02 demo02 = new Demo02();//初始化对象
        //8个基本数据类型
        System.out.println("===========8个基本数据类型================");
        System.out.println(demo02.bt);//默认值是0
        System.out.println(demo02.st);//默认值是0
        System.out.println(demo02.i);//默认是0
        System.out.println(demo02.l);//默认是0

        System.out.println(demo02.f);//默认是0.0
        System.out.println(demo02.d);//默认是0.0

        System.out.println(demo02.ch);//默认值是空字符（'\u0000'）

        System.out.println(demo02.bool);//默认值是false

        System.out.println("===========引用数据类型================");
        //引用数据类型   除了基本类型 其他默认值均为null
        //接口
        System.out.println(demo02.list);//null

        //数组
        System.out.println(demo02.keys);//null

        //引用类型变量 类  类名.静态变量名
        System.out.println(demo02.str);//默认是null 引用类型变量
        System.out.println(Demo02.depart); //引用类型静态变量 null

        System.out.println("===========================");
        System.out.println(design);//初始化
        System.out.println(designTest);//null
        System.out.println(size);//10

    }

}
