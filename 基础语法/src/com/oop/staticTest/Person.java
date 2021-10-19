package com.oop.staticTest;
import static java.lang.Math.random;//静态导入包
import static java.lang.Math.PI;//静态导入包
/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/15
 * @description  final修饰的类，不能被继承，断子绝孙
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Person {
    //2
    {
        System.out.println("匿名代码块");
    }

    //1.且执行一次
    static {
        System.out.println("静态代码块");
    }

    //3
    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("===========");
        Person person1 = new Person();
        System.out.println("===========");
        System.out.println(Math.random());
        System.out.println(random());
        System.out.println(PI);
    }

    /**
     * 结果:
     * 静态代码块
     * 匿名代码块
     * 构造方法
     * ===========
     * 匿名代码块
     * 构造方法
     * ===========
     * 0.00870356085559798 随机数 每次都不一样
     * 0.5386898700026943 随机数 每次都不一样
     * 3.141592653589793
     */
}
