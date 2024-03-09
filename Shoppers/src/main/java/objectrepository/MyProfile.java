package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfile extends BasePage
{

	public MyProfile(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(xpath="//div[text()='My Addresses']")
	private WebElement myAddresses;
	
	
	public WebElement getMyAddresses() {
		return myAddresses;
	}
}
