package Homework1;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedCssExamplesIT {

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
    public void findEmailInputOneAttribute() throws Exception{
        WebElement inputEmail = driver.findElement(By.cssSelector("input[id=email"));
    }

    @Test
    public void findEmailInputTwoAttributes() throws Exception {
        WebElement inputEmailTwo = driver.findElement(By.cssSelector("input[id=email")
                .cssSelector("input[class=form-control"));
    }

    @Test
    public void findPasswordInputPrefix() throws Exception {
        WebElement inputPassword = driver.findElement(By.cssSelector("[id$=em]"));
    }

    @Test
    public void findPasswordInputSufix() throws Exception {
        WebElement inputPassword = driver.findElement(By.cssSelector("[id$=il]"));
    }

    @Test
    public void findPasswordInputInfix() throws Exception {
        WebElement inputPassword = driver.findElement(By.cssSelector("[id$=mai]"));
    }

    @Test
    public void findEmailInputDirectDescendant() throws Exception {

    }

    @Test
    public void findEmailInputAnyDescendant() throws Exception {

    }





}
