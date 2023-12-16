package day19oct.mouseops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtil;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=SeleniumUtil.setUp("chrome", "https://www.flipkart.com/");
    driver.findElement(By.className("_30XB9F")).click();
	Actions act=new Actions(driver);
	List<WebElement> menuList=driver.findElements(By.cssSelector("div._3116_u>div>div>div>div>div>div"));
	System.out.println("menulist size : "+menuList.size());
     for(int i=0;i<menuList.size();i++) {
    	 act.moveToElement( menuList.get(i)).perform();
    	 Thread.sleep(500);
     }
     System.out.println("Bye");
	}

}
