package com.wu.scanner4;

import java.util.Scanner;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/30
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class ScannerTest4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数:");
        //要初始化
        int i = 0;
        double d = 0.0;


        //if双选结构
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("输出整数数据是:" + i);
        } else {
            System.out.println("输入的数据不是整数!");
        }

        System.out.println("请输入小数:");
        if (scanner.hasNextDouble()) {
            d = scanner.nextDouble();
            System.out.println("输出小数数据是:" + d);
        } else {
            System.out.println("输入的数据不是整数!");
        }

        scanner.close();
    }
}
