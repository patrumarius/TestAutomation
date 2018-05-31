package Homework3;

import javafx.scene.web.WebView;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercice1 {

    private ChromeDriver driver;

    @Before //adnotarile trebuie sa fie imediat deasupra;
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/wyswyg-editor.html");
    }

    /*@After
    public void tearDown() throws Exception {
        driver.quit();
    }*/

    @Test
    public void testBoldSendKeys() {
            WebElement editorFrame = driver.findElement(By.id("editor_ifr"));
            driver.switchTo().frame(editorFrame);
            WebElement body = driver.findElement(By.tagName("body"));
            body.clear();
            body.sendKeys("A paragraph of text, ");
            driver.switchTo().defaultContent();
            driver.findElement(By.cssSelector(".mce-i-bold")).click();
            driver.switchTo().frame(editorFrame);
            body.sendKeys("which contains");
            driver.switchTo().defaultContent();
            driver.findElement(By.cssSelector(".mce-i-bold")).click();
            driver.switchTo().frame(editorFrame);
            driver.findElement(By.tagName("body"));
            body.sendKeys(" text in");
            driver.switchTo().defaultContent();
            driver.findElement(By.cssSelector(".mce-i-bold")).click();
            driver.switchTo().frame(editorFrame);
            driver.findElement(By.tagName("body"));
            body.sendKeys(" bold");
        }


    }


