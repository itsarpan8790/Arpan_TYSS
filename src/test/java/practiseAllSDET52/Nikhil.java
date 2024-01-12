package practiseAllSDET52;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nikhil {

	@Test
	public void name() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		WebElement searchTF = driver.findElement(By.xpath("//input[contains(@title,\"Search\")]"));
		searchTF.sendKeys("apple iphone 14");
		searchTF.sendKeys(Keys.ENTER);
		int count = 0;
		List<WebElement> phone;
		for (;;) {
			phone = driver
					.findElements(By.xpath("//a[@class and @rel and @href and not(@title)]//ul/../../div[text()]"));
			try {
				for (WebElement i : phone) {
					// System.out.println(i.getText());
					count++;
				}
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[.='Next']")).click();

			} catch (Exception e) {
				break;
			}
			Thread.sleep(2000);
		}
		String res = count + "";
		String exp = driver.findElement(By.xpath("//span[contains(.,'result')]")).getText();
		System.out.println(count);
		if (exp.contains(res)) {
			System.out.println("validation pass");
		} else {
			System.out.println("validation fail");
		}

	}

}
