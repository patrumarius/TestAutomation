package MeetingThree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginIT {

    private WebDriver driver;

    @Before //adnotarile trebuie sa fie imediat deasupra;
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/login.html");
    }

    /*@After
    public void tearDown() throws Exception {
        driver.quit();
    }*/

    @Test
    public void login() throws Exception {
        //driver.get("/login.html");

        WebElement email = driver.findElement(By.name("email"));
        email.clear();
        email.sendKeys("john@doe.com");
        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("secret");
        driver.findElement(By.cssSelector("input[type='submit'")).click();
    }

}
