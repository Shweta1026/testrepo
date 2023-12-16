package day6oct.waits;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitExplicitWait_actitimelogin_logout2 {

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
		
		String expectedHomePageTitle="actiTIME - Enter Time-Track";
		
		//explicit wait		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(20)) //total time
					.pollingEvery(Duration.ofSeconds(5)) //retry time
					.ignoring(NoSuchElementException.class);//by pass exception if it comes
		//wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
					//or
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		
		String actualHomePageTitle=driver.getTitle();
		System.out.println("Home page Acutal Title: "+actualHomePageTitle);
		System.out.println("Home page Expected Title: "+expectedHomePageTitle);
		System.out.println("Is login successfull? "+actualHomePageTitle.equals(expectedHomePageTitle));
		driver.findElement(By.id("logoutLink")).click();//this element will get 0-30 sec for identification
	
		
		String expectedLoginPageTitle="actiTIME - Login";
		wait.until(ExpectedConditions.titleIs(expectedLoginPageTitle));
		String actualLoginPageTitle=driver.getTitle();
		System.out.println("is logout done sccuessfully? "+actualLoginPageTitle.equals(expectedLoginPageTitle));
	
		driver.close();
	}
}
/*
TC1: Actitime
Open browser
enter application url
clear text from username 
type username as Admin
clear text form password
type password as admin
click on login button
	validation vtiger home page either with title or url
logout from the application
	validation vtiger login page
 */
