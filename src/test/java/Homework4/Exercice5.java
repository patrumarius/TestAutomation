package Homework4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Exercice5 {

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

    //Question - explicatie
    @Test
    public void textBold(){
        WebElement text = driver.findElement(By.xpath("*[contains(normalize-space(.), 'A paragraph with this text in bold.')]"));

        assertEquals("bold", text.getCssValue("font weight"));
    }
}
