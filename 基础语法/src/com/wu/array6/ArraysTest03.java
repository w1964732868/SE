package com.wu.array6;

import java.util.Scanner;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/9
 * @description 二维数组
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class ArraysTest03 {
    public static void main(String[] args) {
        /**
         * arrays[4][2]  4行2列的数组
         * {1, 2}  arrays[0]
         * {2, 3}  arrays[1]
         * {3, 4}  arrays[2]
         * {4, 5}  arrays[3]
         *
         *
         * 结果：
         * 1 2
         * 2 3
         * 3 4
         * 4 5
         *
         * 4行2列的 数组
         */
        int[][] arrays = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int length = arrays.length;//这个是外面大数组的length 4
        //arrays[i].length这个小数组  2
        for (int i = 0; i < arrays.length; i++) {//行
            for (int j = 0; j < arrays[i].length; j++) {//列
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }
}
