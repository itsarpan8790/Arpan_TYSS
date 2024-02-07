package selfPractise;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MakeMyTripEndToEnd {
	WebDriver driver;

	@Parameters("browser")
	@Test
	public void mmt(String Browser) throws InterruptedException {
		String City1 = "Patna";
		String City2 = "Bengaluru";
		String Date = "25";
		String Month = "February";
		if (Browser.equals("chrome"))
			driver = new ChromeDriver();
		else
			driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Fromcity
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("" + City1 + "");
		driver.findElement(By.xpath("//p[contains(.,'" + City1 + "')]")).click();

		// toCity
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("" + City2 + "");
		driver.findElement(By.xpath("//p[contains(.,'" + City2 + ", India')]")).click();

		// date

		for (;;) {
			try {
				driver.findElement(By.xpath("//div[@class='DayPicker-Month' and contains(.,'" + Month
						+ " 2024')]/descendant::p[text()='" + Date + "']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}

		// Adult selection
		driver.findElement(By.xpath("//span[text()='Travellers & Class']")).click();
		driver.findElement(By.xpath("//li[@data-cy='adults-2']")).click();
		driver.findElement(By.xpath("//button[text()='APPLY']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();

		// X
		for (;;) {
			try {
				driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
				break;
			} catch (Exception e) {
				continue;
				// driver.findElement(By.xpath("//span[contains(@class,'bgProperties
				// overlayCrossIcon icon20')]")).click();
			}
		}

		// Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions a = new Actions(driver);

		// HashMap
		LinkedHashMap<String, Integer> hmap = new LinkedHashMap<String, Integer>();

		for (;;) {
			try {
				WebElement scrollUp = driver.findElement(By.xpath("//font[text()='SCROLL TO TOP']"));
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				// price
				List<WebElement> allPrices = driver.findElements(By
						.xpath("//div[@class='blackText fontSize18 blackFont white-space-no-wrap clusterViewPrice']"));
				// name
				List<WebElement> flightName = driver.findElements(By.xpath(
						"//p[@class='appendBottom2 flightTimeInfo']/ancestor::div[@class='makeFlex spaceBetween']/descendant::p[@class='boldFont blackText airlineName']"));
				System.out.println("size is-->" + allPrices.size());
				System.out.println("size is-->" + flightName.size());

				for (int j = 0; j < allPrices.size(); j++) {
					String temp = "";
					String strPrice = allPrices.get(j).getText();
					for (int i = 0; i < strPrice.length(); i++) {
						if (strPrice.charAt(i) >= '0' && strPrice.charAt(i) <= '9') {
							temp = temp + strPrice.charAt(i);
						}
					}

					String strName = flightName.get(j).getText();
					int intPrice = Integer.parseInt(temp);
					hmap.put(strName, intPrice);

				}
				break;
			} catch (Exception e) {

				a.sendKeys(Keys.PAGE_DOWN).perform();
			}

		}
		System.out.println("hmap size--" + hmap.size());

	}

}
