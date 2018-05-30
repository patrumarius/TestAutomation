package MeetingThree;

import javafx.scene.web.WebView;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WyswygInputIT {

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
    public void testWyswyg() {
        WebElement editorFrame = driver.findElement(By.id("editor_ifr"));
        driver.switchTo().frame(editorFrame);
        WebElement body = driver.findElement(By.tagName("body"));
        body.clear();
        body.sendKeys("A paragraph of text, some of which is");

        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector(".mce-i-italic")).click();
        driver.switchTo().frame(editorFrame);
        body.sendKeys("italics");
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector(".mce-i-italic")).click();
    }
}
