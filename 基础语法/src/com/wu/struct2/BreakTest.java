package com.wu.struct2;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/30
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class BreakTest {
    public static void main(String[] args) {
        int num = 0;
        while (num < 100) {
            num++;
            if (num == 10) {
                break;
            }
            System.out.println(num);
        }
        System.out.println("break测试");

        System.out.println("=========================");

        int size = 0;
        while (size < 100) {
            size++;
            if (size % 10 == 0) {
                System.out.println();//一旦等于10 就不输出10 继续下一个
                continue;
            }
            System.out.print(size + "\t");
        }
        System.out.println("continue测试");
    }
}
