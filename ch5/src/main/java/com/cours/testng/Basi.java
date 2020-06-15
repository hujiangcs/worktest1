package com.cours.testng;

import org.testng.annotations.*;

import java.awt.*;

public class Basi {
//最基本的注解，用来把方法标记为测试的一部分
    @Test
    public   void  testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public   void  testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
public   void beforeMethood(){
        System.out.println("BeforeMethod这是测试方法前运行");
}
@AfterMethod
    public  void afterMethod(){
    System.out.println("AfterMethod 这是测试方法后运行");
}
@BeforeClass
    public   void  BefforeClass(){
System.out.println("BefforeClass 这是类运行前的方法");
}
@AfterClass
    public  void AfterClass(){
    System.out.println("AfterMethod 这是类运行后运行");
}
///BeforeSuite,AfterSuite 类运行前和运行后运行的·
@BeforeSuite
public  void  beforeSuite(){
    System.out.println("beforeSuite测试套件");
}
@AfterSuite
public   void  AfterSuite(){
    System.out.println("AfterSuite测试套件");
}
}
