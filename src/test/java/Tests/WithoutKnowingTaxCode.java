package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.*;

public class WithoutKnowingTaxCode{
    WebDriver driver = new ChromeDriver();
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
    public void journeyWithoutTakeCode(){
        homePage.enterSalary("1300");
        homePage.paidMonthly();
        homePage.selectContinue();
        statePensionAge.overPensionAge();
        statePensionAge.selectContinue();
        taxCode.selectContinue();
        scottishTaxPage.payScottishRate();
        scottishTaxPage.selectContinue();
        checkAnswersPage.getResults();
//        Assert.assertTrue()
    }
    @After
    public void endPage(){
        driver.quit();
    }

}
