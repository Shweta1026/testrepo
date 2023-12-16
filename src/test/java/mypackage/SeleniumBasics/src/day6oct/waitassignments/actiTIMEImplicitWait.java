package day6oct.waitassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actiTIMEImplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String expectedHomePageUrl="https://demo.actitime.com/user/submit_tt.do";
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));

		System.out.println("expectedHomePageUrl : "+expectedHomePageUrl);
		String actualCurrentUrl=driver.getCurrentUrl();
		
		System.out.println("actual home page URL : "+actualCurrentUrl);
	    System.out.println("is log in successful :"+expectedHomePageUrl.equals(actualCurrentUrl));
		driver.findElement(By.id("logoutLink")).click();
		
		String expectedLoginPageUrl="https://demo.actitime.com/login.do";
	   wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
	   
	   System.out.println("Expected home page url : "+expectedLoginPageUrl);
	   String actualLoginPageUrl=driver.getCurrentUrl();
	   System.out.println("Is log in succeefull : "+expectedLoginPageUrl.equals(actualLoginPageUrl));
		
		
		
	}

}
