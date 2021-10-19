package com.wu.struct2;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/30
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class ForPractice {
    public static void main(String[] args) {
        //定义偶数变量
        int sumEven = 0;
        for (int i = 1; i <= 4; i++) {
            //sumEven += (2 * i); 转偶数了
        }
        System.out.println("1-100偶数和" + sumEven);//20


        //定义奇数变量
        int sunOdd = 0;
        for (int i = 1; i <= 4; i++) {
            //sunOdd += (2 * i - 1);转奇数了
        }
        System.out.println("1-100奇数和" + sunOdd);//16

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {//奇数
                sunOdd += i;
            } else {//偶数
                sumEven += i;
            }
        }
        System.out.println("1-100偶数的数目" + sumEven);//2550
        System.out.println("1-100奇数的数目" + sunOdd);//2500
        //5050
    }
}
