package myrandomPractises;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sonull {

	@Test
	public void main() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		// ctrl+shift+i
		// ctrl+f
		driver.findElement(By.xpath("//span[@class='sc-gsFSXq bGTcbn']")).click(); // closing X(login/signup)

		Actions a = new Actions(driver);
		WebElement from = driver.findElement(By.xpath("//div[@class='sc-12foipm-34 iHoHRr'][1]")); // From
		a.click(from).pause(Duration.ofMillis(500)).sendKeys("Bengaluru").perform();
		WebElement Bengaluru = driver.findElement(By.xpath("//span[text()='Bengaluru, India']"));
		a.click(Bengaluru).perform();
		WebElement to = driver.findElement(By.xpath("//div[@class='sc-12foipm-34 iHoHRr'][2]")); // To
		a.click(to).sendKeys("Bhubaneswar").perform();
		WebElement Bhubaneswar = driver.findElement(By.xpath("//span[text()='Bhubaneswar, India']"));
		a.click(Bhubaneswar).perform();

	}

}
