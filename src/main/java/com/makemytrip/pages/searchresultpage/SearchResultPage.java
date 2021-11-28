package com.makemytrip.pages.searchresultpage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.makemytrip.pages.homepage.AppHomePage;

public class SearchResultPage extends AppHomePage {

	@FindBy(xpath = "//p[contains(.,'Flights from')]")
	WebElement flightFromAndTo_WE;

	public void verify_search_result_should_be_displayed() {

		if (flightFromAndTo_WE.isDisplayed() == true) {
			assertTrue(true);
		} else {
			assertFalse(false);
		}
	}

}
