package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/SeleniumDrivers/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Viajaykumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramesh");
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(sourceDD);
		sel.selectByIndex(4);
		WebElement marDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel2=new Select(marDD);
		sel2.selectByValue("CATRQ_AUTOMOBILE");
		String pageTittle= driver.getTitle();
		System.out.println("Page Tittle: " + pageTittle);


		


	}

}
