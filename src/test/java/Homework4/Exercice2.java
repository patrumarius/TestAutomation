package Homework4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import static org.hamcrest.Matchers.*;

import java.util.List;

public class Exercice2 {

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

   /* @Test
    public void verifyPresenceEl1(){
        List<WebElement> list = driver.findElements(By.className("container"));

        //assertThat(driver.findElements(By.className("container"), hasSize()));

        //assertThat(list.size(), "7");
        assertEquals(list.size(), 7);
    }*/

    @Test
    public void verifyPresenceEl1(){
        List<WebElement> liste = driver.findElements(By.tagName("h1"));

        assertEquals(1, liste.size());

        //assertThat(driver.findElements(By.tagName("h1")), hasSize(1));
    }

    /*@Test
    public void verifyPresenceEl2(){
        List<WebElement> liste = driver.findElements(By.id("visible"));

        assertEquals(1, liste.size());
    }*/

    @Test
    public void verifyPresenceEl2(){
        List<WebElement> liste = driver.findElements(By.xpath("*[contains(normalize-space(.), 'A paragraph with this text in bold.')]"));

        assertEquals(1, liste.size());
    }

    @Test
    public void verifyPresenceEl4(){
        List<WebElement> liste = driver.findElements(By.id("red"));

        assertEquals(1, liste.size());
    }

    @Test
    public void verifyPresenceEl5(){
        List<WebElement> liste = driver.findElements(By.name("text"));

        assertEquals(1, liste.size());
    }

    /*@Test
    public void verifyPresenceEl5(){
        List<WebElement> liste = driver.findElements(By.id("visible"));

        assertEquals(1, liste.size());
    }*/

    @Test
    public void verifyPresenceEl6(){
        List<WebElement> liste = driver.findElements(By.id("shorthand"));

        assertEquals(1, liste.size());
    }

    @Test
    public void verifyPresenceEl7(){
        List<WebElement> liste = driver.findElements(By.id("invisible"));

        assertEquals(1, liste.size());
    }

}
