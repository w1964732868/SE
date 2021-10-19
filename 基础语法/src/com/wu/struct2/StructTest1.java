package com.wu.struct2;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/30
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class StructTest1 {
    public static void main(String[] args) {
        //顺序结构 1 2 3
        System.out.println("helloWorld1");
        System.out.println("helloWorld2");
        System.out.println("helloWorld3");
        //选择结构
        //if单选结构
        if (true) {
            System.out.println("true");
        }
        //if双选结构
        if (true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        //if多选结构 还有switch也是对选结构
        int a = 10;
        if (a > 1 && a < 10) {
            System.out.println("a=" + a);
        } else if (a >= 10) {
            System.out.println("a=" + a);
        }else {

        }

        //if嵌套

        //从0-100中找到45这个数
        //0-50  50-100
        //45<50  45>=50&& 45<100
        //这样就好找了 跟算法有关
    }
}
