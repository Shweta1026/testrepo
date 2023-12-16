package day6oct.waitassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMImplicitWait {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       System.out.println("current URL : "+driver.getCurrentUrl());
       System.out.println("Actual title : "+driver.getTitle());
      
       driver.findElement(By.name("username")).sendKeys("Admin");
       driver.findElement(By.name("password")).sendKeys("admin123");
       driver.findElement(By.className("orangehrm-login-button")).click();
       
       
       
       
       
	}

}
