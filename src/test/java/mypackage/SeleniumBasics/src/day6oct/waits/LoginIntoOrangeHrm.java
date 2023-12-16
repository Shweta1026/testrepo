package day6oct.waits;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginIntoOrangeHrm {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		//once you define implicit wait, after this statement each element which are getting identified using
		// driver instance will get 0-30 sec for identification
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		WebElement usernameInputField=driver.findElement(By.name("username"));//0-30 sec
		usernameInputField.sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");//0-30 sec
		
		driver.findElement(By.className("orangehrm-login-button")).click();//0-30 sec
	}
}
/*
TC1: OrangeHRM
Open browser
enter application url 
type username as Admin
type password as admin123
click on login button
	validation orangeHRM home page either with title or url
logout from the application
	validation orangeHRM login page 
 */
