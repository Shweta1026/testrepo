package day10ct.browseroperationandvalidation;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserOps_OrangeHRM_Login_Logout {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(500,600));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
		
	    String expected_title="OrangeHRM";
	    
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(By.className("oxd-input")));
	    String actual_title=driver.getTitle();
	    System.out.println("expected title : "+expected_title);
	    System.out.println("actual title : "+actual_title);
		System.out.println("Is log in successful ? : "+expected_title.equals(actual_title));
		
		driver.findElement(By.linkText("PIM")).click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		String expected_loginpage_title="OrangeHRM";
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		String actual_loginpage_title=driver.getTitle();
		System.out.println("is logout successfully? : "+expected_loginpage_title.equals(actual_loginpage_title));
		driver.navigate().to("https://www.google.com");
	}

}
