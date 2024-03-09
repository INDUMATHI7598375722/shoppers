package baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import fileutility.ReadProperty;
import genericutility.WebDriverUtility;
import listnersimplementation.ListnerClass;
import objectrepository.LoginPage;
import objectrepository.LogoutPage;
import objectrepository.WelcomePage;

public class BaseClass  extends ListnerClass
{
	 public WebDriver driver;
	 public static WebDriver sdriver;
	// public WebDriverUtility webDriverUtility;
	
	 //@Parameters("browser")
	 @BeforeClass(alwaysRun=true)
	 public void openBrowser()
	 {
		/* Object browser;
		if(browser.equals("Chrome"))
		 {
			 driver =new ChromeDriver(); 
		 }
		 else if (browser.equals("Edge"))
		 {
			 driver =new EdgeDriver();
		 }
		 else
		 {
			 driver =new ChromeDriver();
			 
		 }
		*/
		driver =new ChromeDriver();
		sdriver=driver;
		driver.manage().window().maximize();
		
		
		ReadProperty properties =new ReadProperty();
		String url=properties.fetchProperty("url");
		driver.get(url);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		
		WelcomePage welcomPage=new WelcomePage(driver);
		webDriverUtility.clickOnElement(welcomPage.getLoginButton());
		
		//driver.findElement(By.id("loginBtn")).click();

		Reporter.log("Browser opened Successfully ",true);
	 }
	
	
	@BeforeMethod(alwaysRun=true)
	public void login()
	{
		ReadProperty properties =new ReadProperty();
		
		String username =properties.fetchProperty("un");
		String password=properties.fetchProperty("pwd");
		LoginPage login=new LoginPage(driver);
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		login.getEmailTextField().sendKeys(username);
		login.getPasswordTextField().sendKeys(password);
		webDriverUtility.clickOnElement(login.getLogin());
		//login.getLogin().click();
		Reporter.log("Logged in Successfully ",true);
		
		
		
		//SoftAssert soft=new SoftAssert();
			//soft.assertEquals(driver.getCurrentUrl().contains("user-signin"), true);
		//soft.assertAll();
		//driver.findElement(By.id("Email")).sendKeys(username);
		//driver.findElement(By.id("Password")).sendKeys(password);
		//driver.findElement(By.xpath("//span[text()='Login']")).click();
		//driver.findElement(By.xpath("//*[name()='svg' and @data-testid='SettingsIcon']")).click();
		//driver.findElement(By.xpath("//ul[@role='menu']/li[1]")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Addresses')]")).click();
		
	}
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
	
		LogoutPage logout=new LogoutPage(driver);
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(logout.getSettingsIcon())).click();
		wait.until(ExpectedConditions.elementToBeClickable(logout.getLogout())).click();
		*/
		
		webDriverUtility.clickOnElement(logout.getSettingsIcon());
		webDriverUtility.clickOnElement(logout.getLogout());
			//driver.findElement(By.xpath("//*[name()='svg' and @data-testid='SettingsIcon']")).click();		
			//driver.findElement(By.xpath("//ul[@role='menu']/li[7]")).click();
			Reporter.log("Logged out Successfully",true);
	}


	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.quit();
		Reporter.log("Browser Closed Successfully",true);
	}




	
}
	

	