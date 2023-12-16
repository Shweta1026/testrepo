package day19oct.keyboardoperation;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtil;



public class PressKeyboardButtons {

	public static void main(String[] args) {
		//using setUp() launch required browser with URL and return browser instance
		WebDriver driver=SeleniumUtil.setUp("chrome","https://demo.actitime.com/");
		//enter username
		driver.findElement(By.id("username")).sendKeys("admin");
		//enter password and press ENTER button using Keys class
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	}
}
/*
Login in actitime application without identifying Login button or without clicking on login button
*/