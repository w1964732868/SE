package com.wu.array6;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/13
 * @description 稀疏数组
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class ArraysTest06 {
    public static void main(String[] args) {
        int[][] arrays = new int[5][5];
        arrays[1][2] = 1;
        arrays[2][3] = 2;

        int count = 0;
        //遍历二维数组
        for (int[] ints : arrays) {//遍历行
            for (int anInt : ints) {//ints第一行 列的值
                if (anInt != 0) {
                    count++;
                }
                System.out.print(anInt + "\t");//每行
            }
            System.out.println();
        }
        System.out.println("==========稀疏数组==========");
        int[][] arrayList = new int[count + 1][3];//+的1是多一行
        arrayList[0][0] = 5;
        arrayList[0][1] = 5;
        arrayList[0][2] = count;

        int arrayNum = 1;
        for (int i = 0; i < arrays.length; i++) {//需要知道下标的
            for (int j = 0; j < arrays.length - 1; j++) {
                if (arrays[i][j] != 0) {
                    arrayList[arrayNum][0] = i;
                    arrayList[arrayNum][1] = j;
                    arrayList[arrayNum][2] = arrays[i][j];
                    arrayNum++;
                }
            }
        }

        for (int[] ints : arrayList) {//遍历行
            for (int anInt : ints) {//ints第一行
                if (anInt != 0) {
                    count++;
                }
                System.out.print(anInt + "\t");//每行
            }
            System.out.println();
        }

        System.out.println("==========稀疏数组解析==========");
        int[][] arrayLists = new int[arrayList[0][0]][arrayList[0][1]];
        arrayLists[arrayList[1][0]][arrayList[1][1]] = arrayList[1][2];
        arrayLists[arrayList[2][0]][arrayList[2][1]] = arrayList[2][2];

        for (int[] ints : arrayLists) {//遍历行
            for (int anInt : ints) {//ints第一行
                if (anInt != 0) {
                    count++;
                }
                System.out.print(anInt + "\t");//每行
            }
            System.out.println();
        }

    }

    /**
     * 结果
     *
     * 0	0	0	0	0
     * 0	0	1	0	0
     * 0	0	0	2	0
     * 0	0	0	0	0
     * 0	0	0	0	0
     * ==========稀疏数组==========
     * 5	5	2
     * 1	2	1
     * 2	3	2
     * ==========稀疏数组解析==========
     * 0	0	0	0	0
     * 0	0	1	0	0
     * 0	0	0	2	0
     * 0	0	0	0	0
     * 0	0	0	0	0
     */
}
