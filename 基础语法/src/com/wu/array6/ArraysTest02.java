package com.wu.array6;

import java.util.Scanner;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/9
 * @description 静态初始化数组  静态初始化数组
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class ArraysTest02 {
    public static void main(String[] args) {
        //静态初始化 创建+赋值
        //栈 基本数据类型
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(a[0]);
        System.out.println("=====================");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);//数据遍历
        }
        //堆  引用数据类型
        Scanner[] scanner = {new Scanner(System.in), new Scanner(System.in)};
        System.out.println("=====================");


        //动态初始化  包含默认初始化
        //堆
        int[] b = new int[10];
        b[0] = 10;//是对象的成员变量
        System.out.println(b[0]);
        System.out.println(b[1]);
    }
}
