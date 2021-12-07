package in.upskills.retailm1.pages;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedSuccessPage extends RetailHomePage {

	@FindBy(xpath = "//p[contains(.,'Congratulations! Your new account has been successfully created!')]")
	private WebElement accounCraetedSuccessfullyMsg_WE;

	/**
	 * @author Abhinav Srivastava
	 * @implNote Verify user is on Account Created Success Page
	 * 
	 */
	public void verify_account_created_success_page() {
		if ((verifyPageTitle("Your Account Has Been Created!")
				&& isElementDisplayed(accounCraetedSuccessfullyMsg_WE)) == true) {
			assertTrue(true);
		} else {
			assertFalse(false);
		}

	}

}
