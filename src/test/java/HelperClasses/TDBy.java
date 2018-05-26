package HelperClasses;

import org.openqa.selenium.By;

public class TDBy {

    private TDBy() {

    }

    public static By cellLocation(int rowNumber, int columnNumber) {
        //System.out.println(String.format("tbody tr:nth-child(%d) td:nth-child(%d)", rowNumber, columnNumber));
        return By.cssSelector(String.format("tbody tr:nth-child(%d) td:nth-child(%d)", rowNumber, columnNumber));
    }
}
