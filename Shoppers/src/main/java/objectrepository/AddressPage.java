package objectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BasePage
{

	public AddressPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddress;
	public WebElement getAddAddress() {
		return addAddress;
	}

	@FindBy(id="Home")
	private WebElement home;

	public WebElement getHome() {
		return home;
	}
	
	@FindBy(id="Name")
	private WebElement name;
	public WebElement getName() {
		return name;
	}
	
	
	@FindBy(id="House/Office Info")
	private WebElement houseInfo;

	public WebElement getHouseInfo() {
		return houseInfo;
	}
	

	@FindBy(id="Street Info")
	private WebElement streetInfo;

	public WebElement getStreetInfo() {
		return streetInfo;
	}
	
	@FindBy(id="Landmark")
	private WebElement landmark;
	
	
	
	public WebElement getLandmark() {
		return landmark;
	}
	@FindBy(id="Country")
	private WebElement country;
	
	public WebElement getCountry() {
		return country;
	}
	@FindBy(id="State")
	private WebElement state;
	
	public WebElement getState() {
		return  state;
	}
	
	@FindBy(id="City")
	private WebElement city;
	
	public WebElement getCity() {
		return city;
	}
	
	

	@FindBy(id="Pincode")
	private WebElement pincode;
	
	public WebElement getPincode() {
		return pincode;
	}
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumber;
	

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddress1;
	
	public WebElement getAddAddress1() {
		return addAddress1;
	}
	
	@FindBy(id="editaddress_fl")
	private WebElement updateIcon;

	public WebElement getUpdateIcon() {
		return updateIcon;
	
	}
}
	
