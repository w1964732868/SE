package com.wu.struct2;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/30
 * @description for增强
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class ForPractice4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        for (int number : numbers) {//number为数组的值 没有返回下标
            //System.out.print(number + "\t");
            System.out.println(number);
        }
        System.out.println("============");

        String str = "ABC";
        int a = str.charAt(0);
        System.out.println(a);//65

        //System.out.println(Math.random());
        //[20,99]
        int value = (int) ((Math.random() * 80) + 20);
        System.out.println(value);


        //System.out.println((Math.random() * (b - a + 1)) + a);//b-a+1+a = b+1
        //[a, b]
    }
}
