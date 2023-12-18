package BasicTestNG.Parameterazation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NeedOfParameterization {

    @Parameters({"username", "password"})
    @Test
    public void VerifyLoginWithValidUsernameAndPassword(String username, String password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niki\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();


        WebElement loginElement = driver.findElement(By.id("login1"));
        WebElement passwordElement = driver.findElement(By.id("password"));

        loginElement.sendKeys(username);
        passwordElement.sendKeys(password);
        Thread.sleep(5000);
        driver.close();
    }

    @Parameters({"invalidusername", "invalidpassword"})
    @Test
    public void VerifyLoginWithinValidUsernameAndPassword(String invalidusername, String invalidpassword) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niki\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();


        WebElement loginElement = driver.findElement(By.id("login1"));
        WebElement passwordElement = driver.findElement(By.id("password"));

        loginElement.sendKeys(invalidpassword);
        passwordElement.sendKeys(invalidpassword);
        Thread.sleep(5000);
        driver.close();
    }
}