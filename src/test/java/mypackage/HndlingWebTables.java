package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HndlingWebTables {

	public static void main(String[] args) {

    WebDriver driver=new ChromeDriver();
    driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
    WebElement table=driver.findElement(By.id("customers"));
    
    //how many rows in the table
    List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
    System.out.println("no. of rows in table are : "+rows.size());
    
    //how many columns in the table
    List<WebElement> columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
    System.out.println("no. of rows in table are : "+columns.size());
    
    //retrieve all the data from the table
    for(int i=0;i<rows.size();i++) {
    	for(int j=i;j<columns.size();j++) {
    		String data=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
    		System.out.print(data+"  ");
    	}
    	System.out.println();
    }
	}

}
