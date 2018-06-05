package Meeting4;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.support.ui.Select;

public class Exercice1 {

    private ChromeDriver driver;

    @Before //adnotarile trebuie sa fie imediat deasupra;
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.get("http://localhost:8080/registration-form.html");
    }

    /*@After
    public void tearDown() throws Exception {
        driver.quit();
    }*/
    @Test
    public void test1(){
        /*Actions actions = new Actions(driver);

        actions.moveToElement(WebElement).clickAndHold(webelemnt1).moveToElement().release().build().perform();*/

        WebElement email = driver.findElement(By.id("t1"));
        email.sendKeys("toe@ibm.com");

        WebElement checkbox = driver.findElement(By.name("terms"));
        Actions clickOnTerm = new Actions(driver).click(checkbox);
        clickOnTerm.perform();

        WebElement signUpButton = driver.findElement(By.className("btn-primary"));
        Actions doubleClickOnSignUp = new Actions(driver).doubleClick(signUpButton);
        doubleClickOnSignUp.perform();

    }

    @Test
    public void test2(){
        /*Actions actions = new Actions(driver);

        actions.moveToElement(WebElement).clickAndHold(webelemnt1).moveToElement().release().build().perform();*/

        WebElement email = driver.findElement(By.id("t1"));
        email.sendKeys("toe@ibm.com");
        WebElement checkbox = driver.findElement(By.name("terms"));
        driver.getMouse().click(((Locatable)checkbox).getCoordinates());

       /* Actions clickOnTerm = new Actions(driver).click(checkbox);
        clickOnTerm.perform();*/

        WebElement signUpButton = driver.findElement(By.className("btn-primary"));
        driver.getMouse().click(((Locatable)signUpButton).getCoordinates());

       /* Actions doubleClickOnSignUp = new Actions(driver).doubleClick(signUpButton);
        doubleClickOnSignUp.perform();*/

    }

    /*@Test
    public void dragAndDropEx(){
        Actions actions = new Actions(driver);
        actions.moveToElement(webel).clickAndHold(webel2).moveToElement(webeltar).release(webele3).build().perform();
    }*/

    //obiect Select - param webelementul de select
    //1.select byvisible text - cu valoarea respectiva a optiunii
    //2.by index din arrayul de valori din select

    @Test
    public void selectExample(){
        Select mySelect = new Select(driver.findElement(By.name("hearAbout")));
        mySelect.selectByVisibleText("Friend");
    }


}
