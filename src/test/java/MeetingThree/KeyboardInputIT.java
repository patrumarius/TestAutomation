package MeetingThree;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

import java.security.Key;

public class KeyboardInputIT {

    private ChromeDriver driver;

    @Before //adnotarile trebuie sa fie imediat deasupra;
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/mailing-list.html");
    }

    /*@After
    public void tearDown() throws Exception {
        driver.quit();
    }*/

    @Test
    public void firstTestSendKeys() {
        driver.findElement(By.name("email")).sendKeys("john.doe@swb.com");

        driver.getKeyboard().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(" ");
        driver.getKeyboard().pressKey(Keys.ENTER);
    }
}
