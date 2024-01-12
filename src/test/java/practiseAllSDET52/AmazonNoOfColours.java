package practiseAllSDET52;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonNoOfColours {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		
		driver.findElement(By.xpath("//a[@class='a-link-normal s-color-swatch-link puis-spacing-small s-hidden-in-quick-view']")).click();
		
		List<WebElement> eles = driver.findElements(By.xpath("//div[@class='a-row']/label[contains(.,'Colour')]/following-sibling::span[@class='selection']"));
		
		for(WebElement ele:eles) {
			System.out.println(ele.getText());
		}
	}
}
