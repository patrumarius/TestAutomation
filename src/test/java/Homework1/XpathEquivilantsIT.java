package Homework1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathEquivilantsIT {

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
    public void forgottenPasswordXPath() {
        WebElement forgottenPassword = driver.findElement(By.xpath("//*[@id='change-password']"));
    }

    @Test
    public void buttonClassName() {
        WebElement button = driver.findElement(By.xpath("//*[contains(concat(' ',normalize-space(@class),' '),'btn-primary')]")) ;
    }

    @Test
    public void emailInput(){
        WebElement email = driver.findElement(By.xpath("//*[@name='email']"));
    }

    @Test
    public void forgottenPasswordLinkTag() {
        WebElement forgottenPasswordLinkTag = driver.findElement(By.xpath("//a"));
    }

}
