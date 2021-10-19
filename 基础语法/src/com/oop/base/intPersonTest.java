package com.oop.base;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/13
 * @description java是值传递   值传递、引用传递
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class intPersonTest {
    public static void main(String[] args) {
        System.out.println("====值传递====");
        int a = 1;
        System.out.println(a);//1

        intPersonTest.change(a);
        System.out.println(a);//1
        System.out.println("====引用传递====");

        Person person = new Person();
        System.out.println(person.name);//huijie

        intPersonTest.change(person);
        System.out.println(person.name);//引用
    }

    //重载  参数的个数或种类 不一样
    public static void change(int a) {
        a = 10;
    }

    public static void change(Person person) {
        person.name = "引用";
    }
}

//内部类 一个Java类中可以有多个class类 但只有一个 public class类
class Person {//类默认有一个无参构造
    String name;

    //构造方法
    //构造器初始值  使用new关键字，必须要有构造器 (本质是调用构造器)
    public Person() {
        //this.name是对象本身的name
        this.name = "huijie";
    }

    //一旦 定义了 有参构造  无参构造也要有

    /**
     * ====值传递====
     * 1
     * 1
     * ====引用传递====
     * huijie
     * 引用
     */
}
