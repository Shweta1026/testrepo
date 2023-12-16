package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   //number of rows 
	   List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tbody/tr"));
	   System.out.println("number of rows : "+rows.size());
	   
	   //number of columns 
	   List<WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/th"));
	   System.out.println("number of columns : "+columns.size());
	   
	   //retrieve all data
	   
	   for(int r=2;r<rows.size();r++) {
		   for(int c=1;c<columns.size();c++) {
			   String data=driver.findElement(By.xpath("//table[@id='customers']//tbody/tr["+r+"]/td["+c+"]")).getText();
			   System.out.print(data);
		   }
		   System.out.println();
	   }
	   
	   //retrieve specific data
	   
	   String ele=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[7]/td[1]")).getText();
	   System.out.println("specific value : "+ele);
	   
	}

}
