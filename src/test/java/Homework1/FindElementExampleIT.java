package Homework1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementExampleIT {

    private WebDriver driver;

    @Before //adnotarile trebuie sa fie imediat deasupra;
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/index.html");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void headingByTagName() {
        WebElement heading = driver.findElement(By.tagName("h1"));
    }

    @Test
    public void paragraphElements() {
        List<WebElement> listOfParagraphs = driver.findElements(By.tagName("p"));
        for(WebElement i : listOfParagraphs){
            System.out.println(i.getText());
        }
    }
}
