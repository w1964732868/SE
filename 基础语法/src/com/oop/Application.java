package com.oop;


import com.oop.instanceofTest.Person;
import com.oop.instanceofTest.Student;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/13
 * @description 一个项目 应该只有一个main方法  总的测试类
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Application {
    public static void main(String[] args) {
        //类型之间的转化：父  子  子类转父类 可能会丢失子类独有的方法
        Person person = new Student();//自动转 低转高 子转父
        person.run();//run
        ((Student) person).go();//强转 高转低 父转子  go
    }
}
