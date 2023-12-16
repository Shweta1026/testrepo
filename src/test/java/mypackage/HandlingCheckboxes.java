package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	
	//selecting one particular checkbox
	
	//driver.findElement(By.id("checkbox1")).click();
	
	//selecting all checkboxes
	
	List<WebElement> checkboxes=driver.findElements(By.xpath("//form[@id='basicBootstrapForm']/div[6]/div/div/input"));
	System.out.println("no.of checkboxes : "+checkboxes.size());
	Thread.sleep(2000);
	
//	for(WebElement checkbox:checkboxes) {
//		checkbox.click();
//	}
	
	// select multiple checkboxes
	
//	for(int i=0;i<checkboxes.size();i++) {
//		if(checkboxes.get(i).getAttribute("id").equals("checkbox1") || checkboxes.get(i).getAttribute("id").equals("checkbox2") ) {
//			checkboxes.get(i).click();
//		}
//	}
	
	//select last 2 checkboxes
//	int total=checkboxes.size();
//	for(int i=total-2;i<checkboxes.size();i++) {
//		checkboxes.get(i).click();
//	}
	
	//select first 2 checkboxes
	for(int i=0;i<checkboxes.size();i++) {
		if(i<2) {
		checkboxes.get(i).click();
		}
	}
	}

}
