
package day6oct.waitassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRMExplicitWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("current URL : " + driver.getCurrentUrl());
		System.out.println("Actual title : " + driver.getTitle());

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();

		String expectedHomePageURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		System.out.println("expected home page URL : " + expectedHomePageURL);
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
					//or
		wait.until(ExpectedConditions.elementToBeClickable(By.className("oxd-input")));
		
		String actualHomePageURL = driver.getCurrentUrl();
		System.out.println("actual home page title : " + actualHomePageURL);
		System.out.println("Is log in successful : " + expectedHomePageURL.equals(actualHomePageURL));
		driver.findElement(By.className("oxd-userdropdown-icon")).click();
		 driver.findElement(By.linkText("Logout")).click();
		 
		 String expectedLoginPageUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		 wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		 String actualLoginPageUrl=driver.getCurrentUrl();
		 System.out.println(" is logout successful ?"+expectedLoginPageUrl.equals(actualLoginPageUrl));
        

		
	
}
}
