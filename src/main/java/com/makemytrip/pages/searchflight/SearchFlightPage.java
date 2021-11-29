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

	@FindBy(xpath = "//li[contains(.,'Senior Citizen  FaresSenior Citizen FaresOnly')]")
	WebElement seniorCitizen_RBTN;
	
	@FindBy(xpath = "//li[contains(.,'Student  FaresStudent FaresOnly students above 12 years of age are eligible for')]")
	WebElement studentsFares_RBTN;
	
	@FindBy(xpath = "//a[contains(.,'Search')]")
	WebElement search_BTN;

	@FindBy(xpath = "//span[@class='langCardClose']")
	WebElement weAreNowAvailablePopUpClose_BTN;

	@FindBy(xpath = "//span[contains(.,'DEPARTURE')]")
	WebElement deaprtureDate_BTN;

	@FindBy(xpath = "(//div[contains(@class,'DayPicker-Day--today')])[1]")
	WebElement departureDate_WE;

	@FindBy(xpath = "//div[contains(@aria-label,'Fri Dec 31 2021')]")
	WebElement returnDate_WE;

	AppHomePage appHomePage;

	public void click_On_search_with_default_data() {
		if (loginSignUpForBestPrices_WE.isDisplayed() == true) {
			JavascriptExecutor executor = (JavascriptExecutor) appHomePage.getDriver();
			executor.executeScript("arguments[0].click();", search_BTN);
		} else {
			JavascriptExecutor executor = (JavascriptExecutor) appHomePage.getDriver();
			executor.executeScript("arguments[0].click();", search_BTN);
		}
	}
	
	public void click_On_search_with_selected_data() {
		if (loginSignUpForBestPrices_WE.isDisplayed() == true) {
			JavascriptExecutor executor = (JavascriptExecutor) appHomePage.getDriver();
			executor.executeScript("arguments[0].click();", search_BTN);
		} else {
			JavascriptExecutor executor = (JavascriptExecutor) appHomePage.getDriver();
			executor.executeScript("arguments[0].click();", search_BTN);
		}
	}

	public void select_roundtrip_option() {

		JavascriptExecutor executor = (JavascriptExecutor) appHomePage.getDriver();
		executor.executeScript("arguments[0].click();", roundTrip_RBTN);
	}

	public void select_senior_citizen_option() {

		JavascriptExecutor executor = (JavascriptExecutor) appHomePage.getDriver();
		executor.executeScript("arguments[0].click();", seniorCitizen_RBTN);
	}

	public void click_On_close_pop_up_banner() {
		if (weAreNowAvailablePopUpClose_BTN.isDisplayed() == true) {
			JavascriptExecutor executor = (JavascriptExecutor) appHomePage.getDriver();
			executor.executeScript("arguments[0].click();", weAreNowAvailablePopUpClose_BTN);
		} else {

		}
	}

	public void select_from_and_to_cities() {

	}

	public void select_dearture_and_return_date() {

		JavascriptExecutor executor = (JavascriptExecutor) appHomePage.getDriver();
		executor.executeScript("arguments[0].click();", deaprtureDate_BTN);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		executor.executeScript("arguments[0].click();", departureDate_WE);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		executor.executeScript("arguments[0].click();", returnDate_WE);
	}
	
	public void select_studnets_fare_option() {

		JavascriptExecutor executor = (JavascriptExecutor) appHomePage.getDriver();
		executor.executeScript("arguments[0].click();", studentsFares_RBTN);
	}

}
