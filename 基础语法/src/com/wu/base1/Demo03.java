package com.wu.base1;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/28
 * @description 数据类型拓展
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Demo03 {
    public static void main(String[] args) {
        //1、整数拓展 进制：  二进制0b 十进制 八进制0 十六进制0x
        int i1 = 1010;
        int i2 = 10;//----------
        int i3 = 010;
        int i4 = 0x10;//0~9 A(10)~F(16)

        System.out.println(i1);//结果:1010
        System.out.println(i2);//结果:10
        System.out.println(i3);//结果:8
        System.out.println(i4);//结果:16

        System.out.println("=============================================");
        //2、浮点数拓展 小数 银行业务钱怎么表示 float/double是有问题的  有限 离散 舍入误差 大约 接近但不等于
        //最好完全避免使用浮点型进行比较 用BigDecimal类 //----------
        float f = 0.1f; //0.1
        double d = 1.0 / 10;//0.1
        System.out.println(f == d);//结果:false
        System.out.println(f);//结果:0.1
        System.out.println(d);//结果:0.1


        float f1 = 23131313131313113131f;
        float f2 = f1 + 1;
        System.out.println(f1 == f2);//结果:true

        System.out.println("=====================");
        //3、字符拓展 所有字符本质还是数字 unicode编码占2个字节~65536个字节
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);//结果:a
        System.out.println((int) c1);//结果:97 强制转换 可以  A(65)

        System.out.println(c2);//结果:中
        System.out.println((int) c2);//结果:20013

        //U000~UFFF
        char c3 = '\u0061';
        System.out.println(c3);//结果:a '\u0000'默认值 是空白符
        System.out.println("====================");
        //4、转义字符
        //\t(Tab、制表符) //----------
        //\n换行         //----------
        System.out.println("Hello\tWorld");//结果:Hello	World
        System.out.println("Hello\nWorld");
        //结果:
        //Hello
        //World

        System.out.println("====================");
        //5、从内存分析  //----------
        String hello_world = new String("Hello World");
        String helloWorld = new String("Hello World");
        System.out.println(hello_world == helloWorld);//结果:false

        String hello_world1 = "Hello World";
        String helloWorld1 = "Hello World";
        System.out.println(hello_world1 == helloWorld1);//结果:true

        //6、布尔值扩展
        boolean flag = true; //----------
        if (flag) {//判断为true 这样写  代码要精简 易读
        }
    }
}
