package BasicTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGEx {
    @Test
    public void VerifyAbhiBusWebsite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niki\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test  //(groups = "smoke")
    public void VerifyEdasoWebsite() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niki\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edso.in/");
        driver.manage().window().maximize();
        driver.close();

    }
@Test
    public void VerifyRediffmail() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niki\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.close();
    }
@Test
    public void VerifyFaceBook() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niki\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.close();
    }
}