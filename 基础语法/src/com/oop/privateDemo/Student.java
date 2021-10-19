package com.oop.privateDemo;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/14
 * @description 封装   私有get/set  private修饰的不能通过 对象名.属性名 赋值了 public可以
 *                                 private修饰的 能通过  对象名.setXXX() 赋值
 *              封装作用：提高安全性，保护数据、隐藏实现细节、统一接口、可维护性增加
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }
    /**
     * public class Application {
     *     public static void main(String[] args) {
     *         //类是 抽象的  需要实例化 new
     *         Student s1 = new Student();
     *         //s1.age = 1;//private修饰的属性 不能这样赋值
     *         s1.setAge(999);//不合法
     *         System.out.println(s1.getAge());
     *     }
     * }
     */
}

