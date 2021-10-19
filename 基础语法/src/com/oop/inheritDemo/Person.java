package com.oop.inheritDemo;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/14
 * @description 所有类都默认直接或间接继承Object类
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Person {
    public int money = 10_0000_0000;

    public void say() {
        System.out.println("说了一句话");
    }

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    /**
     * public class Application {
     *     public static void main(String[] args) {
     *         Student student = new Student();
     *         System.out.println(student.money);//1000000000 public
     *         student.say();//说了一句话  public
     *
     *         student.setSex("男"); //private
     *         System.out.println(student.getSex());//男
     *
     *         Tearcher tearcher = new Tearcher();
     *         System.out.println(tearcher.money);//1000000000
     *         tearcher.say();//说了一句话
     *
     *         tearcher.setSex("女");
     *         System.out.println(tearcher.getSex());//女
     *     }
     * }
     */
}
