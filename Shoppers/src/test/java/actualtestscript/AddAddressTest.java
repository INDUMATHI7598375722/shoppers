package actualtestscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import fileutility.ReadExcel;
import genericutility.WebDriverUtility;
import objectrepository.AddressPage;
import objectrepository.HomePage;
import objectrepository.MyProfile;

@Listeners(listnersimplementation.ListnerClass.class)
public class AddAddressTest extends BaseClass {
	@Test
	public void addAddressTest() {
		HomePage homePage = new HomePage(driver);
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		webDriverUtility.clickOnElement(homePage.getSettingsicon());
		webDriverUtility.clickOnElement(homePage.getMyProfile());
		homePage.getMyProfile().click();
		MyProfile myprofile = new MyProfile(driver);
		webDriverUtility.clickOnElement(myprofile.getMyAddresses());
		AddressPage addresspage = new AddressPage(driver);
		webDriverUtility.clickOnElement(addresspage.getAddAddress());
		// addresspage.getAddAddress().click();
		webDriverUtility.clickOnElement(addresspage.getHome());
		// addresspage.getHome().click();
		ReadExcel excel = new ReadExcel();
		String nameValue = excel.fetchSingleData("Address", 1, 0);

		webDriverUtility.sendText(addresspage.getName(), nameValue);
		// Assert.fail();
		String houseInfo = excel.fetchSingleData("Address", 1, 1);
		webDriverUtility.sendText(addresspage.getHouseInfo(), houseInfo);
		String streetInfo = excel.fetchSingleData("Address", 1, 2);
		webDriverUtility.sendText(addresspage.getStreetInfo(), streetInfo);
		String landmark = excel.fetchSingleData("Address", 1, 3);
		webDriverUtility.sendText(addresspage.getLandmark(), landmark);

		webDriverUtility.selectByVisisbleText(addresspage.getCountry(), "India");
		webDriverUtility.selectByVisisbleText(addresspage.getState(), "Tamil Nadu");
		webDriverUtility.selectByVisisbleText(addresspage.getCity(), "Dharmapuri");
		String pincode = excel.fetchSingleData("Address", 1, 4);
		webDriverUtility.sendText(addresspage.getPincode(), pincode);
		String phoneno = excel.fetchSingleData("Address", 1, 5);
		webDriverUtility.sendText(addresspage.getPhoneNumber(), phoneno);
		webDriverUtility.clickOnElement(addresspage.getAddAddress1());
		Reporter.log("Address Added Successfully", true);
	}
}
