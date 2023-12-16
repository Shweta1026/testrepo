package mypackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class NavigationCommands {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.navigate().to("https://www.amazon.in/");
	
	driver.navigate().back();//snapdeal
	driver.navigate().forward();//amazon
	driver.navigate().refresh();
	
	

	}

}
