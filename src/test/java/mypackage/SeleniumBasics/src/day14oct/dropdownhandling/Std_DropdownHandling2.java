package day14oct.dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Std_DropdownHandling2 {

	public static WebDriver setUp(String browserName, String url) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		return driver;
	}

	public static void main(String[] args) {

		WebDriver driver = setUp("chrome", "https://www.letskodeit.com/practice");
		
		WebElement dropdwn=driver.findElement(By.id("multiple-select-example"));
		Select slt=new Select(dropdwn);
		
		System.out.println("dropdwn is multiple or not"+slt.isMultiple());
		
		List<WebElement> list=slt.getOptions();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		slt.selectByIndex(1);
		slt.selectByValue("apple");
		List<WebElement> opt=slt.getAllSelectedOptions();
	    for(int i=0;i<opt.size();i++) {
	    	System.out.println(opt.get(i).getText());
	    }
	    slt.deselectAll();

	}
}
/*
  dropdown has multiple select option or not
  default selected value of dropdown
  option count and name printing
  selecting option from dropdown and validating selection
  
  Validations:
  	1.Options should be same as expected
  	2.OPtions should be shown in ascending / descending order
 */
