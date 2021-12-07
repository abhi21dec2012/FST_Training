package com.makemytrip.pages.homepage;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {

	/**
	 * @author Abhinav Srivastava
	 * @implNote This method is used to click on the element
	 * 
	 */
	public void javaScriptClickOn(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) getDriver();
		executor.executeScript("arguments[0].click();", element);
	}

	/**
	 * @author Abhinav Srivastava
	 * @return True or False
	 * @implNote This method is used to verify an element present on the page
	 * 
	 */
	public boolean isElementDisplayed(WebElement element) {
		boolean flag = false;
		if (element.isDisplayed() == true) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This method is used to move to a particular element
	 * 
	 */
	public void moveToElelment(WebElement element) {
		Actions actn = new Actions(getDriver());
		actn.moveToElement(element).build().perform();
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This method is used to scroll to the bottom of the page
	 * 
	 */
	public void scrollToDocumentHeight() {
		((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This method is used to scroll to the top of the page
	 * 
	 */
	public void scrollToTopOfThePage() {
		((JavascriptExecutor) getDriver()).executeScript("window.scrollTo(document.body.scrollHeight, 0 )");
	}

	/**
	 * @implNote Input the string in text box
	 * 
	 * @param element
	 * @param text
	 */
	public void inputText(WebElement element, String input) {
		element.clear();
		clickOn(element);
		element.sendKeys(input);
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This method is used to wait for an element
	 * 
	 */
	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This method is used to Scroll page down 250 pixel
	 * 
	 */
	public void scrollDownPageBy250Pixel() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("window.scrollBy(0,250)", "");
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This method is used to wait for an operation be completed in a
	 *           given amount of time
	 * @param Timeout in long format
	 * 
	 */
	public void _normalWait(long timeOut) {
		try {
			Thread.sleep(timeOut);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This method is used to select a given option from the dropdown
	 *           options list
	 * 
	 * @param options
	 * @param givenOption
	 */
	public void selectDropdownOption(List<WebElement> options, String givenOption) {

		for (WebElement e : options) {
			_normalWait(200);
			if (e.getText().equalsIgnoreCase(givenOption)) {
				e.click();
				break;
			}
		}
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This method is used to check the status of Checkbox and Radio
	 *           button
	 * 
	 * @param element
	 * @return Checkbox or Radio button's status
	 */
	public boolean checkboxStatus(WebElement checkbox) {
		boolean checkstatus = false;
		try {
			if (checkbox.isSelected())
				checkstatus = true;
		} catch (Exception e) {

		}
		return checkstatus;
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This method is used to check the page title
	 * 
	 * @param pageTitle in String
	 * @return
	 */
	public boolean verifyPageTitle(String pageTitle) {
		boolean flag = false;

		String actualPage = getDriver().getTitle();
		if (actualPage.equalsIgnoreCase(pageTitle) == true) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This method is used to generate random number
	 * 
	 * @param character length in integer format
	 * @return random number in integer format
	 */
	public static String generateRandomNumber(int charLength) {
		return String.valueOf(charLength < 1 ? 0
				: new Random().nextInt((9 * (int) Math.pow(10, charLength - 1)) - 1)
						+ (int) Math.pow(10, charLength - 1));
	}

}
