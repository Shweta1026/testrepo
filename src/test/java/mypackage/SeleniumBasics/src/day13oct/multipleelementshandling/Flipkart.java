package day13oct.multipleelementshandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {
	public static WebDriver setUp(String browserName, String url) {
		WebDriver driver = null;
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
        return driver;
	}

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome","https://www.flipkart.com/"); 
        
		driver.findElement(By.cssSelector("span._30XB9F")).click();
	    String expectedHomepageTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	    
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.titleIs(expectedHomepageTitle));
	    String actualHomepageTitle=driver.getTitle();
	    System.out.println("expected Homepage Title : "+expectedHomepageTitle);
	    System.out.println("actual home page title : "+actualHomepageTitle);
	    if(expectedHomepageTitle.equals(actualHomepageTitle)) {
	    	System.out.println("flipkart homepage is validated");
	    }else {
	    	System.out.println("flipkart homepage is not validated");
	    }
	    
	   List<WebElement> menuItems=driver.findElements(By.cssSelector("div._3sdu8W>a>div>div>span"));
	   System.out.println("no. of menus : "+ menuItems.size());
	   
	   for(int i=0;i< menuItems.size();i++) {
		   System.out.println( menuItems.get(i).getText());
	   }
	}

}
