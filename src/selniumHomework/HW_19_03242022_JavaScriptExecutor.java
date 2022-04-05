package selniumHomework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_19_03242022_JavaScriptExecutor {
	WebDriver driver;
	JavascriptExecutor js;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void clickTheSearchBox() {
		driver.get("https://www.ebay.com/");
		js = (JavascriptExecutor) driver;
		WebElement search = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		js.executeScript("arguments[0].click()", search);
	}

@Test
public void sendKeys() {
	driver.get("https://www.amazon.com/");
	js.executeScript("document.getElementById('twotabsearchtextbox').value='shirt';");
	js.executeScript("document.getElementById('nav-search-submit-button').click();" );
}

@Test
public void sendKeys2()  {
	driver.get("https://www.bestbuy.com/");
	js.executeScript("document.getElementById('gh-search-input').value = 'laptop';");
}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
