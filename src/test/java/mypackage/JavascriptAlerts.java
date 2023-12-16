package mypackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlerts {
	
	//how to handle js alerts
	//how to handle authentication popups
	//how to handle permission based popups

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	//	driver.findElement(By.xpath("//ul[@style='list-style-type: none;']/li/button")).click();
//		
//		Thread.sleep(3000);
//		
//		driver.switchTo().alert().accept();
//		
//		driver.findElement(By.xpath("//ul[@style='list-style-type: none;']/li[2]/button")).click();
//		
//        Thread.sleep(3000);
//		    
//		//driver.switchTo().alert().accept();
//        
//        driver.switchTo().alert().dismiss();
        
driver.findElement(By.xpath("//ul[@style='list-style-type: none;']/li[3]/button")).click();
		
        Thread.sleep(3000);
		    
		Alert alert=driver.switchTo().alert();
        
		System.out.println(alert.getText());
        alert.sendKeys("welcome");
        
        alert.accept();

	}

}
