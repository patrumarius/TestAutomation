package Homework2;

import HelperClasses.AllBy;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExempleAllBy {

    private WebDriver driver;

    @Before //adnotarile trebuie sa fie imediat deasupra;
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/shopping-cart.html");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testAllBy1() {
        WebElement elementAllByOne = driver.findElement(AllBy.all(By.tagName("button"),  By.className("btn-primary")));
    }

    @Test
    public void testAllBy2() {
        WebElement elementAllByTwo = driver.findElement(AllBy.all(By.tagName("a"), By.linkText("remove")));
    }

   /* @Test
    public void testAllBy3() {
        WebElement elementAllByThree = driver.findElement(AllBy.all(By.))
    }*/

}
