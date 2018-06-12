package Meeting5;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chapter5 {

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

    //mapam doar elementele cu care interactionam - inputuri, butoane, campuri, linkuri

}
