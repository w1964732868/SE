package com.wu.base1;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/28
 * @description 变量要初始化  ==java强类型语言==  基本/引用数据类型 默认值
 * 数据类型 变量名 = 变量值； 赋值
 * <p>
 * 基本数据类型变量间转换
 * 1）short s = 5;
 * s = s-2; //判断：no  应为int
 * 2） byte b = 3;
 * b = b + 4; //判断：no  应为int
 * b = (byte)(b+4); //判断：yes 强转了
 * 3）char c = 'a';
 * int i = 5;
 * float d = .314F;
 * double result = c+i+d; //判断：yes
 * 4） byte b = 5;
 * short s = 3;
 * short t = s + b; //判断：no 应为int
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
//============8种基本数据类型 与String直接的转换  连接
        String a = "hello";
        int num = 10;
        System.out.println(a);//hello
        System.out.println(num);//10
        String s = a + num;
        System.out.println(s);//hello10
        String s1 = num + a;
        System.out.println(s1);//10hello

        char c = 'a';//97 A65
        int num11 = 10;
        String str = "hello";
        System.out.println(c + num11 + str);//107hello
        System.out.println(c + str + num11);//ahello10
        System.out.println(c + (num11 + str));//a10hello
        System.out.println((c + num11) + str);//107hello
        System.out.println(str + num11 + c);//hello10a

        System.out.println("*    *");//*    *
        System.out.println('*' + '\t' + '*');//93
        System.out.println('*' + "\t" + '*');//*    *
        System.out.println('*' + '\t' + "*");//51*
        System.out.println('*' + ('\t' + "*"));//*  *

        System.out.println("********");
        //String str3 = 4; //判断对错：no
        //int->String
        String str4 = 4 + ""; //判断对错：yes int->String
        System.out.println(str4); //4 String
        //String->int
        int i = Integer.parseInt(str4);
        System.out.println(i);//4 int

        // String->Integer
        Integer integer = Integer.valueOf(str4);
        System.out.println(integer);//4 Integer
        //Integer->String
        String s2 = String.valueOf(integer);
        System.out.println(s2);//4 String
        System.out.println("********");

        String str2 = 3.5f + ""; //判断str2对错：yes
        System.out.println(str2); //输出：”3.5” String
        System.out.println(3 + 4 + "Hello !"); //输出：7Hello!
        System.out.println("Hello !" + 3 + 4); //输出：Hello!34
        System.out.println('a' + 1 + "Hello !"); //输出：98Hello!
        System.out.println("Hello" + 'a' + 1); //输出：Helloa1


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
        //2^8=128/2^16/2^32/2^64
        //byte-2^7~2^7-1=-128~127

        //     小数 float/double
        //     单精度/双精度
        //     4字节/8字节

        //文字 char

        //是否 boolean

        //整数类型 int常用
        int num1 = 10; //常用
        byte num2 = 20;
        short num3 = 30;
        long num4 = 40L;//L区分


        //浮点类型 小数  double常用  金额BigDecimal
        float num5 = 50.1f;//f/F结尾
        double num6 = 3.14159265358;

        //字符型 文字 字符 字母、数字、字和符号
        char name = 'A';
        //2个字节  16位  2^16
        //char name2 = '中国'; 应该是一个字
        //String字符串不是关键字是个(类)

        //布尔型 是否
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
