package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckAnswersPage extends BasePage {
    public CheckAnswersPage(WebDriver driver){
        super(driver);
    }

    private static final By GET_RESULTS_BUTTON = By.cssSelector("#button-get-results");
    private static final By CHANGE_PAY_AMOUNT = By.cssSelector("a[href*='/estimate-paye-take-home-pay/your-pay']");
//    private static final by DOES_PAGE_OPEN = By.cssSelector()

    public void getResults(){
        click(GET_RESULTS_BUTTON);
    }
    public void changePayAmount(){
        click(CHANGE_PAY_AMOUNT);
    }
//    public void doesPageOpen(){
//        WebElement doesPageOpen = driver.findElement("#restart-button");
//
//    }


}
