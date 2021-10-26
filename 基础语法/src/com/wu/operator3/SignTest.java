package com.wu.operator3;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/26
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class SignTest {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print("i=" + i + "\t");//10
        System.out.println("i1=" + i1);//11
        i = ++i1;
        System.out.print("i=" + i + "\t");//12
        System.out.println("i1=" + i1);//12
        i = i2--;
        System.out.print("i=" + i + "\t");//20
        System.out.println("i2=" + i2);//19
        i = --i2;
        System.out.print("i=" + i + "\t");//18
        System.out.println("i2=" + i2);//18

        int num = 187;
        int bai = num / 100;//1
        int shi = num % 100 / 10;//8
        int ge = num % 10;//7


        int a = 1;
        a *= 0.1;//不会改变变量的数据类型 0.1
        System.out.println(a);//0
        a++;//a不管先+或先赋值都是要加1的
        System.out.println(a);//1

        int n = 10;
        n += (n++) + (++n);//n = n+(n++)+(++n) = 10+10+12
        System.out.println(n);//32


        int m1 = 2;
        int n1 = 3;
        n1 *= m1++;//n1 = n1 * m1++ = 3*2
        System.out.println("m1=" + m1);//3
        System.out.println("n1=" + n1);//6
    }
}
