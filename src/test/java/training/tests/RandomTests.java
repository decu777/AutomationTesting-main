package training.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomTests {

    public WebDriver driver;

//@Test
    public void test1(){
            driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();

        WebElement acceptCookies = driver.findElement(By.id("L2AGLb"));
        acceptCookies.click();
        }
    }

