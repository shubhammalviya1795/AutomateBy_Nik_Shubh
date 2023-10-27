package GenericLib;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class setAllWaits {

	private WebDriver driver;

	public setAllWaits() {
		
		driver = new ChromeDriver();
	}

	public void implicitlyWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void waitForXpath(String xpath) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}

	public void waitForPresenceOfElementLocated(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}

	/*
	 * Used mostly for verifying correct page has loaded This method waits for an
	 * xpath to be clicked Will time out after 20 seconds if element not found
	 */

}
