package in.upskills.retailm1.steps;

import in.upskills.retailm1.pages.AccountLoginPage;
import in.upskills.retailm1.pages.MyAccountPage;
import in.upskills.retailm1.pages.RetailHomePage;
import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Step;

public class LoginWithRegisteredUserSteps extends BaseTestStep{

	RetailHomePage retailHomePage;
	AccountLoginPage accountLoginPage;
	MyAccountPage myAccountPage;
	
	@Step
	public void verify_user_move_to_account_icon_and_select_register_login_link() {
		retailHomePage.user_move_to_account_icon_and_click_on_login_or_register_link();
	}
	
	@Step
	public void verify_user_is_on_login_or_register_page() {
		accountLoginPage.verify_new_customer_label_on_login_page();
	}
	
	@Step
	public void verify_user_entered_his_credentials(DataTable table) {
		accountLoginPage.enter_credentials_of_the_user(table);
	}
	
	@Step
	public void verify_user_click_on_login_button() {
		accountLoginPage.click_on_login_button();
	}
	
	@Step
	public void verify_user_is_on_my_account_page() {
		myAccountPage.verify_my_account_page();
	}
}
