package com.exception;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/15
 * @description Exception
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * 文件找不到 网络连接失败
 * <p>
 * 检查性异常：文件不存在
 * 运行时异常
 * 错误：jvm相关 outOfMemoryError
 * <p>
 * try监控区域 catch捕获异常 finally throw(主动抛出的异常，一般在方法中使用) throws(从方法中抛出异常)
 **/
public class StackOverflowError {
    public static void main(String[] args) {
        try {
            System.out.println(11 / 0);//Ctrl+Alt+T
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

        try {
            new StackOverflowError().a();//java.lang.StackOverflowError
            //System.out.println(11 / 0);/// by zero
        } catch (ArithmeticException e) {//想要捕获的异常类型
            System.out.println("程序出现异常," + e.getMessage());
        } catch (java.lang.StackOverflowError e) {//catch (想要捕获的异常类型)
            System.out.println("程序出现异常," + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (Throwable e) {
            System.out.println("Throwable");
        } finally {//可以不要
            System.out.println("finally");
        }
    }


    public void a() {
        b();//a调b
    }

    public void b() {
        a();//b调a
    }
}
