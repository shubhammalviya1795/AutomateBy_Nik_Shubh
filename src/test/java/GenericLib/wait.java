package GenericLib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class wait {

	WebDriverWait wait;
	
	public static void implicitlyWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	
	public void waitForXpath(WebDriver driver, WebElement xpath) {
		/*
		 * Used mostly for verifying correct page has loaded This method waits
		 * for an xpath to be clicked Will time out after 20 seconds if element
		 * not found
		 */

		 wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}

	public void waitForPresenceOfelementLocated(WebDriver driver, WebElement xpath) {
		/*
		 * Used mostly for verifying correct page has loaded This method waits
		 * for an xpath to be clicked Will time out after 20 seconds if element
		 * not found
		 */

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}
	
	
	
}
