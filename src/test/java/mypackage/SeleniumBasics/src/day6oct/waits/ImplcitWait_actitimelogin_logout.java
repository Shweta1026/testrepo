package day6oct.waits;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplcitWait_actitimelogin_logout {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//implicit wait - Selenium 3.0
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // deprecated in Selenium 4.0
				//or
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // in selenium 4.0
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");//this element will get 0-30 sec for identification
		driver.findElement(By.name("pwd")).sendKeys("manager");//this element will get 0-30 sec for identification
		driver.findElement(By.id("loginButton")).click();//this element will get 0-30 sec for identification
		
		driver.findElement(By.id("logoutLink")).click();//this element will get 0-30 sec for identification
	}

}

