package week2.assignment;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/SeleniumDrivers/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("vijay");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("asdfg@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Asde@#");
		WebElement day=driver.findElement(By.id("day"));
		Select S= new Select(day);
		S.selectByIndex(23);
		WebElement month=driver.findElement(By.id("month"));
		Select S1= new Select(month);
		S1.selectByVisibleText("Sep");
		WebElement year=driver.findElement(By.id("year"));
		Select S2= new Select(year);
		S2.selectByValue("1996");
		driver.findElement(By.xpath("//label[text()='Male']")).click();

}
	
}
