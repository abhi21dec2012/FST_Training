package com.makemytrip.steps;

import com.makemytrip.pages.searchflight.SearchFlightPage;

import net.thucydides.core.annotations.Step;

public class SearchRoundTripFlightForSCSteps extends BaseTestStep{

SearchFlightPage searchFlightPage;
	
	@Step
	public void searching_flights_for_round_trip() {
		searchFlightPage.select_roundtrip_option();
	}
	
	@Step
	public void selecting_option_for_senior_citizen() {
		searchFlightPage.select_senior_citizen_option();
	}
	
	@Step
	public void searching_flight_with_default_data() {
		searchFlightPage.click_On_search_with_default_data();
	}
}
