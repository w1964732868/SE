package com.wu.base1;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/28
 * @description 强制转换 自动转换
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Demo04 {
    public static void main(String[] args) {

//1B     2B        4B     8B 字节
        //byte/short/char->int->long->float->double
        int i = 128;
        byte b = (byte) i;//内存溢出  高->低  int->byte(最大127) -128~127
        //强制转换 (类型)变量名
        System.out.println(i);//结果:128
        System.out.println(b);//结果:-128

        //丢失精度
        System.out.println((int) 12.4);//12 截取操作
        System.out.println((int) 12.9);//12

        //没有精度损失
        long l1 = 123;
        short s = (short) l1;
        System.out.println(s);//123

        System.out.println("***************************");
        //自动转换
        int i1 = 128;
        double b1 = i;//低->高 int ->double
        System.out.println(i1);//结果:128
        System.out.println(b1);//结果:128.0
        int i2 = 128;
        long b2 = i;//低->高 int ->long
        System.out.println(i2);//结果:128
        System.out.println(b2);//结果:128


        /*注意点
        1.不能对布尔值进行转换
        2.不能把对象类型转为不相干的类型
        3.高->低 强制类型转换
          低->高 自动类型转换
        4.转换时 会出现 内存溢出 或 精度问题
         */

        System.out.println("=============");
        System.out.println((int) 23.7);//结果:23 精度问题    double -> int 强制类型转换
        System.out.println((int) -45.89f);//结果:-45 精度问题 float->int 强制类型转换
        System.out.println((int) 12.4);//12 截取操作
        System.out.println((int) 12.9);//12

        System.out.println("===================");
        char c = 'a';
        int d = c + 1; //char->int自动类型转换
        System.out.println(c);//结果:a //(97)
        System.out.println(d);//结果:98
        System.out.println((char) d);//int->char  强制类型转换 结果:b

        //1默认int
        byte by = 12;
        int i3 = by + 1;
        System.out.println(i3);//13

        int i4 = by + by;
        System.out.println(i4);//24
        //1.2默认double
        double v = by + 1.2;
        System.out.println(v);//13.2

    }
}
