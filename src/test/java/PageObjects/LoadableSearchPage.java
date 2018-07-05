package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

import static org.junit.Assert.assertEquals;

public class LoadableSearchPage extends LoadableComponent<LoadableSearchPage>{
    private final WebDriver driver;

    public LoadableSearchPage(WebDriver driver){
        this.driver = driver;
       /* String pageTitle = driver.getTitle();
        if(!pageTitle.equals("Search")){
            throw new IllegalArgumentException(String.format("page is not search page, it has unexpected title %s", pageTitle));
        }
        else {
            this.driver = driver;
        }*/
    }

    @Override
    protected void load() {
        driver.get("/search.html");
    }

    @Override
    protected void isLoaded() throws Error {
        assertEquals("Search", driver.getTitle());
    }

    public void SearchFor(String query){
        driver.findElement(By.cssSelector("input[name='q']"))
                .sendKeys(query);
        driver.findElement(By.cssSelector("input[type='submit']"))
                .click();
    }


}
