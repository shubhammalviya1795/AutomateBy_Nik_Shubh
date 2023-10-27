package POMClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLib.SelectClass;

public class PaymentPage {
	
	
	
	@FindBy(xpath = "//button[text() = \"Deliver Here\"]")
	private WebElement DeliverHerebtn;
	
	@FindBy(xpath = "//button[text() = \"CONTINUE\"]")
	private WebElement ContinueBtn;
	
	@FindBy(xpath = "//button[text() = \"Accept & Continue\"]")
	private WebElement AcceptandContinueBtn;
	
	@FindBy(xpath = "//input[@id=\"COD\"]")
	private WebElement CODRadioBtn;
	

	public void ClickCODRadioBtn()
	{
		CODRadioBtn.click();
	}

	
	public void ClickAcceptandContinueBtn()
	{
		AcceptandContinueBtn.click();
	}

	public void ClickContinueBtn()
	{
		ContinueBtn.click();
	}
	

	public void ClickDeliverHereBtn()
	{
		DeliverHerebtn.click();
	}

}
