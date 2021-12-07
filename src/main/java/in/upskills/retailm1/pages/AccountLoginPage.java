package in.upskills.retailm1.pages;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.datatable.DataTable;

public class AccountLoginPage extends RetailHomePage {

	@FindBy(xpath = "//h2[contains(.,'New Customer')]")
	private WebElement newCustomerLabel_WE;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement userEmailAddress_INP;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement userPassword_INP;

	@FindBy(xpath = "//input[contains(@value,'Login')]")
	private WebElement login_BTN;

	@FindBy(xpath = "//a[contains(.,'Register')]")
	private WebElement register_BTN;

	/**
	 * @author Abhinav Srivastava
	 * @implNote Verify New Customer label on the login page
	 * 
	 */
	public void verify_new_customer_label_on_login_page() {
		boolean flag=false;
		if(isElementDisplayed(newCustomerLabel_WE)==true) {
			flag = true;
			assertTrue(flag);
		}else {
			assertFalse(flag);
		}
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote Click on the register button
	 * 
	 */
	public void click_on_register_button() {
		javaScriptClickOn(register_BTN);
	}
	
	/**
	 * @author Abhinav Srivastava
	 * @implNote Enter credentials for the user
	 * 
	 */
	public void enter_credentials_of_the_user(DataTable table) {
		List<List<String>> data = table.asLists(String.class);

		inputText(userEmailAddress_INP, data.get(1).get(1));
		inputText(userPassword_INP, data.get(2).get(1));
	}
	
	/**
	 * @author Abhinav Srivastava
	 * @implNote Click on the Login button
	 * 
	 */
	public void click_on_login_button() {
		javaScriptClickOn(login_BTN);
	}

}
