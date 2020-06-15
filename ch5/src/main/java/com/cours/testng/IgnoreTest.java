package com.cours.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

   @Test
    public   void Ignre1(){
        System.out.println("ignre1 ，运行");
    }
    @Test  (enabled = false)
    public   void ignre2(){
        System.out.println("ignre2 ，运行");
    }
    @Test (enabled = true)
    public   void ignre3(){
        System.out.println("ignre3 ，运行");
    }
}
