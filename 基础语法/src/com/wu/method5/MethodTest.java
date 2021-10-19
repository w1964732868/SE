package com.wu.method5;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/30
 * @description 方法定义
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class MethodTest {
    //main方法
    public static void main(String[] args) {
        //实参
        int sum = add(1, 2);
        System.out.println(sum);//3
    }

    /**
     * 修饰符 返回值类型 方法名(方法形式参数){
     * //方法体
     * return 返回值；
     * }
     */

    //访问修饰符 返回值类型 方法名 (形参1, 形参2)
    //访问修饰符 返回值类型 方法名 (形参类型 形参名字1, 形参类型 形参名字12)
    //加static 可以在main 里面调用
    public static int add(int a, int b) {
        return a + b;
    }

    //10/13
    public void hello() {
        //return代表结束结束
        //return结束结束,返回一个结果
        return;//可以默认不写 写的话 直接return;
    }

    //10/13
    public int max(int a, int b) {
        return a > b ? a : b;//三元运算符
    }
}
