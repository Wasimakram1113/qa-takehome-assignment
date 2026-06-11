package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pages.LoginPage;

public class LoginTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        LoginPage login = new LoginPage(driver);

        login.enterUsername("Admin");
        login.enterPassword("admin123");
        login.clickLogin();

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.urlContains("dashboard"));

        Assert.assertTrue(
                driver.getCurrentUrl().contains("dashboard"),
                "Login Failed");

        System.out.println("Login Passed");

        driver.quit();
    }
}