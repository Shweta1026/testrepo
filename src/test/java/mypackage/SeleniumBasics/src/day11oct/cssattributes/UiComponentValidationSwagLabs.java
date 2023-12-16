package day11oct.cssattributes;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiComponentValidationSwagLabs {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com");

		WebElement usernameInputField = driver.findElement(By.id("user-name"));
		WebElement passwordInputField = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("login-button"));

		System.out.println("user name field visibility : " + usernameInputField.isDisplayed());
		System.out.println("user name field enable or not : " + usernameInputField.isEnabled());
		System.out.println("user name field getAttribute : " + usernameInputField.getAttribute("placeholder"));

		System.out.println("password field visibility : " + passwordInputField.isDisplayed());
		System.out.println("password field enable or not : " + passwordInputField.isEnabled());
		System.out.println("password field getAttribute : " + passwordInputField.getAttribute("placeholder"));

		System.out.println("loginButton visiblity  : " + loginButton.isDisplayed());
		System.out.println("loginButton enable or not : " + loginButton.isEnabled());
		System.out.println("loginButton text  : " + loginButton.getText());

		// checking css value of log in button
		System.out.println("background color of log in button : " + loginButton.getCssValue("background-color"));
		System.out.println("color of log in button : " + loginButton.getCssValue("color"));
		System.out.println("font family of log in button : " + loginButton.getCssValue("font-family"));
		System.out.println("font size color of log in button : " + loginButton.getCssValue("font-size"));

		Point pt_password = passwordInputField.getLocation();
		int pt_password_X = pt_password.getX();
		int pt_password_Y = pt_password.getY();

		Point pt_login = loginButton.getLocation();
		int pt_login_X = pt_login.getX();
		int pt_login_Y = pt_login.getY();

		WebElement errormsg = driver.findElement(By.className("error-message-container"));
		Point pt_errormsg = errormsg.getLocation();
		int pt_errormsg_X = pt_errormsg.getX();
		int pt_errormsg_Y = pt_errormsg.getY();
		
		System.out.println("********************************************************");

		if (pt_password_Y < pt_errormsg_Y) {
			System.out.println("error msg is coming below password field");
		} else {
			System.out.println("error msg is coming above password field");
		}

		if (pt_login_Y < pt_errormsg_Y) {
			System.out.println("error msg is coming below the log in button");
		} else {
			System.out.println("error msg is coming above the log in button");
		}
	}

}
