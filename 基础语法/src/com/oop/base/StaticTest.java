package com.oop.base;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/13
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class StaticTest {
    public static void main(String[] args) {
        StaticTest test = new StaticTest();
        test.b();

    }

    //static 跟类一起加载  类存在 静态方法a就存在了
    public static void a() {
        //b();//一个存在的a()调用一个没存在b()  所以错误
        c();
    }

    //StaticTest类 对象存在时 才存在
    public void b() {

    }

    public static void c() {

    }
}

