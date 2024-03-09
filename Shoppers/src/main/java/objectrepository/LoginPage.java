package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}


	
	@FindBy(id="Password") 
	private WebElement passwordTextField;
	
	
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement login;



	public WebElement getLogin() {
		return login;
	}

	
	
	

}
 