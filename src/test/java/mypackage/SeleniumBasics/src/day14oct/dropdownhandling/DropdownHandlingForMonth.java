package day14oct.dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandlingForMonth {
	
	public static WebDriver setUp(String browserName,String url) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")) {
			 driver=new ChromeDriver();}
//		else if(browserName.equalsIgnoreCase("firefox")) {
//			 driver=new FireFoxDriver();
//		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		return driver;
	}

	public static void main(String[] args) {
		WebDriver driver=setUp("chrome","https://demo.automationtesting.in/Register.html");
        
		WebElement date=driver.findElement(By.cssSelector("select[placeholder='Month']"));
		
		Select slt=new Select(date);
		System.out.println("already selected option : "+slt.getFirstSelectedOption().getText());
		
	    List<WebElement> monthList=slt.getOptions();
	    for(WebElement e:monthList) {
	    	System.out.println(e.getText());
	    }
	    
	    slt.selectByIndex(4);
	    System.out.println("select month by index : "+slt.getFirstSelectedOption().getText());
		
	    slt.selectByValue("May");
	    System.out.println("select month by value : "+slt.getFirstSelectedOption().getText());
	    
	    slt.selectByVisibleText("December");
	    System.out.println("select month by visible text : "+slt.getFirstSelectedOption().getText());
	    
	   String expectedMonthSeq="Month,January,February,March,April,May,June,July,August,September,October,November,December";
	   String actualMonthSeq="";
	   
	   for(int i=0;i<monthList.size();i++) {
		   if(i<monthList.size()-1) {
			   actualMonthSeq=actualMonthSeq+ monthList.get(i).getText()+",";
		   }
		   else{
			   actualMonthSeq=actualMonthSeq+ monthList.get(i).getText();
		   }
		   }
	   System.out.println(actualMonthSeq);
	   System.out.println("is options sequence correct : "+expectedMonthSeq.equals(actualMonthSeq));
	}

}
