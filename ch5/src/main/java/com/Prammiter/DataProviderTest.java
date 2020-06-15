package com.Prammiter;

import org.omg.CORBA.Object;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest<Objec> {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {

        System.out.println("name:" + name + "age :" + age);
    }

    @DataProvider(name = "data")
   public Object[][] providerData() {
      Object[][] o = new Object[][]{
               {"hujjiang", 10},
               {"hujjiang", 20},    {"hujjian1g", 30} };
     return o;
  }
    @Test(dataProvider = "methidData")
    public void testDataProvider1(String name, int age){

        System.out.println("test1方法  name:"+ name +"age:"+age);

    }
    @Test(dataProvider = "methidData")
    public void testDataProvider2(String name, int age){
        System.out.println("test2方法  name:"+ name +"age:"+age);
    }
@DataProvider(name ="methidData")
    public Object[][] methidData(Method method){

Objec[][]  result1=null;

if (method.getName().equals("test1")){
    result1 =new Object[][]{

            }else
                if (method.getName().equals("test2"))

    }


    return result1;
}



    }


}