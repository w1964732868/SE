package com.oop.instanceofTest;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/15
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class Student extends Person {
    public void go() {
        System.out.println("go");
    }

    /**
     * public class Application {
     *     public static void main(String[] args) {
     *         //Object String
     *         //Object Person Student
     *         //Object Person Teacher
     *
     *         Object object = new Student();
     *         System.out.println(object instanceof Object);//true
     *         System.out.println(object instanceof Person);//true
     *         System.out.println(object instanceof Student);//true
     *         System.out.println(object instanceof Teacher);//false
     *         System.out.println(object instanceof String);//false
     *
     *         System.out.println("=========================");
     *         Person person = new Student();
     *         System.out.println(person instanceof Object);//true
     *         System.out.println(person instanceof Person);//true
     *         System.out.println(person instanceof Student);//true
     *         System.out.println(person instanceof Teacher);//false
     *         //System.out.println(person instanceof String);//编译就报错
     *         System.out.println("=========================");
     *
     *         Student student = new Student();
     *         System.out.println(student instanceof Object);//true
     *         System.out.println(student instanceof Person);//true
     *         System.out.println(student instanceof Student);//true
     *         //System.out.println(student instanceof Teacher);//编译就报错
     *         //System.out.println(person instanceof String);//编译就报错
     *     }
     * }
     */

    /**
     * public class Application {
     *     public static void main(String[] args) {
     *         //类型之间的转化：父  子  子类转父类 可能会丢失子类独有的方法 向上转型
     *         Person person = new Student();//自动转 低转高 子转父
     *         person.run();//run
     *         ((Student) person).go();//go 强转 高转低 父转子   向下转型
     *     }
     * }
     */
}
