package practiseAllSDET52;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Graph {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(
				"https://www.google.com/search?q=nifty&oq=nifty&gs_lcrp=EgZjaHJvbWUyDwgAEEUYORiDARixAxiABDINCAEQABiDARixAxiABDINCAIQABiDARixAxiABDINCAMQABiDARixAxiABDINCAQQABiDARixAxiABDINCAUQABiDARixAxiABDITCAYQLhiDARivARjHARixAxiABDINCAcQABiDARixAxiABDIKCAgQABixAxiABDINCAkQABiDARixAxiABNIBCDIzMzRqMGo0qAIAsAIA&sourceid=chrome&ie=UTF-8");

		WebElement ele = driver.findElement(By.xpath("//*[name()='svg' and @class='uch-psvg']"));
		int width = ele.getRect().getWidth();
		Actions a = new Actions(driver);

		List<WebElement> ele1 = driver
				.findElements(By.xpath("//span[@class='knowledge-finance-wholepage-chart__hover-card-value']"));
		for (int i = 1; i <= width; i++) {
			a.moveToElement(ele1.get(i)).perform();
		}
	}
}
