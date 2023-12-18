package BasicTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BeforeMethodEx {
    @org.testng.annotations.BeforeMethod// this will be executed before every @test annotation method

    public  void BeforeMethod(){
        System.out.println("Before Method");
    }
    @Test(groups = "smoke")
    public void VerifyTestCase1(){
        System.out.println("Test case 1");
    }
    @Test
    public void VerifyTestCase2(){
        System.out.println("Test case 2");
    }
    @AfterMethod  // this will be executed after every @test annotation method
    public void AfterMethod(){
        System.out.println("After Method");

    }
}
