package com.makemytrip.pages.searchflight;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.makemytrip.pages.homepage.AppHomePage;

public class SearchFlightPage extends AppHomePage {

	@FindBy(xpath = "//p[contains(.,'Login/Signup for Best Prices')]")
	WebElement loginSignUpForBestPrices_WE;

	@FindBy(xpath = "//li[@data-cy='oneWayTrip']")
	WebElement oneWayTrip_RBTN;

	@FindBy(xpath = "//li[contains(@data-cy,'roundTrip')]")
	WebElement roundTrip_RBTN;

	@FindBy(xpath = "//input[@id='fromCity']")
	WebElement fromCity_INP;

	@FindBy(xpath = "//input[@placeholder='To']")
	WebElement toCity_INP;

	@FindBy(xpath = "//label[contains(@for,'departure')]")
	WebElement departureDateCurrent_WE;

	@FindBy(xpath = "//a[contains(.,'Search')]")
	WebElement search_BTN;

	AppHomePage appHomePage;

	public void click_On_search_with_default_data() {
		if (loginSignUpForBestPrices_WE.isDisplayed() == true) {
			JavascriptExecutor executor = (JavascriptExecutor)appHomePage.getDriver();
			executor.executeScript("arguments[0].click();", search_BTN);
		} else {
			JavascriptExecutor executor = (JavascriptExecutor)appHomePage.getDriver();
			executor.executeScript("arguments[0].click();", search_BTN);
		}
	}

}
