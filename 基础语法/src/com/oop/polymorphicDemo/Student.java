package com.oop.polymorphicDemo;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/15
 * @description 子类  多态是对方法的  Father f1 = new Son();多态
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Student extends Person {
    //子类重写父类的方法
    //static方法、final方法、private方法  子类不能重写
    @Override
    public void run() {
        System.out.println("run");
    }

    public void eat() {
        System.out.println("eat");
    }

    /**
     * public class Application {
     *     public static void main(String[] args) {
     *         Student s1 = new Student();
     *         //s1.run();//father 现在只有父类有run方法 子类继承父类
     *         s1.run();//son 子类重写了父类的run方法
     *         s1.eat();//子类独有方法  父类没有此方法
     *
     *         //多态
     *         Person s2 = new Student();
     *         s2.run();//son 子类重写了父类的run方法
     *
     *         //多态
     *         Object s3 = new Student();
     *     }
     * }
     */
}
