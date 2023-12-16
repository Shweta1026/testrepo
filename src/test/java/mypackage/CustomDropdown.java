package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hdfc.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".product-category-active")).click();
		
		List<WebElement> productTypes=driver.findElements(By.xpath("//ul[@id='productType']/li"));
		System.out.println(productTypes.size());
		
		selectOptionFromDropdown(productTypes,"Refinance");
		
//	for(WebElement product:productTypes) {
//		if(product.getText().equals("Refinance")) {
//			product.click();
//		}
//	}
	
	driver.findElement(By.cssSelector(".product-name-active")).click();
	List<WebElement> proList=driver.findElements(By.cssSelector("ul.product-name-list>li"));
	
	System.out.println("product list :"+proList.size());
	
//	for(WebElement product:proList) {
//		if(product.getText().equals("Rural Housing Loans")) {
//			product.click();
//		}
//	}
	
	
		
	selectOptionFromDropdown(proList,"Home Loan Balance Transfer");	

	}
	
	public static void selectOptionFromDropdown(List<WebElement> list,String value) {
		for(WebElement option:list) {
			if(option.getText().equals(value)) {
				option.click();
			}
		}
	}

}
