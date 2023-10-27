package POMClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLib.SelectClass;

public class AddAddressPage {

	@FindBy(xpath = "//input[@name=\"name\"]")
	private WebElement NameField;
	

	@FindBy(xpath = "//input[@name=\"phone\"]")
	private WebElement PhoneNumber;
	
	@FindBy(xpath = "//input[@name=\"pincode\"]")
	private WebElement PinCode;
	
	@FindBy(xpath = "//input[@name=\"addressLine2\"]")
	private WebElement Loacality;
	
	
	@FindBy(xpath = "//textarea[@name=\"addressLine1\"]")
	private WebElement Address;
	
	@FindBy(xpath = "//input[@name=\"city\"]")
	private WebElement City;
	
	@FindBy(xpath = "//input[@id = \"HOME\"]")
	private WebElement RadiobtnHOME;
	
	@FindBy(xpath = "//button[text() = \"Save\"]")
	private WebElement SaveButton;
	
	@FindBy(xpath = "//select[@name=\"state\"]")
	private WebElement state;
	
	
	public void SelectState()
	{
		SelectClass sel = new SelectClass();
		sel.selectbyvisibletext(state);
	}
	
	public void ClickSaveButton()
	{
		SaveButton.click();
	}
	
	public void ClickRadiobtnHOME()
	{
		RadiobtnHOME.click();
	}
	
	
	public void EnterCity(String Value)
	{
		City.sendKeys(Value);
	}
	
	
	public void EnterAddress(String Value)
	{
		Address.sendKeys(Value);
	}
	
	public void EnterLoacality(String Value)
	{
		Loacality.sendKeys(Value);
	}
	
	
	public void EnterPinCode(String Value)
	{
		PinCode.sendKeys(Value);
	}
	
	
	public void EnterNameText(String Value)
	{
		NameField.sendKeys(Value);
	}
	
	public void EnterPhoneNumberText(String Value)
	{
		PhoneNumber.sendKeys(Value);
	}
}
