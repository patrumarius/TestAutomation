package MeetingTwo;

import HelperClasses.AllBy;
import HelperClasses.TDBy;
import javafx.scene.web.WebView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class OurFirstTest {

    private WebDriver driver;

    @Before //adnotarile trebuie sa fie imediat deasupra;
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/users-table.html");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void helloWebDriver() throws Exception {
        driver.get("http://localhost:8080/users-table.html");
        WebElement pageHeading = driver.findElement(By.tagName("h1"));
        assertEquals("Users", pageHeading.getText());
    }

    @Test
    public void findCell() throws Exception {
        WebElement cell = driver.findElement(TDBy.cellLocation(2,2));
        System.out.println(cell.getText());
    }

    //Selenium nu e tool

    @Test
    public void findByChain() throws Exception {
        WebElement chain = driver.findElement(By.id("login"))
                .findElements(By.className("form-group"))
                .get(2)
                .findElement(By.className("btn-primary"));

        System.out.println(chain.getText());
    }

    @Test
    public void testAllBy() throws Exception {
        WebElement element = driver.findElement(AllBy.all(By.className("form-control"),By.name("password")));
        System.out.println(element.getCssValue("name"));
    }
}
