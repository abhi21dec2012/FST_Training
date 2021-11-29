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

	/**
	 * @author Abhinav Srivastava
	 * @implNote This function will used to click on Search button
	 */
	public void click_On_search_with_default_data() {
		if (loginSignUpForBestPrices_WE.isDisplayed() == true) {
			javaScriptClickOn(search_BTN);
		} else {
			javaScriptClickOn(search_BTN);
		}
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This function will used to click on Search button
	 */
	public void click_On_search_with_selected_data() {
		if (loginSignUpForBestPrices_WE.isDisplayed() == true) {
			javaScriptClickOn(search_BTN);
		} else {
			javaScriptClickOn(search_BTN);
		}
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This function will used to select Round trip radio button
	 */
	public void select_roundtrip_option() {
		javaScriptClickOn(roundTrip_RBTN);
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This function will used to select Senior citizen radio button
	 */
	public void select_senior_citizen_option() {

		javaScriptClickOn(seniorCitizen_RBTN);
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This function will used to close on pop up banner
	 */
	public void click_On_close_pop_up_banner() {
		if (weAreNowAvailablePopUpClose_BTN.isDisplayed() == true) {
			javaScriptClickOn(weAreNowAvailablePopUpClose_BTN);
		} else {

		}
	}

	public void select_from_and_to_cities() {

	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This function will used to select departure and return dates
	 */
	public void select_departure_and_return_date() {

		javaScriptClickOn(deaprtureDate_BTN);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		javaScriptClickOn(departureDate_WE);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		javaScriptClickOn(returnDate_WE);
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote This function will used to select Students fare radio button
	 */
	public void select_students_fare_option() {

		javaScriptClickOn(studentsFares_RBTN);
	}

}
