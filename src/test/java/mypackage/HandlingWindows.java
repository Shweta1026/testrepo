package mypackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
	   String parentWindowId=driver.getWindowHandle();
	   System.out.println("parent window id is : "+parentWindowId);
	   
	   driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	   
	   Set<String> allWindowIds=driver.getWindowHandles();
	   
//	   allWindowIds.remove(parentWindowId);
//	   
//	   Iterator<String> itr=allWindowIds.iterator();
//	   
//	   String childWindowId=itr.next();
//	   
//	   System.out.println("child window id is : "+childWindowId);
	   
//	   driver.switchTo().window(childWindowId);
//	   System.out.println("title of child window is : "+driver.getTitle());
//	   
//	   driver.switchTo().window(parentWindowId);
//	   System.out.println("title of child window is : "+driver.getTitle());
	   
	   //through for loop
	   for(String winId:allWindowIds) {
		   String title=driver.switchTo().window(winId).getTitle();
		   System.out.println("title : "+title);
       }
	   
	   
	   for(String winId:allWindowIds) {
		   String title=driver.switchTo().window(winId).getTitle();
		   if(title.equals("OrangeHRM HR Software | OrangeHRM")) {
			 driver.close();
		   }
       }
	   

	}

}
