package PartTwo;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class WebDriverConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public DesiredCapabilities desiredCapabilities(
            @Value("${webdriver.capabilities.browserName:chrome}") String browserName
    ){
        return new DesiredCapabilities(browserName, "", Platform.ANY);
    }

    @Bean(destroyMethod = "quit")
    public WebDriver webDriver(DesiredCapabilities desiredCapabilities){
                switch (desiredCapabilities.getBrowserName()){
                    case BrowserType.CHROME:
                        return new ChromeDriver(desiredCapabilities);
                    case BrowserType.FIREFOX:
                        return new FirefoxDriver(desiredCapabilities);
                    default:
                        throw new IllegalStateException("unknown browser " + desiredCapabilities.getBrowserName());
                }
    }
}
