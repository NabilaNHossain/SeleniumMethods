package seleniumMethods;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import net.jodah.failsafe.internal.util.Assert;

public class Facebook2 {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.mountsinai.org//");
	}

	@Test
	public void userId() {
		String expected = "Mount Sinai Health System - New York City |  Mount Sinai - New York";
		String actual = driver.getTitle();
		System.out.println("The title is " + actual);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
