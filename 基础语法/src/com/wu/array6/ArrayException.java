package com.wu.array6;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/11/1
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
/*
1.数组角标越界  ArrayIndexOutOfBoundsException
2.空指针异常 NullPointerException
 */
public class ArrayException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        /*
        System.out.println(arr[-2]);//java.lang.ArrayIndexOutOfBoundsException: -2
        //for (int i = 0; i <= arr.length; i++) {
        //    System.out.println(arr[i]);//java.lang.ArrayIndexOutOfBoundsException: 4
        //}
        System.out.println("hello");//上面报错 下面不会执行

         */

        /*
        1：
        arr = null;
        System.out.println(arr[1]);//java.lang.NullPointerException

        2：
        int[][] arr2 = new int[4][];
        System.out.println(arr[0]);//null
        System.out.println(arr2[0][0]);//java.lang.NullPointerException  外层都为null了

         */
        //3：
        String[] arr3 = new String[]{"AA", "BB"};
        System.out.println(arr3[0].toString());//AA
        arr3[0] = null;
        System.out.println(arr3[0].toString());//System.out.println(arr3[0].toString());//AA

    }
}


