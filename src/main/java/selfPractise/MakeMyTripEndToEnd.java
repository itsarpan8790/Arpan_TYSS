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

	@Test
	public void mmt() throws InterruptedException {
		String City1 = "Patna";
		String City2 = "Bengaluru";
		String Date = "16";
		String Month = "February";

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");

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

			}
		}

		// Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions a = new Actions(driver);

		// HashMap
		LinkedHashMap<String, Integer> hmap = new LinkedHashMap<String, Integer>();
		int count = 0;
		for (;;) {
			try {
				WebElement scrollUp = driver.findElement(By.xpath("//font[text()='SCROLL TO TOP']"));
				a.scrollToElement(scrollUp);
				// price
				List<WebElement> allPrices = driver.findElements(By
						.xpath("//div[@class='blackText fontSize18 blackFont white-space-no-wrap clusterViewPrice']"));
				System.out.println("Price Size is-->" + allPrices.size());

				// name
				List<WebElement> flightNames = driver.findElements(By.xpath(
						"//p[@class='appendBottom2 flightTimeInfo']/ancestor::div[@class='makeFlex spaceBetween']/descendant::p[@class='boldFont blackText airlineName']"));
				System.out.println("Name size is-->" + flightNames.size());

				for (int j = 0; j < allPrices.size(); j++) {
					String txtprice = "";
					String Price = allPrices.get(j).getText();

					for (int i = 0; i < Price.length(); i++) {
						if (Price.charAt(i) >= '0' && Price.charAt(i) <= '9') {
							txtprice = txtprice + Price.charAt(i);
						}
					}

					int intPrice = Integer.parseInt(txtprice);
					String strName = flightNames.get(j).getText();
					System.out.println(strName + "-->" + intPrice);
				}
				break;
			} catch (Exception e) {
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				count++;
				System.out.println(count);
			}

		}
		// driver.quit();

	}

}
