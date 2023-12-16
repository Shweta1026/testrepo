package day6oct.waitassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRMExplicitWait1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("current URL : " + driver.getCurrentUrl());
		System.out.println("Actual title : " + driver.getTitle());

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();

		String expectedHomeTitle = "OrangeHRM";
		System.out.println("expected home page URL : " + expectedHomeTitle);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		// or
		wait.until(ExpectedConditions.elementToBeClickable(By.className("oxd-input")));

		String actualHomeTitle = driver.getTitle();
		System.out.println("actual home page title : " + actualHomeTitle);
		System.out.println("Is log in successful : " + expectedHomeTitle.equals(actualHomeTitle));
		driver.findElement(By.className("oxd-userdropdown-icon")).click();
		 driver.findElement(By.linkText("Logout")).click();
		
		 String expectedLoginPageTitle = "OrangeHRM";
      
        wait.until(ExpectedConditions.titleIs(expectedLoginPageTitle));
		String actualLoginPageTitle = driver.getTitle();
		System.out.println("is logout done sccuessfully? " + actualLoginPageTitle.equals(expectedLoginPageTitle));


	}
}