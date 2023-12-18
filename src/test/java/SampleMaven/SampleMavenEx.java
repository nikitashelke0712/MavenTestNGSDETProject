package SampleMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleMavenEx {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Niki\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.abhibus.com/");
            driver.manage().window().maximize();
            driver.close();


        }
}
