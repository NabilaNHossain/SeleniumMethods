package xpathHomework;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_16_03172022_get_attribute {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.intuit.com/");
	}

	@Test(enabled = false)
	public void getAttribute() {
		String checkIn = driver.findElement(By.xpath("//span[text()='File with TurboTax']")).getAttribute("class");
		System.out.println("The value of the attribute is " + checkIn);
	}

	@Test
	public void getAttribute1() {
		String blogpost = driver.findElement(By.xpath("//span[text()='Read the blog post']")).getAttribute("class");
		System.out.println("The value of the attribute is " + blogpost);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
