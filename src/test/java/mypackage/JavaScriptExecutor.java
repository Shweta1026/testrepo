package mypackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//make border to an element
		
		/*WebElement ele=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtils.drawBorder(ele, driver);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\borderelement.png");
		FileUtils.copyFile(src, trg);*/

	
	
        // get title
	  /*String title=JavaScriptUtils.getTitleByJs(driver);
	    System.out.println("title of page is : "+title);*/
		
		//click
		/*WebElement ele1=driver.findElement(By.linkText("Register"));
		JavaScriptUtils.clickElementByJs(ele1, driver);*/
		
		//generate alert
		//JavaScriptUtils.generateAlert(driver, "this is an alert ...");
		
		//refresh page
		//JavaScriptUtils.refreshPageByJs(driver);
		
		//scroll page down
		//JavaScriptUtils.scrollPageDownByJs(driver);
		//Thread.sleep(2000);
		
		//scroll page up
		//JavaScriptUtils.scrollPageUpByJs(driver);
		
		//zoom page
		//JavaScriptUtils.zoomPageByJs(driver);
		
		//flash the element
		WebElement ele=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtils.flash(ele,driver);
		
		
	}

}
