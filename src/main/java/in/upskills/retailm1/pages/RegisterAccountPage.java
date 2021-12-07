package in.upskills.retailm1.pages;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.datatable.DataTable;

public class RegisterAccountPage extends RetailHomePage {

	@FindBy(xpath = "//p[contains(.,'If you already have an account with us, please login at the login page.')]")
	private WebElement registerAccountPageLabel;

	// Your Personal Details
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement userFirstName_INP;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement userLastName_INP;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement userEmailId_INP;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneNumber_INP;

	// Your Address
	@FindBy(xpath = "//input[@id='input-address-1']")
	private WebElement addressLine1_INP;

	@FindBy(xpath = "//input[@id='input-address-2']")
	private WebElement addressLine2_INP;

	@FindBy(xpath = "//input[@id='input-city']")
	private WebElement city_INP;

	@FindBy(xpath = "//input[@id='input-postcode']")
	private WebElement postCode_INP;

	@FindBy(xpath = "//select[@id='input-country']//option")
	private List<WebElement> country_DRPDWN;

	@FindBy(xpath = "//select[@id='input-zone']//option")
	private List<WebElement> regionOrState_DRPDWN;

	// Your Password
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password_INP;

	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement passwordConfirm_INP;

	// Newsletter
	@FindBy(xpath = "(//input[@name='newsletter'])[1]")
	private WebElement subscribeYes_RBTN;

	@FindBy(xpath = "(//input[@name='newsletter'])[2]")
	private WebElement subscribeNo_RBTN;

	// Privacy policy declaration
	@FindBy(xpath = "//input[contains(@name,'agree')]")
	private WebElement privacyPolicy_CHKBOX;

	// Continue button
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continue_BTN;

	/**
	 * @author Abhinav Srivastava
	 * @implNote Verify user is on Register Account Page
	 * 
	 */
	public void verify_register_account_page() {
		if ((verifyPageTitle("Register Account") && isElementDisplayed(registerAccountPageLabel)) == true) {
			assertTrue(true);
		} else {
			assertFalse(false);
		}

	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote Enter personal details of the user
	 * 
	 */
	public void enter_personal_details_of_the_user(DataTable table) {
		List<List<String>> data = table.asLists(String.class);

		inputText(userFirstName_INP, data.get(1).get(1));
		inputText(userLastName_INP, data.get(2).get(1));
		String userRandomEmailID = data.get(3).get(1).replaceAll("@gmail.com", "") + generateRandomNumber(6)
				+ "@gmail.com";
		inputText(userEmailId_INP, userRandomEmailID);
		inputText(telephoneNumber_INP, data.get(4).get(1));
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote Enter Address details of the user
	 * 
	 */
	public void enter_address_details_of_the_user(DataTable table) {
		List<List<String>> data = table.asLists(String.class);

		inputText(addressLine1_INP, data.get(1).get(1));
		inputText(addressLine2_INP, data.get(2).get(1));
		inputText(city_INP, data.get(3).get(1));
		inputText(postCode_INP, data.get(4).get(1));
		scrollDownPageBy250Pixel();
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote Enter Country and State/Region of the user
	 * 
	 */
	public void select_country_and_state_or_region_of_the_user() {

		selectDropdownOption(country_DRPDWN, "India");
		selectDropdownOption(regionOrState_DRPDWN, "Karnataka");
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote Enter Password details for the user
	 * 
	 */
	public void enter_password_details_of_the_user(DataTable table) {
		List<List<String>> data = table.asLists(String.class);

		inputText(password_INP, data.get(1).get(1));
		inputText(passwordConfirm_INP, data.get(2).get(1));
		scrollDownPageBy250Pixel();
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote Select subscription for the newsletter
	 * 
	 */
	public void select_subscription_for_newsletter() {
		if (checkboxStatus(subscribeNo_RBTN) == false) {
			javaScriptClickOn(subscribeNo_RBTN);
		}
		scrollDownPageBy250Pixel();
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote Select checkbox for Privacy policy
	 * 
	 */
	public void select_checkbox_for_privacy_policy() {
		if (checkboxStatus(privacyPolicy_CHKBOX) == false) {
			javaScriptClickOn(privacyPolicy_CHKBOX);
		}
	}

	/**
	 * @author Abhinav Srivastava
	 * @implNote Click on Continue button to register the user
	 * 
	 */
	public void click_on_continue_button() {
		javaScriptClickOn(continue_BTN);
	}
}
