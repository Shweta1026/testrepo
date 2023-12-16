package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserAndStatusOfWebpage {

	public static void main(String[] args) {
		
     WebDriver driver=new ChromeDriver();
     
     driver.get("https://demo.nopcommerce.com/register");
     
    System.out.println("Title of the webpage is : "+driver.getTitle());
    
    System.out.println("Cureent url of the webpage is : "+driver.getCurrentUrl());
    
   // System.out.println("page source of the webpage is : "+driver.getPageSource());
    
    //isDisplayed,isEnabled,isSelected
    
    WebElement searchbox=driver.findElement(By.id("small-searchterms"));
    System.out.println("display status :"+searchbox.isDisplayed());//t
    System.out.println("enabled status :"+searchbox.isEnabled());//t
    
   WebElement male=driver.findElement(By.id("gender-male"));
   WebElement female=driver.findElement(By.id("gender-female"));
   
   System.out.println("male selected or not :"+male.isSelected());//f
   System.out.println("female selected or not :"+female.isSelected());//f
   
   male.click();
   System.out.println("male selected or not :"+male.isSelected());//t
   System.out.println("female selected or not :"+female.isSelected());//f
   
   female.click();
   System.out.println("male selected or not :"+male.isSelected());//f
   System.out.println("female selected or not :"+female.isSelected());//t
    
	}

}
