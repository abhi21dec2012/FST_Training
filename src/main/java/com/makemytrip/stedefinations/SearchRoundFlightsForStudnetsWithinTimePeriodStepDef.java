package com.makemytrip.stedefinations;

import com.makemytrip.steps.SearchFlightResultSteps;
import com.makemytrip.steps.SearchRoundFlightsForStudnetsWithinTimePeriodSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchRoundFlightsForStudnetsWithinTimePeriodStepDef {

	@Steps
	SearchRoundFlightsForStudnetsWithinTimePeriodSteps searchRoundFlightsForStudnetsWithinTimePeriodSteps;

	@Steps
	SearchFlightResultSteps searchFlightResultSteps;

	@When("I have selectd dates within given time period")
	public void i_have_selectd_dates_within_given_time_period() {

		searchRoundFlightsForStudnetsWithinTimePeriodSteps.searching_flight_with_given_time_period();
	}

	@When("I have selected Student fares option")
	public void i_have_selected_student_fares_option() {

		searchRoundFlightsForStudnetsWithinTimePeriodSteps.selecting_option_for_students_fares();
		searchRoundFlightsForStudnetsWithinTimePeriodSteps.searching_flight_with_selected_data();
	}

	@Then("I should be successfully searched the flights for round trip for Students")
	public void i_should_be_successfully_searched_the_flights_for_round_trip_for_students() {

		searchFlightResultSteps.search_result_page_for_round_trip_displayed_for_studentfares_withintimeperiod();
	}

}
