package com.makemytrip.pages.searchresultpage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.makemytrip.pages.homepage.AppHomePage;

public class SearchResultPage extends AppHomePage {

	@FindBy(xpath = "//p[contains(.,'Flights from')]")
	WebElement flightFromAndTo_WE;

	@FindBy(xpath = "//p[contains(.,'and back')]")
	WebElement flightsForRoundTrip_WE;

	@FindBy(xpath = "//b[contains(.,'Showing itineraries with special fares  for Senior Citizens.')]")
	WebElement seniroCitizenFaresBanner_WE;
	
	@FindBy(xpath = "//b[contains(.,'Showing itineraries with special fares for the Students.')]")
	WebElement studentFaresBanner_WE;

	public void verify_search_result_should_be_displayed() {

		if (flightFromAndTo_WE.isDisplayed() == true) {
			assertTrue(true);
		} else {
			assertFalse(false);
		}
	}

	public void verify_search_result_for_round_trip_should_be_displayed() {

		if ((flightsForRoundTrip_WE.isDisplayed() && (seniroCitizenFaresBanner_WE.isDisplayed()) == true)) {
			assertTrue(true);
		} else {
			assertFalse(false);
		}
	}
	
	public void verify_search_result_for_round_trip_should_be_displayed_for_students_withintimeperiod() {

		if ((flightsForRoundTrip_WE.isDisplayed() && (studentFaresBanner_WE.isDisplayed()) == true)) {
			assertTrue(true);
		} else {
			assertFalse(false);
		}
	}

}
