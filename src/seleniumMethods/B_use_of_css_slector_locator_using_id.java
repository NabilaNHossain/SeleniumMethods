package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B_use_of_css_slector_locator_using_id {
	 
		WebDriver driver;

		@BeforeTest
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
			// WebDriver is an interface and ChromeDriver is a concrete class
			driver = new ChromeDriver();
			driver.get("https://portaldev.cms.gov/portal/");
			
		}
		@Test
		public void loginModalHeaderTest() throws InterruptedException {
			driver.findElement(By.cssSelector("button#cms-login-submit")).click();
			Thread.sleep(5000);
		}

		@AfterTest
		public void tearUp() {
			driver.quit();
		}

	}


