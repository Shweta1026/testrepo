package day10ct.browseroperationandvalidation;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiComponentValidation {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		System.out.println("is username input field visible? "+userNameInputField.isDisplayed());
		System.out.println("is username input field editable? "+userNameInputField.isEnabled());
		System.out.println("username input field default value- "+userNameInputField.getAttribute("placeholder"));
		
		
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		System.out.println("is password input field visible? "+passwordInputField.isDisplayed());
		System.out.println("is password input field editable? "+passwordInputField.isEnabled());
		System.out.println("password input field default value- "+passwordInputField.getAttribute("placeholder"));
		
		WebElement keepMeLoggedInCheckbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("is checkbox visible? "+keepMeLoggedInCheckbox.isDisplayed());
		System.out.println("is checkbox clickable? "+keepMeLoggedInCheckbox.isEnabled());
		System.out.println("is checkbox by default selected? "+keepMeLoggedInCheckbox.isSelected());
		
		keepMeLoggedInCheckbox.click();
		System.out.println("after clicking on checkbox, check whether it's selected or not? "+keepMeLoggedInCheckbox.isSelected());
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		System.out.println("is login button visible? "+loginButton.isDisplayed());
		System.out.println("is login button clickable? "+loginButton.isEnabled());
		System.out.println("login button name- "+loginButton.getText());
		
		
		
		
	}
}
/*
UI compoment validations:	
	Username input- visible, editable, default value
	Checkbox button- visible, functional, default selection
	login button- visible, clickable, button name,
*/