package Homework4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class Exercice6 {

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

    @Test
    public void ex6(){
        WebElement element = driver.findElement(By.id("shorthand"));

        //assertEquals("1px solid rgb(0, 0, 0)", element.getCssValue("border"));

        System.out.println(element.getCssValue("border"));
    }
}
