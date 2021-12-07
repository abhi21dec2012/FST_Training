package in.upskills.retailm1.pages;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends RetailHomePage {

	@FindBy(xpath = "(//h2[contains(.,'My Account')])[1]")
	private WebElement myAccountLabel_WE;

	/**
	 * @author Abhinav Srivastava
	 * @implNote Verify user is on My Account Page
	 * 
	 */
	public void verify_my_account_page() {
		if ((verifyPageTitle("My Account") && isElementDisplayed(myAccountLabel_WE)) == true) {
			assertTrue(true);
		} else {
			assertFalse(false);
		}

	}

}
