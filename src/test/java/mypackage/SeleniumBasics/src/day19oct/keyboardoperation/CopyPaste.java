package day19oct.keyboardoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtil;

public class CopyPaste {

	public static void main(String[] args) throws InterruptedException {
		//using setUp() launch required browser with URL and return browser instance
		WebDriver driver=SeleniumUtil.setUp("chrome","https://demo.automationtesting.in/Register.html");
		//enter firstname
		WebElement firstNameInputField=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		//type admin and press Ctrl+a button using keys class
		firstNameInputField.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		
		//press Ctrl+c using keys class
		firstNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
					//or
		//firstNameInputField.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		//enter lastname and press ENTER button using Keys class
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
