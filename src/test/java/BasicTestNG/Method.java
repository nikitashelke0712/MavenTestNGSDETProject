package BasicTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Method {
    public WebDriver driver;

@org.testng.annotations.BeforeMethod

    public void beforeMethodExample (){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niki\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();  // upcasting
    }

    @Test(groups = "smoke")
    public void VerifyAbhiBusWebsite () {
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();

    }

    @Test
    public void VerifyEdasoWebsite () {
        driver.get("https://www.edso.in/");
        driver.manage().window().maximize();

    }
    @AfterMethod
    public  void AfterMethod(){
    driver.close();
    }

}

