package in.upskills.retailm1.stepdefinations;

import in.upskills.retailm1.steps.RegisterANewUserSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RTTC_001_RegisterANewUserStepDefination {
	
	@Steps
	RegisterANewUserSteps registerANewUserSteps;

	@When("I move to Account icon to click on Register or Login link")
	public void i_move_to_account_icon_to_click_on_register_or_login_link() {
		registerANewUserSteps.verify_user_move_to_account_icon_and_select_register_login_link();
	}

	@Then("I should be on Account Login page")
	public void i_should_be_on_account_login_page() {
		registerANewUserSteps.verify_user_is_on_login_or_register_page();
	}

	@Given("I am on the Register Account Page")
	public void i_am_on_the_register_account_page() {
		registerANewUserSteps.verify_user_click_on_register_button_on_login_page();
		registerANewUserSteps.verify_user_is_on_register_account_page();
	}

	@Given("I Enter my Personal details")
	public void i_enter_my_personal_details(DataTable dataTable) {
		registerANewUserSteps.user_enter_his_personal_details(dataTable);
	}

	@Given("I Enter my address")
	public void i_enter_my_address(DataTable dataTable) {
	   registerANewUserSteps.user_enter_his_address_details(dataTable);
	}

	@Given("I select my Country and State")
	public void i_select_my_country_and_state() {
		registerANewUserSteps.user_select_country_and_state();
	}

	@Given("I enter my password")
	public void i_enter_my_password(DataTable dataTable) {
	   registerANewUserSteps.user_enter_his_password_details(dataTable);
	}

	@Given("I select No radio button in Subscribe under Newsletter")
	public void i_select_no_radio_button_in_subscribe_under_newsletter() {
	    registerANewUserSteps.user_unsubscribe_for_the_newsletter();
	}

	@Given("I select on the Privacy policy checkbox")
	public void i_select_on_the_privacy_policy_checkbox() {
	    registerANewUserSteps.user_select_the_checkbox_for_privacy_policy();
	}

	@Given("I click on the Continue button")
	public void i_click_on_the_continue_button() {
	    registerANewUserSteps.user_click_on_continue_button();
	}

	@Then("I should see a Success message on the Your Account had been created! Page")
	public void i_should_see_a_success_message_on_the_your_account_had_been_created_page() {
		registerANewUserSteps.user_account_created_successfully();
	}
}
