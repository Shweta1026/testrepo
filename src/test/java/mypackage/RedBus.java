package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    WebElement fromField=driver.findElement(By.xpath("//label[text()='From']//preceding-sibling::input"));
	    fromField.clear();
	    fromField.sendKeys("pune");
	    
	    List<WebElement> listFromItem=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li"));
	    System.out.println("no of items in from list : "+listFromItem.size());
	    
	    for(WebElement item:listFromItem) {
	    	if(item.getText().contains("Swargate")) {
	    		item.click();
	    		break;
	    	}
	    }
	    
		
	    WebElement toField=driver.findElement(By.xpath("//label[text()='To']//preceding-sibling::input"));
	    toField.clear();
	   toField.sendKeys("Goa");
	    
	    List<WebElement> listToItem=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li/div"));
	    System.out.println("no of items in from list : "+listToItem.size());
	    
	    
	    for(WebElement item:listToItem) {
	    	
	    	if(item.getText().contains("Panjim")) {
	    		item.click();
	    		break;
	    	}
	    }
	    
	    String date="1";
	    String month="Feb";
	    String year="2024";
	    
	    while(true) {
		   WebElement monthYear=driver.findElement(By.xpath("//div[@class='DatePicker__CalendarContainer-sc-1kf43k8-0 jQCNYF']/div/div/div[2]"));
		   String my=monthYear.getText();
		   String arr[]=my.split("\n");
		   String data=arr[0];
		   String arr1[]=data.split(" ");
		   String m=arr1[0];
		   String y=arr1[1];
		   
		   System.out.println(m);
		   System.out.println(y);
		   
		  
			 if(m.equals(month) && y.equals(year)) {
				 
				 break;
			 }
			 else{  
				 driver.findElement(By.xpath("//div[@class='sc-jzJRlG dPBSOp']/div/div/div/div[3]")).click();
				 
			 }
		   }
	    
	    List<WebElement> dateList=driver.findElements(By.xpath("//div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']/div[3]/div[2]/span/div/span"));
	    System.out.println("date are : "+dateList.size());
		  
	    for(WebElement ele:dateList) {
	    	if(ele.getText().equals(date)) {
	    		ele.click();
	    		break;
	    	}
	    }
	    	
	    
		
		

	}

}
