package week2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/SeleniumDrivers/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Enter the username.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("democsr2");
		//Enter the password.
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//Click the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click the "crm/sfa" link.
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Click the "Leads" link.
		driver.findElement(By.linkText("Leads")).click();
		//Click "Find leads."
		driver.findElement(By.linkText("Find Leads")).click();
		//Click on the "Phone" tab.
		driver.findElement(By.xpath("//span[text()='Phone']")) .click();
		//Click the "Find leads" button.
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9878");
		//Click "Find leads" again.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		//Capture the lead ID of the first resulting lead.
		driver.findElement(By.xpath("//a[text()='10058']")).click();
		//Click on Delete button
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//Click on Find Lead button
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//Click on Name and ID button
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		//Entering Lead id
		driver.findElement(By.name("id")).sendKeys("10058");
		//Click on Find Lead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//get Current page title
		String S=driver.getTitle();
		System.out.println("Title:" +S);
		

	}

}
