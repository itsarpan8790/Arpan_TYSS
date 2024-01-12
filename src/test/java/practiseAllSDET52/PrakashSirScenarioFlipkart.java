package practiseAllSDET52;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrakashSirScenarioFlipkart {
	public static void main(String[] args) throws InterruptedException {

		//ArrayList<String> al = new ArrayList<String>();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions act = new Actions(driver);

		WebElement srch = driver.findElement(By.xpath("//input[@name='q']"));
		srch.sendKeys("iphone 14");
		srch.sendKeys(Keys.ENTER);

		int count = 0;
		List<WebElement> allItems;
		for (;;) {
			allItems = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			for (WebElement ele : allItems) {
				// al.add(ele.getText());
				count++;
			}

			WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
			act.scrollToElement(next).perform();
			// wait.until(ExpectedConditions.elementToBeClickable(next));
			Thread.sleep(1500);
			try {
				next.click();
			} catch (Exception e) {
				break;
			}
			
			

		}

	}
}
