package com.wu.scanner4;

import java.util.Scanner;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/30
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class ScannerTest5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入多个数字进行求和:");
        //和 初始化
        double sum = 0.0;
        //总数 初始化
        int num = 0;

        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            num = num + 1;//num ++;
            sum = sum + x;//sum += x;
            System.out.println("你输入了第" + num + "个数据,当前输入的值为:" + x + "当前的总和为" + sum);
        }
        System.out.println("总和:" + sum);//总和:100.0
        System.out.println("平均数:" + sum / num);//平均数:25.0
        scanner.close();

        //请输入多个数字进行求和:
        //10
        //你输入了第1个数据,当前输入的值为:10.0当前的总和为10.0
        //20
        //你输入了第2个数据,当前输入的值为:20.0当前的总和为30.0
        //30
        //你输入了第3个数据,当前输入的值为:30.0当前的总和为60.0
        //40
        //你输入了第4个数据,当前输入的值为:40.0当前的总和为100.0
        //X
        //总和:100.0
        //平均数:25.0
    }
}
