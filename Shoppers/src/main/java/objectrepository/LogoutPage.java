package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {

	public LogoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//div[text()='I']")
	private WebElement settingsIcon;
	public WebElement getSettingsIcon() {
		return settingsIcon;
	}

	@FindBy(xpath="//ul[@role='menu']/li[7]")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
}
