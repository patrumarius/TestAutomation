package Homework1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExamplesIT {

    private WebDriver driver;

    @Before //adnotarile trebuie sa fie imediat deasupra;
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/login.html");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void passwordLinkText(){
        WebElement password = driver.findElement(By.linkText("Forgotten Password"));
    }

    @Test
    public void passwordPartiallyLinkTestWay1() {
        WebElement password1 = driver.findElement(By.partialLinkText("Forgo"));
    }

    @Test
    public void passwordPartiallyLinkTestWay2() {
        WebElement password1 = driver.findElement(By.partialLinkText("tten Pass"));
    }

    @Test
    public void passwordPartiallyLinkTestWay3() {
        WebElement password1 = driver.findElement(By.partialLinkText("word"));
    }

    @Test
    public void passwordLinkId() {
        WebElement passwordLinkId = driver.findElement(By.id("change-password"));
    }

    @Test
    public void loginButton() {
        WebElement loginButton = driver.findElement(By.className("btn-primary"));
    }

    @Test
    public void emailInput() {
        WebElement email = driver.findElement(By.name("email"));
    }

    @Test
    public void forgottenPasswordLink() {
        WebElement forgottenPassword = driver.findElement(By.tagName("a"));
    }
}
