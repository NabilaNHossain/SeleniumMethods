package seleniumMethods;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void userId() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("tthikana@hotmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("naomI@1986");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='u_0_d_MT']")).click();
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
