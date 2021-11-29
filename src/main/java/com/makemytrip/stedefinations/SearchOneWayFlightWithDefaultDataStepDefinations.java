package com.makemytrip.stedefinations;

import com.makemytrip.steps.SearchFlightResultSteps;
import com.makemytrip.steps.SearchOneWayFlightWithDefaultDataSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchOneWayFlightWithDefaultDataStepDefinations {
	
	@Steps
	SearchOneWayFlightWithDefaultDataSteps searchOneWayFlightWithDeafaultDataSteps;
	
	@Steps
	SearchFlightResultSteps searchFlightResultSteps;

	@When("I am searching flight with default data")
	public void i_am_searching_flight_with_default_data() {
		searchOneWayFlightWithDeafaultDataSteps.searching_flight_with_default_data();
		
	}

	@Then("I should be successfully searched the flights")
	public void i_should_be_successfully_searched_the_flights() {
		searchFlightResultSteps.search_result_page_displayed();
	}
}
