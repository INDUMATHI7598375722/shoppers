package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[text()='I']")
	private WebElement settingsicon;
	
	public WebElement getSettingsicon() {
		return settingsicon;
	}
	
	@FindBy(xpath="//ul[@role='menu']/li[1]")
	private WebElement myProfile;

	public WebElement getMyProfile() {
		return myProfile;
	}

}
