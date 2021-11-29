@SearchFlights
Feature: Search Round Trip flights for Senior Citizens fares

  @SearchRoundTripFlightsForSeniorCitizens
  Scenario: Search Round trip flights for the Senior citizens with default data
    Given I am on Application home page
    When I have selected Round trip option
    And I have selected Senior Citizens option with default date
    Then I should be successfully searched the flights for round trip
