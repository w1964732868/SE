package com.oop.abstractTest;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/15
 * @description  抽象类的所有方法，继承了它的子类 都必须实现它的抽象方法
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 *
 * 不能new抽象类，只能靠子类去实现
 * 有抽象方法，一定是抽象类
 * 抽象类里，可以写普通方法
 *
 * 抽象的抽象：约束
 **/
public abstract class Action {

    //抽象方法  只有方法名字 没有方法实现
    public abstract void doSomthing();
}
