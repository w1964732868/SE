package com.wu.method5;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/9
 * @description 可变长参数
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class MethodTest02 {
    public static void main(String[] args) {
        //main方法是static的 test方法不是  要访问test方法 第一种给test方法加static
        //    第二种用对象访问
        MethodTest02 methodTest02 = new MethodTest02();
        //methodTest02.test(3);//结果3
        methodTest02.test(3, 4, 59, 3);//结果3 4 59 3
    }

    //可变参数 多个int
    public void test(int... i) {
        System.out.println(i[0]);//输出第一个i的值
        System.out.println(i[1]);//输出第二个i的值
        System.out.println(i[2]);//输出第三个i的值
        System.out.println(i[3]);//输出第四个i的值

    }
}
