package com.oop.demo1;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/13
 * @description 类 中只存在属性和方法
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Student {
    //属性:字段
    public String name;//要写public修饰符
    public int age;

    //构造方法  重载
    public Student() {
        this.name = "会杰";
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //方法
    public void study() {
        System.out.println(this.name + "在学习");//this代表当前这个
    }

    /**
     * public class Application {
     *     public static void main(String[] args) {
     *         //类是 抽象的  需要实例化 new
     *         //
     *         Student xiaoMing = new Student();
     *         Student xiaoHong = new Student();
     *
     *         System.out.print(xiaoMing.name + "\t");//会杰
     *         System.out.println(xiaoMing.age);//0
     *
     *         xiaoMing.name = "小明";
     *         xiaoMing.age = 3;
     *
     *         System.out.print(xiaoMing.name + "\t");//小明
     *         System.out.println(xiaoMing.age);//3
     *
     *
     *         xiaoHong.name = "小红";
     *         xiaoHong.age = 4;
     *
     *         System.out.print(xiaoHong.name + "\t");//小红
     *         System.out.println(xiaoHong.age);//4
     *
     *     }
     * }
     */
}
