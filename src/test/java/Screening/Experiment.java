package Screening;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Experiment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object fheight = js.executeScript("return window.pageYOffset");
		//Object fheight = js.executeScript("return document.body.scrollHeight");
		System.out.println(fheight);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Object lheight=js.executeScript("return window.pageYOffset");
		//Object lheight = js.executeScript("return document.body.scrollHeight");
		System.out.println(lheight);
	}

}
