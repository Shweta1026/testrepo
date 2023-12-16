package mypackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTooltip {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.linkText("Tooltips"));
		String tooltipText=ele.getAttribute("title");
		System.out.println("tooltip text is : "+tooltipText);
		
		WebElement ele1=driver.findElement(By.linkText("ThemeRoller"));
		String tooltipText1=ele1.getAttribute("title");
		System.out.println("tooltip text is : "+tooltipText1);
		
		

	}

}
