package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import javax.security.auth.callback.CallbackHandler;

@Path("http://localhost8080/search.html")
@Verify(xpath = "//h1[text()='Search']")
public class SearchForm {
    @FindBy(name = "q")
    @CacheLookup
    private WebElement query;

    @FindBy(css = "input[type='submit']")
    @CacheLookup
    private WebElement submit;

    private final WebDriver driver;

    public SearchForm(WebDriver driver){
        this.driver = driver;
    }

    public void searchFor(String query){
        this.query.sendKeys(query);
        this.submit.click();
    }

   /* public void setQuery(String query){
        driver.findElement(By.cssSelector("input[name='q']"))
                .sendKeys(query);
    }

    public void submit(){
        driver.findElement(By.cssSelector("input[type='submit']"))
                .click();
    }*/

   //commentariu transpus in

    private WebElement findQuery(){
        return driver.findElement(By.cssSelector("input[name='q']"));
    }

    public void clearQuery(){
        findQuery().clear();
    }
}
