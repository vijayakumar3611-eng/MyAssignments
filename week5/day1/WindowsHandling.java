
package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("democsr2");
		// Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Clcikon submit
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on CRM
		driver.findElement(By.partialLinkText("CRM")).click();
		// Click contact
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		// Click merge contact
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::a")).click();
		
		System.out.println(driver.getCurrentUrl());
	
		Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> List1 = new ArrayList(windowHandles);
		//switch to child window
		driver.switchTo().window(List1.get(1));
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1])[1]")).click();
		driver.switchTo().window(List1.get(0));
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::a")).click();


		Thread.sleep(2000);
		Set<String> windowHandles1 = driver.getWindowHandles();
		// switchToChildWindow();
		List<String> List2 = new ArrayList(windowHandles1);
		driver.switchTo().window(List2.get(1));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'partyId')])[2]")).click();
		
		// click on merge
		driver.switchTo().window(List2.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		// Accept Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		// get title
		String Title = driver.getTitle();
		System.out.println(Title);

	}
}
