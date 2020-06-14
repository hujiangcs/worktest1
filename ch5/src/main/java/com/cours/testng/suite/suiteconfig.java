package com.cours.testng.suite;

import org.testng.annotations.*;

import java.awt.*;

public class suiteconfig {
    @BeforeSuite
    public   void  BeforeSuit(){
        System.out.println("beforeSuite运行了");
    }
@AfterSuite
    public   void  AfterSuit(){
        System.out.println("beforeSuite运行了");
    }
@BeforeTest
    public   void beforeTest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public   void AfterTest(){
        System.out.println("AfterTest");
    }
}
