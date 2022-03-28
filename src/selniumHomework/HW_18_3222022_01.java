package selniumHomework;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_18_3222022_01 {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(enabled = false, priority = 1)
	public void sendKeysAndKeysEnter() {
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("shoes", Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("shirt", Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
	}

	@Test(enabled = false, priority = 2)
	public void alternateToGetMethod() {
		driver.navigate().to("https://www.nestle.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	} 

	@Test(enabled = false, priority = 3)
	public void screenSizeTest() {
		driver.manage().window().maximize();
		driver.get("https://www.nestle.com/");
	}

	@Test(enabled = false, priority = 4)
	public void screenSizeTest2() throws InterruptedException  {
	driver.get("https://www.nestle.com/");
	driver.manage().window().fullscreen();
	Thread.sleep(4000);
	System.out.println("The size of the window is " + driver.manage().window().getSize());
	}
	
	@Test
	public void setSize() {
		Dimension d = new Dimension(800,650);
		driver.manage().window().setSize(d);
		driver.manage().deleteAllCookies();
		driver.get("https://www.nestle.com/");
		driver.manage().window().maximize();
		}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
