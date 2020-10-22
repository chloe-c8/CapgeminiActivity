package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatePensionAge extends BasePage {
    public StatePensionAge (WebDriver driver){
        super(driver);
    }
    private static final By STATE_PENSION_AGE = By.cssSelector("#overStatePensionAge-2 + label");
    private static final By SELECT_CONTINUE = By.cssSelector("#button-continue");

    public void overPensionAge(){
        click(STATE_PENSION_AGE);
    }

    public void selectContinue(){
        click(SELECT_CONTINUE);
    }


}
