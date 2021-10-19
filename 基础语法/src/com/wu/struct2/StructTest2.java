package com.wu.struct2;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/9/30
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class StructTest2 {
    public static void main(String[] args) {
        //反编译 java文件->class(字节码文件)->反编译(idea)
        /*/case穿透 要加break
        /expression支持 byte/short/int/char/String
        /vale必须为字符串常量或字面量
        /switch (expression){
        /    case vale:
        /        //语句
        /        break;
        /    default:
        /        //语句
        /}
        */
        char grade = 'c';
        switch (grade) {
            case 'a':
                System.out.println("特优秀");
                break;
            case 'b':
                System.out.println("优秀");
                break;
            case 'c':
                System.out.println("一般");
                break;
            case 'd':
                System.out.println("差");
                break;
            default:
                System.out.println("未知等级");
        }
    }
}
