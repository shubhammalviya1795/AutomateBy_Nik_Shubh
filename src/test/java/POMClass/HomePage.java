package POMClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLib.Action;

public class HomePage {

	@FindBy(xpath = "//input[@name = \"q\"]")
	private WebElement SearchBox;
	
	@FindBy(xpath = "//div[text() = \"APPLE iPhone 13 (Midnight, 128 GB)\"]")
	private WebElement searchIphone;
	
	@FindBy(xpath = "//button[@class=\"_2KpZ6l _2U9uOA ihZ75k _3AWRsL\"]")
	private WebElement BuyNowBtn;
	
	@FindBy(xpath = "//div[text() = \"Vinit\"]")
	private WebElement HoverOverProfile;
	
	
	@FindBy(xpath = "//a[@href=\"/account/?rd=0&link=home_account\"]")
	private WebElement MyProfile;
	
	public void clickOnLogin(String Value)
	{
		SearchBox.sendKeys(Value,Keys.ENTER);
	}
	
	public void clickOnIphone13()
	{
		searchIphone.click();
	}
	
	public void ClickBuyNowButton()
	{
		BuyNowBtn.click();
	}
	
	public void HoverOverOnProfile(WebDriver driver)
	{
	//	Action act = new Action(driver);
	//	HoverOverProfile.sendKeys(Value,Keys.ENTER);
	}
	
	public void ClickOnMyProfile()
	{
		MyProfile.click();
	}
	
}
