package day4oct.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		String s=driver.getTitle();
		System.out.println("Title : "+s);
		System.out.println("Title length : "+s.length());
		
		String s1=driver.getCurrentUrl();
		System.out.println("current url : "+s1);
		
		String s3="https://demo.actitime.com/login.do";
		System.out.println("verify url & checking correct page is append or not : "+s1.equals(s3));
		
		String s2=driver.getPageSource();
		System.out.println("page source length : "+s2.length());
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
	    userNameInputField.sendKeys("admin");
	    
	    WebElement passwordInputField=driver.findElement(By.name("pwd"));
	    passwordInputField.sendKeys("manager");

	    WebElement inputLoginButton=driver.findElement(By.id("loginButton"));
	    inputLoginButton.click();
        //driver.close();
	}

}

