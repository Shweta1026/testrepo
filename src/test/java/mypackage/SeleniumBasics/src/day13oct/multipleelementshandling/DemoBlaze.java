package day13oct.multipleelementshandling;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoBlaze {

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome", "https://www.demoblaze.com/");		
		List<WebElement> deviceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));		
		System.out.println("Device count: "+deviceList.size());
		for(int i=0;i<deviceList.size();i++) {
//			WebElement element=deviceList.get(i);
//			System.out.println(element.getText());
						//or
			System.out.println(deviceList.get(i).getText());
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
/*
1. print main menu count and name - https://demo.automationtesting.in/Register.html

2. print device count and name - https://www.gsmarena.com/

3. print device count and name -https://www.gsmarena.com/samsung-phones-9.php
 */

