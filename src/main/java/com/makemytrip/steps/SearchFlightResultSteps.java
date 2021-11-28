package com.makemytrip.steps;

import com.makemytrip.pages.searchresultpage.SearchResultPage;

import net.thucydides.core.annotations.Step;

public class SearchFlightResultSteps extends BaseTestStep{
	
	SearchResultPage searchResultPage;
	
	@Step
	public void search_result_page_displayed() {
		searchResultPage.verify_search_result_should_be_displayed();
	}
	
	@Step
	public void search_result_page_for_round_trip_displayed() {
		searchResultPage.verify_search_result_for_round_trip_should_be_displayed();
	}

}
