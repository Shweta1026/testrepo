package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		//part 16: how to locate all the links in selenium webdriver
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	   List<WebElement> links=driver.findElements(By.tagName("a"));
	   System.out.println("number of links are : "+links.size());
	   for(WebElement link:links) {
		   System.out.println(link.getText());
		   System.out.println(link.getAttribute("href"));
	   }
	  
	}

}
