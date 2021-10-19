package com.oop.staticTest;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/15
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Student {
    private static int age;//静态变量
    private double score;//非静态变量

    public void run() {
        go();//非静态方法 可以调用静态方法
        System.out.println("run");
    }

    public static void go() {//静态方法能调静态方法，不能调用非静态方法。要调用非静态方法，用类实例
        System.out.println("go");
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.score);//0.0

        System.out.println(s1.age);//0
        System.out.println(Student.age);//0 建议这种

        go();//go 直接调用static方法
        Student.go();//go 直接调用static方法
        s1.run();// run类实例.方法名() 访问 要调用非静态方法，用类实例
    }
}
