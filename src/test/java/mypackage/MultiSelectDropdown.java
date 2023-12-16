package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
		
		WebElement ele=driver.findElement(By.id("multiple-select-example"));
		
		Select slt=new Select(ele);
		System.out.println(slt.isMultiple());
		
		slt.selectByValue("apple");
		slt.selectByValue("peach");
		
		slt.deselectByValue("peach");
		slt.selectByValue("orange");

	}

}
