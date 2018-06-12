package Meeting6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchForm {

    private final WebDriver driver;

    public SearchForm(WebDriver driver){
        this.driver = driver;
    }

    public void setQuery(String query){
        WebElement inputSearch = driver.findElement(By.name("q"));
        WebElement submitSearch = driver.findElement(By.className("btn-primary"));
        inputSearch.click();
        inputSearch.clear();
        inputSearch.sendKeys("pisici");
        submitSearch.click();
    }

}
