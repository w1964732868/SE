package com.wu.struct2;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/30
 * @description 能被多少整除 
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class ForPractice2 {
    public static void main(String[] args) {
        //1-1000之间能被5整除的数,并且每行输出3个
        //i%5==0
        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0) {//能被5整除的数
                System.out.print(i+"\t");//打tab建
            }
            if (i%(5*3)==0){//每行输出3个
                //System.out.println();
                System.out.println("\n");
            }
        }
    }
}
