package day13oct.multipleelementshandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoSite1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		
		List<WebElement> navMenu=driver.findElements(By.cssSelector("ul.nav>li>a"));
		
		System.out.println("navigation menu count : "+navMenu.size());
		for(int i=0;i<navMenu.size();i++) {
			System.out.println(navMenu.get(i).getText());
		}
	}

}
