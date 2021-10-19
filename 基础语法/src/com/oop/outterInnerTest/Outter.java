package com.oop.outterInnerTest;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/15
 * @description 成员内部类  静态内部类  匿名内部类 局部内部类
 * 思想 操作
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Outter {
    private int id = 10;

    public void out() {
        System.out.println("out");
    }

    public void method() {
        //局部内部类
        class InnerTest {

        }
    }

    //成员内部类  静态内部类static
    class Inner {
        public void in() {
            System.out.println("in");
        }

        public void getId() {
            System.out.println(id);//内部类访问外部类的私有属性、私有方法
        }
    }

    public static void main(String[] args) {
        Outter outter = new Outter();

        Inner inner = outter.new Inner();
        inner.in();//in

        inner.getId();//10

        //匿名对象的使用 不用把实例保存到变量中
        new Apple().eat();//eat 匿名内部类  没有名字去初始化类

        //匿名内部类
        new UserService() {

            //实现
            //重写
            @Override
            public void hello() {

            }
        };

    }
}

//内部类 一个Java类中可以有多个class类 但只有一个 public class类
class Apple {
    public void eat() {
        System.out.println("eat");
    }
}

interface UserService {
    void hello();
}