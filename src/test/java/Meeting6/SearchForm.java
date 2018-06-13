package Meeting6;

import javafx.scene.web.WebView;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchForm {

    private final WebDriver driver;

    public SearchForm(WebDriver driver) throws IllegalArgumentException {
        String title = driver.getTitle();

        if(!title.equals("Search")){
            throw new IllegalArgumentException(String.format("Not Searchh, but %s",title));
        }

        this.driver = driver;

    }

    public void setQuery(String query){
        WebElement inputSearch = driver.findElement(By.name("q"));
        WebElement submitSearch = driver.findElement(By.className("btn-primary"));
        inputSearch.click();
        inputSearch.clear();
        inputSearch.sendKeys(query);
        submitSearch.click();

    }

    public String returnInputText(){
        WebElement elementInput = driver.findElement(By.name("q"));
        String textInput = elementInput.getText();
        return textInput;
    }

    //comentariu cu privire la ce git folosesc
    //alt comentariu
    ////
}
