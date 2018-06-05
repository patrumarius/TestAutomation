package Homework4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Exercice1 {

    private ChromeDriver driver;

    @Before //adnotarile trebuie sa fie imediat deasupra;
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/styled-elements.html");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    /*@Test
    public void verifyStyle1(){
        WebElement element driver.findElement(By.tagName("h1"));

        assertEquals("h1",element.getCssValue())
    }*/

    @Test
    public void verifyStyle1(){
        WebElement element = driver.findElement(By.id("invisible"));

        assertEquals("none",element.getCssValue("display"));
    }

    @Test
    public void verifyStyle2(){
        WebElement element = driver.findElement(By.id("invisible"));

        assertEquals("border-box",element.getCssValue("box-sizing"));
    }

    @Test
    public void verifyStyle3(){
        WebElement element = driver.findElement(By.id("red"));

        assertEquals("rgba(255, 0, 0, 1)",element.getCssValue("color"));
    }

    @Test
    public void verifyStyle4(){
        WebElement element = driver.findElement(By.tagName("h1"));

        assertEquals("36px",element.getCssValue("font-size"));
    }

    @Test
    public void verifyStyle5(){
        WebElement element = driver.findElement(By.id("visible"));

        assertEquals("rgba(51, 51, 51, 1)",element.getCssValue("color"));
    }

    @Test
    public void verifyStyle6(){
        WebElement element = driver.findElement(By.name("text"));

        assertEquals("0 px",element.getCssValue("margin"));
    }
}
