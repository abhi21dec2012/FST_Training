package in.upskills.retailm1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.makemytrip.pages.homepage.BasePage;

public class RetailHomePage extends BasePage{

	@FindBy(xpath = "//a[@id='site_logo']")	
	private WebElement siteReatailLogo_LINK;
	
	@FindBy(xpath = "//a[contains(@target,'_self')]")	
	private WebElement homeLogo_LINK;
	
	@FindBy(xpath = "//i[@class='tb_icon ico-linea-ecommerce-bag']")
	private WebElement eCommerceBagLogo_LINK;
	
	@FindBy(xpath = "//i[@class='fa fa-user-o']")
	private WebElement userProfileLogo_LINK;
	
	@FindBy(xpath = "//i[@class='ico-linea-basic-heart']")
	private WebElement wishListLogo_LINK;
	
	@FindBy(xpath = "//a[contains(@href,'/account/login')]")
	private WebElement loginOrRegister_LINK;
	
	/**
	 * @author Abhinav Srivastava
	 * @implNote Move to the Account icon and click on the Login Or Register link 
	 * 
	 */
	public void user_move_to_account_icon_and_click_on_login_or_register_link() {
		
		moveToElelment(userProfileLogo_LINK);
		javaScriptClickOn(loginOrRegister_LINK);
	}
	
	
	
	
}
