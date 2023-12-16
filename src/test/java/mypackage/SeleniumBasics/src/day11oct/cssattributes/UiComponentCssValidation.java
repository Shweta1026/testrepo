package day11oct.cssattributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiComponentCssValidation {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement loginButton=driver.findElement(By.className("orangehrm-login-button"));
		System.out.println("Login button visibility: "+loginButton.isDisplayed());
		System.out.println("Login button functional or not: "+loginButton.isEnabled());
		System.out.println("Login button name: "+loginButton.getText());
		
		System.out.println("Login text size: "+loginButton.getCssValue("font-size"));
		System.out.println("Login text family: "+loginButton.getCssValue("font-family"));
		System.out.println("Login text color: "+loginButton.getCssValue("color"));
		System.out.println("Login button background color: "+loginButton.getCssValue("background-color"));
		
	}
}
/*
UI compoment validations:	
	login button- visible, clickable, button name,button backcolor, button text color, font size, font family
*/
