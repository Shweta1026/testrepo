package day10ct.browseroperationandvalidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_UIcomponentValidation {

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement userNameInputField=driver.findElement(By.name("username"));
		System.out.println("is username input field visible?"+userNameInputField.isDisplayed());
		System.out.println("is username input field enabled?"+userNameInputField.isEnabled());
		System.out.println("username input field default value-"+userNameInputField.getAttribute("placeholder"));
		
		WebElement passwordInputField=driver.findElement(By.name("password"));
		System.out.println("is password input field visible?"+passwordInputField.isDisplayed());
		System.out.println("is password input field enabled?"+passwordInputField.isEnabled());
		System.out.println("password input field default value-"+passwordInputField.getAttribute("placeholder"));
		
		WebElement loginField=driver.findElement(By.className("oxd-button"));
		System.out.println("is login field visible?"+loginField.isDisplayed());
		System.out.println("is login field enabled?"+loginField.isEnabled());
		System.out.println("inner text of log in button-"+loginField.getText());
		
		WebElement forgotPasswordField=driver.findElement(By.className("orangehrm-login-forgot-header"));
		System.out.println("is forgotPasswordField  visible?"+forgotPasswordField.isDisplayed());
		System.out.println("is forgotPasswordField enabled?"+forgotPasswordField.isEnabled());
		System.out.println("inner text of forgotPasswordField-"+forgotPasswordField.getText());
	}

}
