package PartTwo;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShutDownHookWebDriverIT {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception{
        driver = new ChromeDriver();
        Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));
    }
}
