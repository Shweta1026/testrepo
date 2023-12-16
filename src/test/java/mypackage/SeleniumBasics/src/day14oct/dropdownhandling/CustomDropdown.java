package day14oct.dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtil;

public class CustomDropdown {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome","https://thompsonsj.com/bootstrap-select-dropdown/");
     driver.findElement(By.className("dropdown-toggle")).click();
      
     List<WebElement> optlist=driver.findElements(By.cssSelector(".dropdown-menu-right.show>div>a"));
     
     for(int i=0;i<optlist.size();i++) {
    	 System.out.println(optlist.get(i).getText());
     }
     
     optlist.get(2).click();
      
	}

}
