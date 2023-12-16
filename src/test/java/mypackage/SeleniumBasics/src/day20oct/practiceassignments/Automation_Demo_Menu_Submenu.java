package day20oct.practiceassignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utilities.SeleniumUtil;

public class Automation_Demo_Menu_Submenu {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		
		List<WebElement> menuList=driver.findElements(By.cssSelector("div.navbar-collapse>ul>li>a"));
		
		for(int i=0;i<menuList.size();i++) {
			System.out.println(menuList.get(i).getText());
		}
		Actions act=new Actions(driver);
		
		//Switchto submenu
		WebElement Menu=driver.findElement(By.linkText("SwitchTo"));
		act.moveToElement(Menu).perform();
		
		List<WebElement> subMenuList=driver.findElements(By.cssSelector(".dropdown>ul>li>a"));

		System.out.println( subMenuList.size());
		for(int i=0;i< subMenuList.size();i++) {
			System.out.println( subMenuList.get(i).getText());
		}
		// widgets submenu
		WebElement Menu1=driver.findElement(By.linkText("Widgets"));
		act.moveToElement(Menu1).perform();
		
		List<WebElement> subMenuList1=driver.findElements(By.cssSelector(".dropdown>ul>li>a"));
        for(int i=0;i< subMenuList1.size();i++) {
			System.out.println( subMenuList1.get(i).getText());
		}
        //Interactions submenu
        WebElement Menu2=driver.findElement(By.linkText("Interactions"));
		act.moveToElement(Menu2).perform();
		
		List<WebElement> subMenuList2=driver.findElements(By.cssSelector(".dropdown>ul>li>a"));
        for(int i=0;i< subMenuList2.size();i++) {
			System.out.println( subMenuList2.get(i).getText());
		}
        
        //video submenu
        WebElement Menu3=driver.findElement(By.linkText("Video"));
		act.moveToElement(Menu3).perform();
		
		List<WebElement> subMenuList3=driver.findElements(By.cssSelector(".dropdown>ul>li>a"));
        for(int i=0;i< subMenuList3.size();i++) {
			System.out.println( subMenuList3.get(i).getText());
		}
        
        //WYSIWYG SUBMENU
        WebElement Menu4=driver.findElement(By.linkText("WYSIWYG"));
		act.moveToElement(Menu4).perform();
		
		List<WebElement> subMenuList4=driver.findElements(By.cssSelector(".dropdown>ul>li>a"));
        for(int i=0;i< subMenuList4.size();i++) {
			System.out.println( subMenuList4.get(i).getText());
        }
			//more menu
		  WebElement Menu5=driver.findElement(By.linkText("More"));
		  act.moveToElement(Menu5).perform();
				
		 List<WebElement> subMenuList5=driver.findElements(By.cssSelector(".dropdown>ul>li>a"));
		 for(int i=0;i< subMenuList5.size();i++) {
		    System.out.println( subMenuList5.get(i).getText());
		}
	}

}
