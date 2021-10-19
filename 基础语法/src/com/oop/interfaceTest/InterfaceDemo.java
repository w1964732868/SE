package com.oop.interfaceTest;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/15
 * @description
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public interface InterfaceDemo {
    public abstract void add(String name);//每个方法前 默认加了 public abstract

    void delete(String name);

    void update(String name);

    void query(String name);

}
