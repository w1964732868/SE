package com.wu.scanner4;

import java.util.Scanner;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/30
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class ScannerTest1 {
    public static void main(String[] args) {
        //开始
        Scanner scanner = new Scanner(System.in);

        //从键盘接收数据
        System.out.println("请输入内容:");//Hello World!
        //判断有没有输入  没有输入时,一直运行着
        if (scanner.hasNext()) {
            String next = scanner.next();//程序会等待用户输入完毕
            System.out.println("输出内容:" + next);//结果Hello
        }

        //用完要关闭
        scanner.close();
    }
}
