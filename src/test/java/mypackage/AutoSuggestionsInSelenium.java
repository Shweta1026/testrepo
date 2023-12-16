package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
	WebElement ele=driver.findElement(By.id("APjFqb"));
	ele.clear();
	ele.sendKeys("selenium");
	
	 List<WebElement> suggList=driver.findElements(By.xpath("//ul[@class='G43f7e']/li/div/div[2]"));
	   System.out.println(suggList.size());
	
	
	for(WebElement opt:suggList) {
		Thread.sleep(2000);
		if(opt.getText().contains("dev")) {
			
			opt.click();
			break;
		}
	}
	

	

	}

}
