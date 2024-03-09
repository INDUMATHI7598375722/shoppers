package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeletePage extends BasePage{

	public DeletePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="(//*[name()='svg' and @data-testid=\"DeleteIcon\"])[2]")
	private WebElement deleteIcon;

	public WebElement getDeleteIcon() {
		return deleteIcon;
	}
	
	@FindBy(xpath="(//button[text()='Yes'])[2]")
	private WebElement clickYes;

	public WebElement getClickYes() {
		return clickYes;
	}

}
