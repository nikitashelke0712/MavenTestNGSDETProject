package BasicTestNG.Attribute;

import org.testng.annotations.Test;

public class InvocationCountAttribute {
    @Test(invocationCount =5, invocationTimeOut = 50 )
    public void amzonTest(){
        System.out.println("Amzon Test");
    }
}
