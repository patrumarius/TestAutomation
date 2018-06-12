package Meeting5;

import PageObjects.LoginForm;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectTestMeeting5 {

    private ChromeDriver driver;
    LoginForm loginForm;

    @Before //adnotarile trebuie sa fie imediat deasupra;
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/login.html");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void pageObjectTest(){
        WebElement startingForm = driver.findElement(By.id("login"));
        loginForm = new LoginForm(startingForm);
        //loginForm.loginWithCredentials("mama", "1234");

    }

}
