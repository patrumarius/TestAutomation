package Homework1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssEquivilantsIT {

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
    public void findForgottenPassword() throws Exception {
        WebElement link = driver.findElement(By.cssSelector("#change-password"));
    }

    @Test
    public void findLoginButton() throws Exception {
        WebElement link = driver.findElement(By.cssSelector(".btn-primary"));
    }

    @Test
    public void findEmailInput() throws Exception {
        WebElement link = driver.findElement(By.cssSelector("*[name=email"));
    }

    @Test
    public void findForgottenPasswordByTag() throws Exception {
        WebElement link = driver.findElement(By.cssSelector("a"));
    }


}
