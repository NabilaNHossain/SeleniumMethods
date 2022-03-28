package selniumHomework;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_16_03172022_get_text_ {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.statefarm.com/");
	}

	@Test(enabled = false,priority = 1)
	public void getText() {
		WebElement startquote = driver.findElement(By.xpath("//button[@id='quote-main-zip-btn']"));
		System.out.println("The text for the WebElement is " + startquote.getText());
		 
	}

	@Test (priority = 2)
	public void getText2() {
		WebElement savedquote = driver.findElement(By.linkText("Continue a saved quote"));
		System.out.println("The text of the WebElement is " + savedquote.getText());
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}

