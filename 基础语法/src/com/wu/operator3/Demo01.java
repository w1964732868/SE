package com.wu.operator3;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/29
 * @description 运算符 算术/关系/赋值/逻辑
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Demo01 {
    public static void main(String[] args) {
        //二元运算符 + - * / % > < == !=
        int a = 10;//赋值运算符 =
        int b = 20;
        int j = 21;
        //算术运算符 + - * / %
        System.out.println(a + b);//结果30
        System.out.println(a - b);//结果-20
        System.out.println(a * b);//结果200
        System.out.println(a / (double) b);//强转一下 结果0.5
        System.out.println(a / b);//四舍五入了 结果0
        System.out.println(j % a);//21/10=2...1 结果1 模运算

        //关系运算符> < == !=
        System.out.println(a > b);//结果false
        System.out.println(a < b);//结果true
        System.out.println(a == b);//结果false
        System.out.println(a != b);//结果true

        long c = 123123123123123L;
        int d = 123;

        short e = 10;
        byte f = 8;//127
        System.out.println(c + d + e + f);//结果:123123123123264 long
        System.out.println(d + e + f);//结果:141 int
        System.out.println(e + f);//结果:18 int
        System.out.println((double) e + f);//结果:18.0 double 强转

        //byte+short+int+long结果为long
        //byte+short+int结果为int
        //byte+short结果为int
        //cast转换

        //三元运算符 x ? y : z
        int score = 80;
        String s1 = score < 60 ? "不及格" : "及格";
        System.out.println(s1);//结果及格
        String s11 = 20 < 60 ? "不及格1" : "及格1";
        System.out.println(s11);//结果不及格1
        System.out.println("=======一元运算符======");
        //一元运算符  ++  --
        int m = 3;
        int m1 = m++;// 先赋值 在+  1.m1 = m(3);    2.m = m + 1;(3+1=4)
        int m2 = ++m;// 先+ 再赋值  1.m = m + 1;(4+1=5) 2.m2 = m(5)
        System.out.println(m);//结果5
        System.out.println(m);//结果5
        System.out.println(m1);//结果3
        System.out.println(m1);//结果3
        System.out.println(m2);//结果5
        System.out.println(m2);//结果5
        System.out.println("=======一元运算符======");
        int n = 5;
        int n1 = n--;// 先赋值 在-  1.n1 = n(5);    2.n = n - 1;(5-1=4)
        int n2 = --n;// 先- 再赋值  1.n = n - 1;(4-1=3) 2.n2 = n(3)
        System.out.println(n);//结果3
        System.out.println(n);//结果3
        System.out.println(n1);//结果5
        System.out.println(n1);//结果5
        System.out.println(n2);//结果3
        System.out.println(n2);//结果3

        //逻辑运算符 与&&  或||  非!
        boolean t = true;
        boolean s = false;
        System.out.println("t&&s:" + (t && s));//结果false  全true 才为true 短路运算
        System.out.println("t||s:" + (t || s));//结果true  一个true 就为true
        System.out.println("!(t&&s):" + !(t && s));//结果true
        int k = 5;
        boolean l = (k < 4) && (k++ < 4);
        System.out.println(l);//结果false
        System.out.println(k);//结果5  不为6说明没有执行k++

        //幂运算 Math工具类
        double pow = Math.pow(2, 3);//2^3=2*2*2=8
        System.out.println(pow);//结果8.0

        double pow1 = Math.pow(3, 2);//3^2=3*3=9
        System.out.println(pow1);//结果9.0
    }
}
