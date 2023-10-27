package POMClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInformationPage {
	

	@FindBy(xpath = "//div[text() = \"Manage Addresses\"]")
	private WebElement ManageAddress;
	
	
	@FindBy(xpath = "//div[@class=\"_1QhEVk\"]")
	private WebElement AddNewAddress;
	
	
	public void clickOnManageAddress(String Value)
	{
		ManageAddress.click();
	}

	public void clickOnAddNewAddress()
	{
		AddNewAddress.click();
	}
	
}
