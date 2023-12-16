package day13oct.multipleelementshandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtil;

public class W3school {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome","https://www.w3schools.com/"); 
		List<WebElement> menuList=driver.findElements(By.xpath("//div[@id='subtopnav']/a"));
		
		for(int i=0;i<menuList.size();i++) {
			System.out.println(menuList.get(i).getText());
		}

	}

}
