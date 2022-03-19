package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfLinkTest {
//Test NG library has the capability to run the test  and without the main method.
	WebDriver driver;
	@BeforeTest
	public void setUp () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();  
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		Thread.sleep(5000);
	}
	
	@Test 
	public void sellEbayTest() throws InterruptedException {
		driver.findElement(By.linkText("Start selling")).click();
		Thread.sleep(5000);
	}
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
