package day14oct.orangehrm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmCreateUpdateDeleteEmployee {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("current URL : " + driver.getCurrentUrl());
		System.out.println("Actual title : " + driver.getTitle());

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();

		String expectedHomeTitle = "OrangeHRM";
		System.out.println("expected home page URL : " + expectedHomeTitle);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		// or
		wait.until(ExpectedConditions.elementToBeClickable(By.className("oxd-input")));

		String actualHomeTitle = driver.getTitle();
		System.out.println("actual home page title : " + actualHomeTitle);
		System.out.println("Is log in successful : " + expectedHomeTitle.equals(actualHomeTitle));

		driver.findElement(By.cssSelector("ul.oxd-main-menu>*:nth-child(2)>a>span")).click();

		// create employee
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.name("firstName")).sendKeys("Kirti");
		driver.findElement(By.name("lastName")).sendKeys("lonkar");
		WebElement empId=driver.findElement(By.xpath("//*[@class='oxd-grid-2 orangehrm-full-width-grid']/div/div/div[2]/input"));
       
		Actions act=new Actions(driver);
		act.click(empId).perform();
		act.doubleClick(empId).perform();
		act.sendKeys(Keys.BACK_SPACE).sendKeys("3001").perform();
		// driver.findElement(By.className("oxd-input--active")).sendKeys("1050");
		driver.findElement(By.className("oxd-button--secondary")).click();

		// verify employee added or not
		driver.findElement(By.cssSelector("ul.oxd-main-menu>*:nth-child(2)>a>span")).click();
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys("Kirti lonkar");
		driver.findElement(By.cssSelector(".oxd-form-row>div>*:nth-child(2)>div>*:nth-child(2)>input"))
				.sendKeys("3001");
		driver.findElement(By.className("oxd-button--secondary")).click();

		// update employee info
		driver.findElement(By.cssSelector(".oxd-table-body>div>div>div>div>div>label>span>i")).click();
		driver.findElement(By.cssSelector(".oxd-icon.bi-pencil-fill")).click();
		driver.findElement(By.linkText("Job")).click();
		driver.findElement(By.cssSelector(".oxd-select-text.oxd-select-text--active")).click();

		List<WebElement> jobTitles = driver.findElements(By.xpath("//*[@role='listbox']/div"));
		System.out.println(jobTitles.size());
		for(int i=0;i<jobTitles.size();i++) {
			System.out.println(jobTitles.get(i).getText());
		}
	    
		jobTitles = driver.findElements(By.xpath("//*[@role='listbox']/div"));
		try {
	    for (int i = 0; i < jobTitles.size(); i++) {
		if(driver.findElements(By.xpath("//*[@role='listbox']/div")).get(i).getText().contains("QA Lead")) {
		jobTitles.get(i).click();
			}
		}
		}
		catch(IndexOutOfBoundsException e) {
			
		}
       driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Verify updated job title
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys("Kirti lonkar");
		driver.findElement(By.cssSelector(".oxd-form-row>div>*:nth-child(2)>div>*:nth-child(2)>input"))
				.sendKeys("3001");
		driver.findElement(By.className("oxd-button--secondary")).click();

		String expectedJobTitle = "QA Lead";
		WebElement jTitle = driver.findElement(
				By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[5]/div"));
		String actualJobTitle = jTitle.getText();
		System.out.println("is job title updated? : " + expectedJobTitle.equals(actualJobTitle));
		
		//delete employee
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div/label/span/i")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[1]/i")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[3]/div/div/div/div[3]/button[2]")).click();
	}
}