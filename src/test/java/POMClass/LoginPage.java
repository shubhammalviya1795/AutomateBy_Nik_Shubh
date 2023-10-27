package POMClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	//@FindBy(id = "reasons")
	//public WebElement reasonsPopUpDrodown;

	@FindBy(xpath = "//a[text() = \"Login\"]")
	private WebElement loginButton;
	
	@FindBy(xpath = "//input[@type = \"text\" and @class=\"_2IX_2- VJZDxU\"]")
	private WebElement EnterMobileNumber;
	
	@FindBy(xpath = "//button[text() = 'Request OTP']")
	private WebElement EnterOtp;
	
	@FindBy(xpath = "//a[text() = \"New to Flipkart? Create an account\"]")
	private WebElement ClickOnCreateAccount;
	
	@FindBy(xpath = "//span[text() = \"CONTINUE\"]")
	private WebElement Continue;
	
	public void clickOnLogin()
	{
		loginButton.click();
	}
	
	public void EnterMobileNumberValue(String Value)
	{
		EnterMobileNumber.sendKeys(Value);
	}
	
	public void ClickOnCreateAccount()
	{
		ClickOnCreateAccount.click();
	}
	
	public void ClickOnContinueButton()
	{
		Continue.click();
	}

}
