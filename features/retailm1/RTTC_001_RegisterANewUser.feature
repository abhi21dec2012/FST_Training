@FST_Assignment
Feature: Launch the application and register a new random user from registration page

Background: User is on the application home page
	Given I am on Application home page
	When I move to Account icon to click on Register or Login link
	Then I should be on Account Login page
	
  @RegisterANewUserWithGivenData
  Scenario: Register a new user from the registration page 
    Given I am on the Register Account Page
    And I Enter my Personal details
    |	Fields				| 					Values		|
		|	First Name		| 			manzoor				|
		|	Last Name			|				mehadi				|
		|	Email Address	|		manzoor@gmail.com	|
		|	Telephone			|		9876543210				|
    And I Enter my address 
    | Fields			|	  Values							|
		| Address 1   |   yeshwanthapur				|
		| Address 2   |   bangalore  					|
		| City        |   bangalore						|
		| Post Code   |   560022  						|
    And I select my Country and State
    And I enter my password
    | Fields                 | Values              |
		| Password               | manzoor1       		 |
		| Password Confirm       | manzoor1            | 
		And I select No radio button in Subscribe under Newsletter
		And I select on the Privacy policy checkbox 
		And I click on the Continue button 
		Then I should see a Success message on the Your Account had been created! Page
		
    
    
    