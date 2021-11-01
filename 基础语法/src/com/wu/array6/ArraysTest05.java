package com.wu.array6;

import java.util.Arrays;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/12
 * @description 冒泡排序
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
/*
冒泡排序
快速排序
堆排序 归并排序

冒泡排序:
49 38 65 97 76 13 27 49 8个数 7大轮

38 49 65 76 13 27 49 97 第一趟 97
38 49 65 13 27 49 76 97 第二趟 76
38 49 13 27 49 65 76 97 第三趟 65
38 13 27 49 49 65 76 97 第四趟 49
13 27 38 49 49 65 76 97 第五趟 49
13 27 38 49 49 65 76 97 第六趟 38
13 27 38 49 49 65 76 97 第七趟 27
 */
public class ArraysTest05 {

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        sort(a);

        /*int temp = 0;
        int m = 3;
        int n = 4;
        temp = m;
        m = n;
        n = temp;

        System.out.println("m = "+m);
        System.out.println("n = "+n);*/
    }
    //public修饰符
    //int[] 返回值类型

    /**
     * @param arrays
     * @return
     */
    public static int[] sort(int arrays[]) {
        int temp = 0;
        /*
        5 4 3 2 1 5个数 4趟
        4 3 2 1 5第一趟
        3 2 1 4 5第二趟
        2 1 3 4 5第三趟
        1 2 3 4 5第四趟
         */
        for (int i = 0; i < arrays.length; i++) {//交换趟数
            System.out.println("第" + (i + 1) + "趟, 交换" + (arrays.length - i - 1) + "次");
            for (int j = 0; j < arrays.length - i - 1; j++) {//每趟交换次数 第一大轮交换数组length-1-i次 i = 0 4
                //每趟交换次数 第二大轮交换数组length-1-i次  i = 1 3
                //每趟交换次数 第三大轮交换数组length-1-i次  i = 2 2
                //每趟交换次数 第四大轮交换数组length-1-i次  i = 3 1
                if (arrays[j + 1] < arrays[j]) {
                    //两个数交换
                    //第一种 适用于任何类型
                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;

                    //第二种 只是用整形
                    //arrays[j] = arrays[j] + arrays[j + 1];
                    //arrays[j + 1] = arrays[j] - arrays[j + 1];
                    //arrays[j] = arrays[j] - arrays[j + 1];

                    //第三种 只是用整形
                    //arrays[j] = arrays[j] ^ arrays[j + 1];
                    //arrays[j + 1] = arrays[j] ^ arrays[j + 1];
                    //arrays[j] = arrays[j] ^ arrays[j + 1];
                }
                System.out.println(Arrays.toString(arrays));
            }
        }
        return arrays;
    }
}
