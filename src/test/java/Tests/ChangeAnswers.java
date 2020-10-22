package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.*;

import javax.naming.Reference;

public class ChangeAnswers {
    private WebDriver driver = new ChromeDriver();
    public HomePage homePage = new HomePage(driver);
    public StatePensionAge statePensionAge = new StatePensionAge(driver);
    public TaxCode taxCode = new TaxCode(driver);
    public ScottishTaxPage scottishTaxPage = new ScottishTaxPage(driver);
    public CheckAnswersPage checkAnswersPage = new CheckAnswersPage(driver);

    @Before
    public void startUp(){
        homePage.goTo();
    }

    @Test
    public void changeAmountEarned(){
        homePage.enterSalary("1300");
        homePage.paidMonthly();
        homePage.selectContinue();
        statePensionAge.overPensionAge();
        statePensionAge.selectContinue();
        taxCode.enterTaxCode("1250L");
        taxCode.selectContinue();
//        fullJourney();
        checkAnswersPage.changePayAmount();
        homePage.clearAmount();
        homePage.enterSalary("1500");
        homePage.paidMonthly();
        homePage.selectContinue();
        checkAnswersPage.getResults();

    }
    @After
    public void endPage(){
        driver.quit();
    }
}
