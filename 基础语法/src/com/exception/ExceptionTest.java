package com.exception;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/15
 * @description throws throw try catch finally
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class ExceptionTest {
    public static void test(int a) throws MyException {
        if (a > 10) {
            throw new MyException(a);
        }
    }

    public static void main(String[] args) {
        try {
            test(11);
        } catch (MyException e) {
            System.out.println(e);
        } finally {
        }
    }
}
