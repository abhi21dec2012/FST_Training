package com.makemytrip.stedefinations;

import com.makemytrip.steps.SearchFlightResultSteps;
import com.makemytrip.steps.SearchRoundTripFlightForSCSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchRoundTripFlightsForSCStepDefination {

	@Steps
	SearchRoundTripFlightForSCSteps searchRoundTripFlightForSCSteps;

	@Steps
	SearchFlightResultSteps searchFlightResultSteps;

	@When("I have selected Round trip option")
	public void i_have_selected_round_trip_option() {

		searchRoundTripFlightForSCSteps.searching_flights_for_round_trip();
	}

	@When("I have selected Senior Citizens option with default date")
	public void i_have_selected_senior_citizens_option_with_default_date() {

		searchRoundTripFlightForSCSteps.selecting_option_for_senior_citizen();
		searchRoundTripFlightForSCSteps.searching_flight_with_default_data();
	}

	@Then("I should be successfully searched the flights for round trip")
	public void i_should_be_successfully_searched_the_flights_for_round_trip() {

		searchFlightResultSteps.search_result_page_for_round_trip_displayed();
	}

}
