package Meeting6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginForm {

    private WebElement form;

    public LoginForm(WebElement form){
        this.form = form;
    }

    public LoginForm completeUsername(String username){
        WebElement usernameInput = form.findElement(By.id("email"));
        usernameInput.click();
        usernameInput.clear();
        usernameInput.sendKeys(username);

        return this;
    }

    public LoginForm completePassword(String password){
        WebElement passwordInput = form.findElement(By.name("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);

        return this;
    }

    public LoginForm submit(){
        WebElement loginButton = form.findElement(By.cssSelector(".btn.btn-primary"));
        loginButton.click();

        return this;
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
