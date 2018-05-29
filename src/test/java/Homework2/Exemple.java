package Homework2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exemple {

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

    /*@Test
    public void exempleRescrise() {
        WebElement chainedElement = driver.findElement(new ByChained(By.id("registration-form"),By.xpath("//label[contains(.,'Email')]"), By));
    }*/
}
