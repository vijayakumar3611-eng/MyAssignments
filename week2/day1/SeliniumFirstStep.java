package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeliniumFirstStep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/SeleniumDrivers/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement (By.xpath("//input[@name='USERNAME']")).sendKeys("democsr2");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();



	}

}
