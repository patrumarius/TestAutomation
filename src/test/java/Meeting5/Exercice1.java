package Meeting5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.pagefactory.ByAll;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectableChannel;
import java.util.List;

public class Exercice1 {

    private ChromeDriver driver;

    @Before //adnotarile trebuie sa fie imediat deasupra;
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/registration-form.html");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void getColor(){
        WebElement color = driver.findElement(By.id("red"));
        System.out.println(color.getCssValue("color"));
    }

    @Test
    public void getAttribute(){
        String att = driver.findElement(By.id("t1")).getAttribute("value");
        System.out.println(att);
        assertEquals("john.doe@swb.com",att);
        /*WebElement att2 = driver.findElement(By.id("t1"));
        System.out.println(att2.getText());*/
    }

    @Test
    public void selectTest(){
        WebElement selectElement = driver.findElement(By.name("interest"));

        Select select = new Select(selectElement);
        List<WebElement> listWebElementSelect = select.getOptions();

        for(WebElement el : listWebElementSelect){
            System.out.println(el.getText());
        }
    }

}
