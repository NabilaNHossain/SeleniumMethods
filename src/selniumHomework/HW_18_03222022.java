package selniumHomework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_18_03222022 {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www2.hm.com/en_us/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void sendKeysAndKeysEnter() throws InterruptedException {
		driver.findElement(By.id("main-search")).sendKeys("Shoes", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("main-search")).clear();
		driver.findElement(By.id("main-search")).sendKeys("dress",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("main-search")).clear();
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
