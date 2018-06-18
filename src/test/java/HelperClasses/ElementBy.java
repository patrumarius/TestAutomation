package HelperClasses;

import org.openqa.selenium.By;

public class ElementBy {

    private ElementBy(){
    }

    public static By partialText(String text){
        return By.xpath("//*[contains(normalize-space(.),'" + text + "')]");
    }
}
