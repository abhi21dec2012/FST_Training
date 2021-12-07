package in.upskills.retailm1.steps;

import in.upskills.retailm1.pages.RetailHomePage;
import net.thucydides.core.annotations.Step;

public class BaseTestStep {

	
	RetailHomePage retailHomePage;
	
	@Step
	public void i_am_on_application_home_page() {
		retailHomePage.getDriver().get("http://retailm1.upskills.in/");
		retailHomePage.getDriver().manage().window().maximize();
	}
	
}
