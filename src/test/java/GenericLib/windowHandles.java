package GenericLib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class windowHandles {

	
	
	public void windowhandle(WebDriver driver)
	{
		
		String CurrentsessionId = driver.getWindowHandle();
		Set set = driver.getWindowHandles();
		Iterator it = set.iterator();
		String childSessionId =  (String) it.next();
		driver.switchTo().window(childSessionId);
		
	}
	
	public void windowhandles(WebDriver driver, String title)
	{
		
		String CurrentsessionId = driver.getWindowHandle();
		Set set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();	
			while (it.hasNext()) {
				driver.switchTo().window(it.next());
				if (driver.getTitle().contains(title)) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
					}
					break;
				}
			
		}
		
	}
}
