package com;

import org.testng.annotations.Test;

import java.awt.*;

public class Extest {
    /*
    什么时候会用到异常测试？
     */

    @Test(expectedExceptions = RuntimeException.class)
    public void runtest() {
        System.out.println("这是一个失败的测试");
    }

    @Test(expectedExceptions = RuntimeException.class)

    public void runtest2() {
        System.out.println("这是一个成功的测试");
        throw new RuntimeException();
    }
}
