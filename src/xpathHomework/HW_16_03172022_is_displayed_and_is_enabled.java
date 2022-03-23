package xpathHomework;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_16_03172022_is_displayed_and_is_enabled {
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

	@Test( priority = 1)
	public void logoTestByIsDisplayed() {
		boolean elementDisplayed = driver.findElement(By.xpath(
				"//a[@class='Link_link__829fb056 GlobalNav_dBrand__f83d5c7d Link_blue__829fb056 Link_body02__829fb056 Link_medium__829fb056']"))
				.isDisplayed();
		System.out.println("Is the Logo displayed? Ans: " + elementDisplayed);
	}

	@Test(priority = 2)
	public void linkTest() {
		boolean talkToAnExpertLinkEnabled = driver
				.findElement(By.xpath(
						"//a[@class='Button_button__d9723f14 Button_rwMedium__d9723f14 Button_tertiary__d9723f14']"))
				.isEnabled();
		System.out.println("Is the talk to a tax expert link enabled? Ans: " + talkToAnExpertLinkEnabled);
}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}