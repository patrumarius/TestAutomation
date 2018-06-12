package Meeting6;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectTestMeeting6 {

    private ChromeDriver driver;
    LoginForm loginForm;
    //SearchForm searchForm;

    @Before //adnotarile trebuie sa fie imediat deasupra;
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/search.html");
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
        loginForm.completeUsername("TestUsername").completePassword("TestPassword").submit();

    }

    @Test
    public void testSearchForm(){
        SearchForm searchForm = new SearchForm(driver);
        searchForm.setQuery("pisici");
    }
}
