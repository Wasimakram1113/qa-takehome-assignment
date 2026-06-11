package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pages.LoginPage;

public class InvalidLoginTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        LoginPage login = new LoginPage(driver);

        login.enterUsername("Admin");
        login.enterPassword("wrong123");
        login.clickLogin();

        String actualError = login.getErrorMessage();

        Assert.assertEquals(
                actualError,
                "Invalid credentials",
                "Error Message Mismatch");

        System.out.println("Invalid Login Test Passed");

        driver.quit();
    }
}