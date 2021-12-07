package in.upskills.retailm1.stepdefinations;

import in.upskills.retailm1.steps.LoginWithRegisteredUserSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RTTC_002_LoginWithRegisteredUserStepDefination {
	
	@Steps
	LoginWithRegisteredUserSteps loginWithRegisteredUserSteps;

	@Given("I am on the Login page")
	public void i_am_on_the_login_page() {
		loginWithRegisteredUserSteps.verify_user_is_on_login_or_register_page();
	}

	@When("I Enter my credentials")
	public void i_enter_my_credentials(DataTable dataTable) {
		loginWithRegisteredUserSteps.verify_user_entered_his_credentials(dataTable);
	}

	@When("I click on the Login button")
	public void i_click_on_the_login_button() {
		loginWithRegisteredUserSteps.verify_user_click_on_login_button();
	}

	@Then("I should see that I am logged in successfully on My Account Page")
	public void i_should_see_that_i_am_logged_in_successfully_on_my_account_page() {
		loginWithRegisteredUserSteps.verify_user_is_on_my_account_page();
	}

}
