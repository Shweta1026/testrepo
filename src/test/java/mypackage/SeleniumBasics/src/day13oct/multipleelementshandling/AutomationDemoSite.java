package day13oct.multipleelementshandling;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationDemoSite {

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome", "https://demo.automationtesting.in/Register.html");		
		List<WebElement> navMenu=driver.findElements(By.cssSelector("ul.nav>li>a"));		
		System.out.println("navMenu count: "+navMenu.size());
		for(int i=0;i<navMenu.size();i++) {
//			WebElement element=deviceList.get(i);
//			System.out.println(element.getText());
						//or
			System.out.println(navMenu.get(i).getText());
			//TODO: print device price as well
		}

	}

	public static WebDriver setUp(String browserName,String url) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		return driver;
	}
}
