package com.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
    @Test
    public  void  tsest1(){

        Assert.assertEquals(1,1);

        System.out.println(123);
    }
    @Test
    public  void  tsest2(){
        Assert.assertEquals(3,2);
        System.out.print(456);
    }


    @Test
    public  void  logDemo(){
        Reporter.log("这是测试日志");
       // Assert.assertEquals(1,2);
        throw  new RuntimeException("这是异常测试");
    }
}
