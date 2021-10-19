package com.oop.superThisOverrideTest;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/14
 * this()、super() 不能同时用在构造方法
 * @description  要是写了 有参构造 无参构造也必须写
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Student extends Person {
    private String name = "huijie";

    public Student() {
        //要么调用父类 要么调用子类 this("小") super() 必须放在子类构造器的第一行
        //super();//相当于隐藏了这行代码 必须放在第一行 Person无参构造  this("小")
        this("小");
        System.out.println("Student无参构造");//Student无参构造
    }

    public Student(String name) {
        this.name = name;
    }

    public void test(String name) {
        System.out.println(name);//hj 自己传入的
        System.out.println(this.name);//huijie 本类的
        System.out.println(super.name);//父类的
    }

    @Override
    public void print() {
        System.out.println("Student方法");
    }

    public void test1() {
        print();//Student方法
        this.print();//Student方法
        super.print();//Person方法
    }
    /**
     * public class Application {
     *     public static void main(String[] args) {
     *         Student student = new Student();
     *         student.test("hj");//hj
     *                            //huijie
     *                            //会杰
     *
     *         student.test1();//Student方法
     *                         //Student方法
     *                         //Person方法
     *     }
     * }
     *
     *
     * 结果
     * Person无参构造
     * Student无参构造
     * hj
     * huijie
     * 会杰
     * Student方法
     * Student方法
     * Person方法
     *
     *
     * 加this("小");
     * Person无参构造
     * Student无参构造
     * hj
     * 小
     * 会杰
     * Student方法
     * Student方法
     * Person方法
     */
}
