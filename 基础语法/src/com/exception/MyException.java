package com.exception;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/15
 * @description 自定义异常
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class MyException extends Exception {
    int a;

    //构造器
    public MyException(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "MyException{" + "a=" + a + '}';
    }
}
