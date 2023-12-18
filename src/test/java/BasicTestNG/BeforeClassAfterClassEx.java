package BasicTestNG;

import org.testng.annotations.*;

public class BeforeClassAfterClassEx {

    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before class");
    }

@BeforeMethod

        public  void BeforeMethod(){
            System.out.println("Before Method");
        }
        @Test (groups = "smoke")
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

    @AfterClass
    public void AfterClass(){
        System.out.println("After Class");
    }

}
