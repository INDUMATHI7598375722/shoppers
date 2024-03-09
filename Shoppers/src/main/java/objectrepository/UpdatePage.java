package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdatePage extends BasePage{

	public UpdatePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="Home")
	private WebElement homeicon;
	public WebElement getHomeicon() {
		return homeicon;
	}
	
	@FindBy(id="House/Office Info")
	private  WebElement houseinfoadd;
	public WebElement getHouseinfoadd() {
		return houseinfoadd;
	}
	@FindBy(id="Update Address")
	private WebElement updateaddress;
	public WebElement getUpdateaddress() {
		return updateaddress;
	}
	
}
