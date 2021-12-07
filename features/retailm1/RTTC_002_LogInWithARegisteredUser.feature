@FST_Assignment
Feature: Launch the application and register a new random user from registration page

Background: User is on the application home page
	Given I am on Application home page
	When I move to Account icon to click on Register or Login link
	Then I should be on Account Login page
	
  @LoginWithARegisteredUser
  Scenario: Login with an already registered user 
    Given I am on the Login page
    When I Enter my credentials
    |	Fields								 | 		Values						 |
		|	Email Address					 |		manzoor@gmail.com	 |
		| Password               | 		manzoor1       		 |
    And I click on the Login button
		Then I should see that I am logged in successfully on My Account Page
		
    
    
    