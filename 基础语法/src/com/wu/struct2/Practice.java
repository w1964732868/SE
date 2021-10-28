package com.wu.struct2;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/30
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Practice {
    public static void main(String[] args) {
        /**
         *      *
         *     ***
         *    *****
         *   *******
         *  *********
         */
        //i行
        //j每行个数
        for (int i = 1; i <= 5; i++) { //行
            //for (int j = 5; j >= i; j--) {//第一行5个 第二行4
            for (int j = 1; j <= 5 - i; j++) {//效果跟上面一样 (i + j = 5) (j = 5 - i)
                System.out.print(" ");
                /**
                 * *****
                 * ****
                 * ***
                 * **
                 * *
                 */
            }
            for (int j = 1; j <= i; j++) {//第一行1个 第二行2
                System.out.print("*");
                /**
                 *      *
                 *     **
                 *    ***
                 *   ****
                 *  *****
                 */
            }
            for (int j = 1; j < i; j++) {//j < i //第一行0个 第二行1
                System.out.print("*");
                /**
                 *
                 *       *
                 *       **
                 *       ***
                 *       ****
                 */
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < 4; i++) { //控制 行数 外层循环
            //start  想让这个出现几次 ：4次
            for (int j = 0; j < 6; j++) { //控制 列数 内层循环
                System.out.print('*');
            }
            System.out.println();
            //end
        }
    }
}
