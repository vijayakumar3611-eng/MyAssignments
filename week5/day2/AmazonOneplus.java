package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class AmazonOneplus {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//launching brpwser
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//search with oneplus 9 pro
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        // Get price and ratings of first product
        WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
        String priceValue = price.getText();
        System.out.println("Price: " + priceValue);
        WebElement rating = driver.findElement(By.xpath("//div[@class='a-row a-size-small']" ));
        String ratingValue = rating.getText();
        System.out.println("Ratings: " + ratingValue);
        Actions act= new Actions(driver);
       // Click first product link
        WebElement title= driver.findElement(By.xpath("(//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal'])[1]"));
       act.moveToElement(title).click().perform();
       System.out.println(title.getText());
       //windows handling
       Set<String> handles = driver.getWindowHandles();
		List<String> List1 = new ArrayList<>(handles);
		//switch to child window
		driver.switchTo().window(List1.get(1));
        //click on add to cart
		driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
        //act.moveToElement(scrollDown).click().perform();
        //Subtotal
        WebElement subTotal=	driver.findElement(By.xpath("//div[@id='sw-subtotal']"));
        String subtotalValue = subTotal.getText();
        System.out.println("Subtotal:"  +subtotalValue);
        //switching to parentwindow
        driver.switchTo().window(List1.get(0));
		

	}

}