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
            for (int j = 5; j >= i; j--) {//第一行5个 第二行4
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
    }
}
