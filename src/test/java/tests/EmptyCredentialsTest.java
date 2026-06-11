package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pages.LoginPage;

public class EmptyCredentialsTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        LoginPage login = new LoginPage(driver);

        login.clickLogin();

        String actualMessage = driver.findElement(
                By.xpath("//span[text()='Required']")
        ).getText();

        Assert.assertEquals(
                actualMessage,
                "Required",
                "Validation Message Mismatch");

        System.out.println("Empty Credentials Test Passed");

        driver.quit();
    }
}