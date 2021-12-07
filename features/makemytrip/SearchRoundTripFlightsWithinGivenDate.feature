@SearchFlights
Feature: Search Round Trip flights for Student fares within given dates

  @SearchRoundTripFlightsForStudentsWithinDates
  Scenario: Search Round trip flights for the Students within given time period
    Given I am on Application home page
    When I have selected Round trip option
    And I have selectd dates within given time period
    And I have selected Student fares option
    Then I should be successfully searched the flights for round trip for Students
