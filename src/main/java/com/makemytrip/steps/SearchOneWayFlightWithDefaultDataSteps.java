package com.makemytrip.steps;

import com.makemytrip.pages.homepage.AppHomePage;
import com.makemytrip.pages.searchflight.SearchFlightPage;

import net.thucydides.core.annotations.Step;

public class SearchOneWayFlightWithDefaultDataSteps extends BaseTestStep{
	
	SearchFlightPage searchFlightPage;
	AppHomePage appHomePage;
	
	@Step
	public void searching_flight_with_default_data() {
		searchFlightPage.click_On_search_with_default_data();
	}

}
