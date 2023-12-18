package BasicTestNG.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
    @Test
    public void VerifyHomePage(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niki\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        String WebSiteTitle = driver.getTitle();
        System.out.println(WebSiteTitle);

        Assert.assertTrue(driver.findElement(By.xpath("//u[text()='Forgot Password?']")).isDisplayed());
        Assert.assertEquals(WebSiteTitle,"Rediffmail","Title of Website should be rediffmail ");
        driver.close();
    }
}
