package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage {

    public HomePage (WebDriver driver){
        super(driver);
    }
    private static String TaxCalculator= "https://www.tax.service.gov.uk/estimate-paye-take-home-pay/your-pay";
    private static final By ENTER_SALARY = By.cssSelector("#amount");
    private static final By WHEN_ARE_YOU_PAID = By.cssSelector("#period-4 + label");
    private static final By SELECT_CONTINUE = By.cssSelector("#button-continue");


    public void enterSalary(String amount){
        enter(ENTER_SALARY, amount);
    }

    public void paidMonthly(){
        click(WHEN_ARE_YOU_PAID);
    }

    public void selectContinue(){
        click(SELECT_CONTINUE);
    }

    public void goTo() {
        driver.get(TaxCalculator);
    }
    public void clearAmount() {
        WebElement clearAmount = driver.findElement(ENTER_SALARY);
        clearAmount.clear();
    }

}
