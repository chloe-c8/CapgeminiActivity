package pageObjects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract class BasePage {
	protected WebDriver driver;
	protected WebDriverWait wait;

	BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 5);
	}

	void click(By selector) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
		element.click();
	}


	void enter(By selector, String inputString) {
		WebElement item = wait.until(ExpectedConditions.elementToBeClickable(selector));
		item.sendKeys(inputString);
	}

}
