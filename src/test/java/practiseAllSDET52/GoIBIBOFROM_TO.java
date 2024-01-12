package practiseAllSDET52;

import java.time.Duration;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GoIBIBOFROM_TO {
	@Test
	public void m1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		Actions a = new Actions(driver);
		// closing X
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		// From
		WebElement from = driver
				.findElement(By.xpath("//span[text()='From']//following-sibling::p[text()='Enter city or airport']"));
		a.click(from).pause(Duration.ofMillis(500)).sendKeys("Delhi").perform();
		WebElement delhi = driver.findElement(By.xpath("//span[text()='New Delhi, India']"));
		a.click(delhi).sendKeys("Bhopal").perform();
		WebElement bhopal = driver.findElement(By.xpath("//span[text()='Bhopal, India']"));
		bhopal.click();

	}

	
}
