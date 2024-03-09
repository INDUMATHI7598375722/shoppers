package actualtestscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import genericutility.WebDriverUtility;
import objectrepository.DeletePage;
import objectrepository.HomePage;
import objectrepository.MyProfile;

public class DeleteAddressTest extends BaseClass{
	@Test
	public void deleteAddressTest()
	{
		HomePage homePage=new HomePage(driver);
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		webDriverUtility.clickOnElement(homePage.getSettingsicon());
		webDriverUtility.clickOnElement(homePage.getMyProfile());
		//homePage.getMyProfile().click();
		MyProfile myprofile=new MyProfile(driver);
		webDriverUtility.clickOnElement(myprofile.getMyAddresses());
		DeletePage deletepage=new DeletePage(driver);
		webDriverUtility.clickOnElement(deletepage.getDeleteIcon());
		
		webDriverUtility.clickOnElement(deletepage.getClickYes());

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
	
		webDriverUtility.acceptAlert(driver);
		Reporter.log("Address Deleted Successfully",true);
	}

}
