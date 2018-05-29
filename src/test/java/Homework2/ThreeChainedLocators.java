package Homework2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreeChainedLocators {

    private WebDriver driver;

    @Before //adnotarile trebuie sa fie imediat deasupra;
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/registration-form.html");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void firstChainedLocator() {
        WebElement emailFirstChainedLocator = driver.findElement(By.id("email-group"))
                .findElement(By.id("email"));
    }

    @Test
    public void secondChainedLocator() {
        WebElement loginSecondChainedLocator = driver.findElement(By.className("registration-form"))
                .findElement(By.id("t1"));
    }

  /*  @Test
    public void thirdChainedLocator() {
        WebElement butonThirdChainedLocator = driver.findElement(By.name("hearAbout")).findElement(By.linkText("Friend"));
    }*/
}
