package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker3 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("dob")).click();
	WebElement month=driver.findElement(By.className("ui-datepicker-month"));
	month.click();
	Select slt=new Select(month);
	slt.selectByVisibleText("Feb");
	
	WebElement year=driver.findElement(By.className("ui-datepicker-year"));
	year.click();
	Select slt1=new Select(year);
	slt1.selectByVisibleText("2000");
	
	List<WebElement> col=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody//td"));
	
	for(WebElement date:col) {
		String d=date.getText();
		if(d.equals("26")) {
			date.click();
			break;
		}
	}

	}

}
