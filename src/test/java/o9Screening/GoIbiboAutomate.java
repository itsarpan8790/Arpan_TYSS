package o9Screening;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GoIbiboAutomate {
	@Test
	public void main1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		Actions a = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// closing X
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		// From
		WebElement from = driver
				.findElement(By.xpath("//span[text()='From']//following-sibling::p[text()='Enter city or airport']"));
		a.click(from).pause(Duration.ofMillis(500)).sendKeys("Delhi").perform();
		WebElement delhi = driver.findElement(By.xpath("//span[text()='New Delhi, India']"));
		// a.click(delhi).sendKeys("Bhopal").perform();
		a.click(delhi).sendKeys("Bengaluru").perform();
		// WebElement bhopal = driver.findElement(By.xpath("//span[text()='Bhopal,
		// India']"));
		WebElement bhopal = driver.findElement(By.xpath("//span[text()='Bengaluru, India']"));
		bhopal.click();
		// date
		WebElement date = driver.findElement(
				By.xpath("//div[text()='February 2024']/ancestor::div[@class='DayPicker-Month']//p[text()='2']"));
		date.click();
		WebElement doneDate = driver.findElement(By.xpath("//span[text()='Done']"));
		doneDate.click();
		// details
		WebElement doneDetails = driver.findElement(By.linkText("Done"));
		doneDetails.click();
		// search flight
		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
		// morelinks
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// PriceFetching
		WebElement moreLinks = driver.findElement(By.xpath("//li[text()='more links']"));
		int y = moreLinks.getLocation().getY();

		for (int i = 1; i <= y; i++) {
			js.executeScript("window.scrollBy(0," + i + ")");

		}
		List<WebElement> allPrices = driver.findElements(
				By.xpath("//div[@class='srp-card-uistyles__Price-sc-3flq99-17 kxwFaC alignItemsCenter dF f600' ]"));
		System.out.println("Total Elements --> " + allPrices.size());
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (WebElement price : allPrices) {
			String Price = price.getText();
			String strPrice = Price.replaceAll(",", "");
			int intPrice = Integer.parseInt(strPrice);
			System.out.println(intPrice);
			al.add(intPrice);
		}
		Collections.sort(al);

		System.out.println("Least Flight Price-->" + al.get(0));

		driver.quit();
	}

	@Test
	public void main2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		Actions a = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// closing X
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		// From
		WebElement from = driver
				.findElement(By.xpath("//span[text()='From']//following-sibling::p[text()='Enter city or airport']"));
		a.click(from).pause(Duration.ofMillis(500)).sendKeys("Delhi").perform();
		WebElement delhi = driver.findElement(By.xpath("//span[text()='New Delhi, India']"));
		// a.click(delhi).sendKeys("Bhopal").perform();
		a.click(delhi).sendKeys("Bengaluru").perform();
		// WebElement bhopal = driver.findElement(By.xpath("//span[text()='Bhopal,
		// India']"));
		WebElement bhopal = driver.findElement(By.xpath("//span[text()='Bengaluru, India']"));
		bhopal.click();
		// date
		WebElement date = driver.findElement(
				By.xpath("//div[text()='February 2024']/ancestor::div[@class='DayPicker-Month']//p[text()='2']"));
		date.click();
		WebElement doneDate = driver.findElement(By.xpath("//span[text()='Done']"));
		doneDate.click();
		// details
		WebElement doneDetails = driver.findElement(By.linkText("Done"));
		doneDetails.click();
		// search flight
		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
		// morelinks
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// PriceFetching
		WebElement fligthCount = driver.findElement(By.xpath("//span[@class='greyCnt']"));//showing 27 flights
		String strFligthCount = fligthCount.getText().replaceAll("[^0-9]", "");
		int numFligthCount = Integer.parseInt(strFligthCount);
		System.out.println(numFligthCount);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (;;) {
			List<WebElement> allPrices = driver.findElements(
					By.xpath("//div[@class='srp-card-uistyles__Price-sc-3flq99-17 kxwFaC alignItemsCenter dF f600' ]"));
			if (numFligthCount == allPrices.size()) {
				
				for (WebElement price : allPrices) {
					String Price = price.getText();//6,000
					// System.out.println(Price);
					String strPrice = Price.replaceAll(",", "");//6000
					int intPrice = Integer.parseInt(strPrice);//6000
					System.out.println(intPrice);
					al.add(intPrice);

				}
				break;

			} else {
				
				a.sendKeys(Keys.PAGE_DOWN).perform();
			}

		}
		Collections.sort(al);
		System.out.println("Least Flight Price " + al.get(0));
		
		//svg xpath for '+'------>//p[text()='Adults']/../descendant::*[name()='svg']//*[name()='path' and @d='M7 1v12.5M1 7h12.5']
	

	}
}
