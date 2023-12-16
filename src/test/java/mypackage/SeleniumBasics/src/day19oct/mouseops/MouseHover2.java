package day19oct.mouseops;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtil;



public class MouseHover2 {

	public static void main(String[] args) throws InterruptedException {
		// using setUp() launch required browser with URL and return browser instance
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		
		//create an instance of Actions class and pass browser instance to its constructor
		Actions act=new Actions(driver);
		//get all the main menu list
		List<WebElement> menuList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		
		//to perform hover on specific element get the element from the list like:  3st element(WebTable)
		WebElement webTableLink=menuList.get(2);
		Thread.sleep(1000);
		act.moveToElement(webTableLink, 100, 0).perform();

	}

}

