package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/SeleniumDrivers/chromedriver-win64/chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vijay");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Vijay");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing Automation");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("asdfg@gmail.com");
		WebElement createLeadForm_generalStateProvinceGeoId=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		WebElement stateDD =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select S1 =new Select(stateDD);
				S1.selectByVisibleText("Alaska");
		driver.findElement(By.name("submitButton")).click();
		WebElement editbutton=driver.findElement(By.linkText("Edit"));
		editbutton.click();
		WebElement cleardescription=driver.findElement(By.id("updateLeadForm_description"));
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("test Automation");
		driver.findElement(By.name("submitButton")).click();
		String pageTittle= driver.getTitle();
		System.out.println("Page Tittle: " + pageTittle);
		driver.close();
			
	}

}
