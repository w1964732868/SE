package com.wu.array6;

import java.util.Arrays;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/9
 * @description Arrays工具类 sort()、toString()、fill()
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class ArraysTest04 {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 9, 333, 66, 56, 90989};
        System.out.println(a);//[I@68f7aae2 对象
        Arrays.sort(a);//排序
        System.out.println(Arrays.toString(a));//数组输出 [2, 4, 6, 9, 56, 66, 333, 90989]

        //Arrays.fill(a, 0);//填充为0
        //System.out.println(Arrays.toString(a));//数组输出[0, 0, 0, 0, 0, 0, 0, 0]

        Arrays.fill(a, 2, 4, 0);
        System.out.println(Arrays.toString(a));//数组输出[2, 4, 0, 0, 56, 66, 333, 90989] [) 数组下标2包含   4不包含

        System.out.println(Arrays.asList(a));//[[I@68f7aae2]
        System.out.println(Arrays.toString(a));//[2, 4, 0, 0, 56, 66, 333, 90989]
    }
}
