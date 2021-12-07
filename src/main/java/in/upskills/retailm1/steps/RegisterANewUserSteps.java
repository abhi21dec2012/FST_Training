package in.upskills.retailm1.steps;


import in.upskills.retailm1.pages.AccountCreatedSuccessPage;
import in.upskills.retailm1.pages.AccountLoginPage;
import in.upskills.retailm1.pages.RegisterAccountPage;
import in.upskills.retailm1.pages.RetailHomePage;
import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Step;

public class RegisterANewUserSteps extends BaseTestStep {

	RetailHomePage retailHomePage;
	AccountLoginPage accountLoginPage;
	RegisterAccountPage registerAccountPage;
	AccountCreatedSuccessPage accountCreatedSuccessPage;

	@Step
	public void verify_user_move_to_account_icon_and_select_register_login_link() {
		retailHomePage.user_move_to_account_icon_and_click_on_login_or_register_link();
	}
	
	@Step
	public void verify_user_is_on_login_or_register_page() {
		accountLoginPage.verify_new_customer_label_on_login_page();
	}
	
	@Step
	public void verify_user_click_on_register_button_on_login_page() {
		accountLoginPage.click_on_register_button();
	}
	
	@Step
	public void verify_user_is_on_register_account_page() {
		registerAccountPage.verify_register_account_page();
	}

	@Step
	public void user_enter_his_personal_details(DataTable table) {
		registerAccountPage.enter_personal_details_of_the_user(table);
	}

	@Step
	public void user_enter_his_address_details(DataTable table) {
		registerAccountPage.enter_address_details_of_the_user(table);
	}
	
	@Step
	public void user_select_country_and_state() {
		registerAccountPage.select_country_and_state_or_region_of_the_user();;
	}

	@Step
	public void user_enter_his_password_details(DataTable table) {
		registerAccountPage.enter_password_details_of_the_user(table);
	}

	@Step
	public void user_unsubscribe_for_the_newsletter() {
		registerAccountPage.select_subscription_for_newsletter();
	}

	@Step
	public void user_select_the_checkbox_for_privacy_policy() {
		registerAccountPage.select_checkbox_for_privacy_policy();
	}
	
	@Step
	public void user_click_on_continue_button() {
		registerAccountPage.click_on_continue_button();
	}
	
	@Step
	public void user_account_created_successfully() {
		accountCreatedSuccessPage.verify_account_created_success_page();
	}

}
