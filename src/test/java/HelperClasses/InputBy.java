package HelperClasses;

import org.openqa.selenium.By;

public final class InputBy {

    private InputBy(){
    }

    public static By label(String labelText){
        return By.xpath("//label[contains(text(),'"+labelText +"')]input");
    }
}
