package com.wu.operator3;


/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/29
 * @description 位运算(左移变大 * 2 右移变小 / 2) 拓展运算符
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * <p>
 * 2*8 (2<<3) (8<<1)
 **/
public class Demo02 {

    /**
     * 主入口
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
        & 与  全为1 才为1
        | 或  一个1 直接为1
        ^异或 两个相同为0 不同为1
        ~取反 0变1  1变为0

        A = 0011 1100
        B = 0000 1101
        A&B = 0000 1100
        A|B = 0011 1101
        A^B = 0011 0001
        ~B = 1111 0010

         2*8 = 16 2*2*2*2 = 16
         <<左移 0000 0010(2)
                0001 0000(16)2左移3位变16 乘2
         >>右移
              0001 0000(16)
              0000 0010(2)16右移3位变2    除2

              *2
              0001   1
              0010   1*2
              0100   1*2*2
              1000   1*2*2*2

              /2
              1000   2*2*2*2
              0100   2*2*2
              0010   2*2
              0001   2
         */

        System.out.println(2 << 3);//结果16
        System.out.println(16 >> 3);//结果2

        //拓展运算符 += -=
        int a = 10;
        int b = 20;

        //字符串连接符
        System.out.println("" + a + b);//结果1020 字符串连接符
        System.out.println(a + b + "");//结果30


        a += b;

        System.out.println(a);//结果30


        int c = 10;
        int d = 20;
        c -= d;
        System.out.println(c);//结果-10


        char c4 = '5';
        int i1 = (int) c4;
        System.out.println(i1);//53
        /*
         ascii码
        0011 0101   Bin(二进制)
        065        Oct(八进制)
        53         Dec(十进制)
        0x35       Hex(十六进制)
        5
       字符5

         */


        int m1 = 20;
        int m2 = 20;
        int c2 = (m1 != m2) ? m1 : m2;
        //int c2 = m1; 多想想
        System.out.println(c2);

    }
}
