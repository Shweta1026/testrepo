package mypackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StandardDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement drp=driver.findElement(By.id("Skills"));
		Select slt=new Select(drp);
		List<WebElement> drpList=slt.getOptions();
		System.out.println("no. of items in list : "+drpList.size());
		for(WebElement item:drpList) {
			System.out.print(item.getText()+",");
		}
		System.out.println();
		
		slt.selectByIndex(3);
		Thread.sleep(3000);
		
		slt.selectByValue("AutoCAD");
		Thread.sleep(3000);
		
		slt.selectByVisibleText("APIs");
		Thread.sleep(3000);
		
		String expectedList="Select Skills,Adobe InDesign,Adobe Photoshop,Analytics,Android,APIs,Art Design,AutoCAD,Backup Management,C,C++,Certifications,Client Server,Client Support,Configuration,Content Managment,Content Management Systems (CMS),Corel Draw,Corel Word Perfect,CSS,Data Analytics,Desktop Publishing,Design,Diagnostics,Documentation,End User Support,Email,Engineering,Excel,FileMaker Pro,Fortran,HTML,Implementation,Installation,Internet,iOS,iPhone,Linux,Java,Javascript,Mac,Matlab,Maya,Microsoft Excel,Microsoft Office,Microsoft Outlook,Microsoft Publisher,Microsoft Word,Microsoft Visual,Mobile,MySQL,Networks,Open Source Software,Oracle,Perl,PHP,Presentations,Processing,Programming,PT Modeler,Python,QuickBooks,Ruby,Shade,Software,Spreadsheet,SQL,Support,Systems Administration,Tech Support,Troubleshooting,Unix,UI / UX,Web Page Design,Windows,Word Processing,XML,XHTML";
		String actualList="";
		for(int i=0;i<drpList.size();i++) {
			if(i<drpList.size()-1)
			actualList=actualList+drpList.get(i).getText()+",";
			else
				actualList=actualList+drpList.get(i).getText();	
		}
		System.out.println("actualList : "+actualList);
		if(expectedList.equals(actualList))
			System.out.println("list validation successful... ");
	}

}
