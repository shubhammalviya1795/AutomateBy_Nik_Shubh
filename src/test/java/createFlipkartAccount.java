import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POMClass.LoginPage;






public class createFlipkartAccount {
	
	
public static void main(String[] args) throws InterruptedException
{

}

public void flipkart() throws InterruptedException
{
WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);
	login.clickOnLogin();
	Thread.sleep(2000);
}


}