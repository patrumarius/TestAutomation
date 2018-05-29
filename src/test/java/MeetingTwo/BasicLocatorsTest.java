package MeetingTwo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class BasicLocatorsTest {

    private WebDriver driver;

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
    public void findForgottenPassword() throws Exception {
        WebElement forgottenPassword = driver.findElement(By.partialLinkText("tten Pass"));
      //  assertEquals("Forgotten Password", forgottenPassword.getText());
    }

    @Test
    public void findLoginButton() throws Exception {
        WebElement loginButton = driver.findElement(By.className("btn-primary"));
       // assertEquals("Forgotten Password", loginButton.getText());
    }

    @Test
    public void findForgottenPasswordById() throws Exception {
        WebElement forgottenPasswordById = driver.findElement(By.id("change-password"));
        //assertEquals("Forgotten Password", forgottenPasswordById.getText());
    }

    @Test
    public void findUserNameByInputName() throws Exception {
        WebElement userNameByInputName = driver.findElement(By.name("email"));

    }

    @Test
    public void findHeaderByTag() throws Exception {
        WebElement headerByTag = driver.findElement(By.tagName("head"));
       // assertEquals("", headerByTag.getText());
    }

    //buton de login dupa clasa
    //link forgotten password dupa id
    @Test
    public void findLoginButonCSS() throws Exception {
        WebElement loginButton = driver.findElement(By.cssSelector(".btn-primary"));
        // assertEquals("", headerByTag.getText());
    }

    @Test
    public void findForgottenPasswordCSS() throws Exception {
        WebElement loginButton = driver.findElement(By.cssSelector("#change-password"));
        // assertEquals("", headerByTag.getText());
    }

    //input username xpath relativ
    //login dupa xpath absolut

    @Test
    public void findUserNameInput() throws Exception {
        WebElement loginButton = driver.findElement(By.xpath("//input[@name='email']"));
        // assertEquals("", headerByTag.getText());
    }

    @Test
    public void findLogin() throws Exception {
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div/form/div[1]/input"));
        // assertEquals("", headerByTag.getText());
    }

}
