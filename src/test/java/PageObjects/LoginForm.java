package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginForm {

    private WebElement form;

    public LoginForm(WebElement form){
        this.form = form;
    }

    public void loginWithCredentials(String username, String password){
        WebElement usernameInput = form.findElement(By.id("email"));
        WebElement passwordInput = form.findElement(By.name("password"));
        WebElement loginButton = form.findElement(By.cssSelector(".btn.btn-primary"));

        usernameInput.click();
        usernameInput.clear();
        usernameInput.sendKeys(username);
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);

        loginButton.click();
    }

    public void clikOnForgottenPassword(){
        WebElement forgottenPasswordLink = form.findElement(By.id("change-password"));
        forgottenPasswordLink.click();
    }

   /* public static void main(String[] args){
        WebElement element = null;
        LoginForm form = new LoginForm(element);
        form.loginWithCredentials("mama","1234");
    }*/

   public String getForgottenPassword(){
      return form.findElement(By.id("change-password")).getText();
   }



}
