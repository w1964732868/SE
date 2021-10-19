package com.wu.struct2;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/18
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class ReturnTest {
    public static void main(String[] args) {
        int i;
        System.out.println("return语句之前"+getInfo());
        for (i = 0; i < 5; i++) {
            getInfo1(i);
        }
        //return 之后的语句将不会被执行
        System.out.println("return语句之后"+getInfo());
    }
    public static int getInfo(){
        return 1;//有返回类型，返回方法指定类型的返回值

    }
    public static void getInfo1(int i){
        if(i==3){
            System.out.println("i==3, return");
            return;
        }
        System.out.println("i==" + i);//return 之后的语句将不会被执行
    }

    /*
    结果：
    return语句之前1
    i==0
    i==1
    i==2
    i==3, return
    i==4
    return语句之后1
     */
}
