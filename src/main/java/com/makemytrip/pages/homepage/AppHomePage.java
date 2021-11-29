package com.makemytrip.pages.homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppHomePage extends BasePage {

	@FindBy(xpath = "//p[contains(.,'Login/Signup for Best Prices')]")
	WebElement loginSignUpForBestPrices_WE;

	@FindBy(xpath = "//p[contains(.,'Login or Create Account')]")
	WebElement loginOrCreateAccount_BTNWE;
	
	@FindBy(xpath = "//span[@class='langCardClose']")
	WebElement weAreNowAvailablePopUpClose_BTNWE;
	

	public void clickOnLoginOrCreateAccount() {
		loginOrCreateAccount_BTNWE.click();
	}

}
