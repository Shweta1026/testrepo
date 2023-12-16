package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> navMenu=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li"));
		System.out.println("no.of men items : "+navMenu.size());
		Actions act=new Actions(driver);
		for(WebElement menu:navMenu) {
			act.moveToElement(menu).perform();
			Thread.sleep(2000);
		}
		
		
		

	}

}
