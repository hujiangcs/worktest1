package groups;


import org.testng.annotations.Test;

@Test(groups = "stu")
public class groupsOnClass1 {
    public  void Stu1(){
        System.out.println("groupsOnClass1中运行stu1");
    }
    public  void Stu2(){
        System.out.println("groupsOnClass1中运行stu1");
    }

}
