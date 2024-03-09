package actualtestscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import fileutility.ReadExcel;
import genericutility.WebDriverUtility;
import objectrepository.AddressPage;
import objectrepository.HomePage;
import objectrepository.MyProfile;
import objectrepository.UpdatePage;

public class UpdateAddressTest extends BaseClass {
	@Test
	public void updateAddressTest()
	{
		HomePage homePage = new HomePage(driver);
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		webDriverUtility.clickOnElement(homePage.getSettingsicon());
		webDriverUtility.clickOnElement(homePage.getMyProfile());
		homePage.getMyProfile().click();
		MyProfile myprofile = new MyProfile(driver);
		webDriverUtility.clickOnElement(myprofile.getMyAddresses());
		AddressPage addressPage=new AddressPage(driver);
		
		webDriverUtility.clickOnElement(addressPage.getUpdateIcon());
		UpdatePage updatepage=new UpdatePage(driver);
		webDriverUtility.clickOnElement(updatepage.getHouseinfoadd());
		ReadExcel excel=new ReadExcel();
		String houseInfo= excel.fetchSingleData("Address",2,3 );
		webDriverUtility.sendText(updatepage.getHomeicon(),houseInfo );
		webDriverUtility.clickOnElement(updatepage.getUpdateaddress());
		Reporter.log("Address Updated Successfully",true);
	}

}
