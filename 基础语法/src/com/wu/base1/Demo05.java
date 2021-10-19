package com.wu.base1;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/29
 * @description 数据类型转换
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Demo05 {
    public static void main(String[] args) {
        int money1 = 1000000000;//10亿
        int money = 10_0000_0000;//10亿 jdk7新特性
        System.out.println(money1);//结果:1000000000
        System.out.println(money);//结果:1000000000

        int year = 20;
        int total = year * money;
        System.out.println(total);//结果:-1474836480 内存溢出了

        long total1 = year * money;//先计算 后转换为long 转换前已经存在问题了
        System.out.println(total1);//结果:-1474836480 内存溢出了

        long total3 = ((long)year) * money;
        System.out.println(total3);//结果:20000000000 20亿

        //L(用大写) l
    }
}
