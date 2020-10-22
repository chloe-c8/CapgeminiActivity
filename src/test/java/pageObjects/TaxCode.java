package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaxCode extends BasePage {
    public TaxCode (WebDriver driver){
        super(driver);
    }
    private static final By ENTER_TAX_CODE = By.cssSelector("#taxCode");
    private static final By SELECT_CONTINUE = By.cssSelector("#button-continue");

    public void enterTaxCode(String code){
        enter(ENTER_TAX_CODE, code);
    }

    public void selectContinue(){
        click(SELECT_CONTINUE);
    }
}
