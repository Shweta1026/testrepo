package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinksinMultipleTab {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demo.nopcommerce.com/");*/
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://demo.nopcommerce.com/");
       driver.quit();
	}

}
