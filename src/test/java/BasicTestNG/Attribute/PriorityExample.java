package BasicTestNG.Attribute;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test(groups = "smoke")
    public void testcaseA(){
        System.out.println("test case A");
    }
    @Test(priority = -1)
    public void testcaseF(){
        System.out.println("test case F");
    }
    @Test(priority = 2)
    public void testcaseM(){
        System.out.println("test case M");
    }
    @Test(priority = -2)
    public void testcaseC(){
        System.out.println("test case C");
    }
    @Test(priority = 'A')
    public void testcaseZ(){
        System.out.println("test case Z");
    }

}
