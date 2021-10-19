package com.wu.struct2;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/30
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class WhileTest {
    public static void main(String[] args) {
        //输出1-10
        int num = 0;
        System.out.println("=========while=========");//先判断 后执行
        while (num < 10) {//num>=10就失效了
            num++;
            System.out.println(num);
        }

        //1-100和
        int j = 0; //初始化值
        int sum1 = 0;
        while (j <= 100) {//布尔表达式 条件判断
            //循环体
            sum1 = sum1 + j;
            j++;//更新==迭代
            //(j+=2;//迭代)
        }
        System.out.println("sum1:" + sum1);

        System.out.println("=========do...while=========");//先执行 后判断 最少执行一次
        int m = 0;
        int n = 0;
        do {
            m += n;
            n++;
        } while (n <= 100);
        System.out.println("m=" + m);
        System.out.println("=========for=========");
        //输出1-10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //1-100和
        int sum = 0;
        //(初始化值,布尔表达式,更新)
        //(可空,true(循环体被执行)(false循环体不被执行),循环体执行完 迭代更新)
        for (int i = 1; i <= 100; i++) {
            //System.out.println(i);
            sum += i;
        }
        System.out.println("sum:" + sum);

    }
}
