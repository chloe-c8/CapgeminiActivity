package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ScottishTaxPage extends BasePage{
    public ScottishTaxPage(WebDriver driver){
        super(driver);
    }

    private static final By SCOTTISH_RATE_TAX = By.cssSelector("#payScottishRate-2 + label");
    private static final By SELECT_CONTINUE = By.cssSelector("#button-continue");


    public void payScottishRate(){
        click(SCOTTISH_RATE_TAX);
    }

    public void selectContinue(){
        click(SELECT_CONTINUE);
    }

    }
