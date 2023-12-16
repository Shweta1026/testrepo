package day14oct.orangehrm;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Custom_DropdownHandling3 {

	public static WebDriver setUp(String browserName, String url) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		return driver;
	}

	public static void main(String[] args) {

		WebDriver driver = setUp("chrome", "https://thompsonsj.com/bootstrap-select-dropdown/");
		
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
		
		List<WebElement> options=driver.findElements(By.cssSelector(".dropdown-menu-right.show>div>a"));
		System.out.println("Options count: "+options.size());
		
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		
		options.get(4).click();		
	}
}
//TODO: write script to create task in Actitime and validate it
// delete the task and validate it

