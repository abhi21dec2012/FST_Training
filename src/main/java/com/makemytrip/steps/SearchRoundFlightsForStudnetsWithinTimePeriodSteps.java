package com.makemytrip.steps;

import com.makemytrip.pages.homepage.AppHomePage;
import com.makemytrip.pages.searchflight.SearchFlightPage;

import net.thucydides.core.annotations.Step;

public class SearchRoundFlightsForStudnetsWithinTimePeriodSteps extends BaseTestStep{

	
	SearchFlightPage searchFlightPage;
	AppHomePage appHomePage;
	
	@Step
	public void searching_flight_with_given_time_period() {
		searchFlightPage.select_departure_and_return_date();
	}
	
	@Step
	public void selecting_option_for_students_fares(){
		searchFlightPage.select_students_fare_option();
	}
	
	@Step
	public void searching_flight_with_selected_data() {
		searchFlightPage.click_On_search_with_selected_data();
	}
	
	
}
