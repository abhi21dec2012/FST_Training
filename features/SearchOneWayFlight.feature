@SearchOneWayFlight
Feature: Search One Way Flight
  @SearchOneWayFlightWithDefaultData
  Scenario: Search One Way Flight With The Deafult Data
    Given I am on Application home page
    When I am searching flight with default data
    Then I should be successfully searched the flights
    
    
    