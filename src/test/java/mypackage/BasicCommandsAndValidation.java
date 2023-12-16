package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicCommandsAndValidation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(200,300));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement userInputField=driver.findElement(By.id("user-name"));
		WebElement  passwordInputField=driver.findElement(By.id("password"));
		WebElement logInButton=driver.findElement(By.name("login-button"));
		
		System.out.println("user input field visible :"+userInputField.isDisplayed());
		System.out.println("user input field enabled :"+userInputField.isEnabled());
		
		System.out.println("PASSWORDr input field visible :"+passwordInputField.isDisplayed());
		System.out.println("password input field enabled :"+passwordInputField.isEnabled());
		
		System.out.println("login button visible :"+logInButton.isDisplayed());
		System.out.println("login buttonenabled :"+logInButton.isEnabled());
		System.out.println("log in button background-color :"+logInButton.getCssValue("background-color"));
		
		logInButton.click();
		
		WebElement errorMessge=driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		int err_x=errorMessge.getLocation().getX();
		int err_y=errorMessge.getLocation().getY();
		
		int psw_y=passwordInputField.getLocation().getY();
		System.out.println("is error msg is below psw field : "+(psw_y<err_y));
		
	}

}
