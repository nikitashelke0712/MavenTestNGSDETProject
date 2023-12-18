package BasicTestNG.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void VerifyHomePage(){

        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niki\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        String WebSiteTitle = driver.getTitle();
        System.out.println(WebSiteTitle);

        softAssert.assertFalse(driver.findElement(By.xpath("//u[text()='Forgot Password?']")).isDisplayed());
        softAssert.assertEquals(WebSiteTitle,"Rediffmail","Title of Website should be rediffmail ");
        System.out.println("Welcome");
        softAssert.assertAll();
        driver.close();


    }
}
