package selfPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteConsecutiveOccurence {
	public static void main(String[] args) {
		String name = "Tilak";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/arpan/Desktop/dynamic.html");

		WebElement n1 = driver.findElement(By.xpath("//a[contains(.,'" + name + "')]/following-sibling::input"));
		n1.sendKeys("admin");

	}

}
