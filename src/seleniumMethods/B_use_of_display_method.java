package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B_use_of_display_method {
	 
		WebDriver driver;

		@BeforeTest
		public void setUp() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
			// WebDriver is an interface and ChromeDriver is a concrete class
			driver = new ChromeDriver();
			driver.get("https://portaldev.cms.gov/portal/");
			Thread.sleep(4000);
		}
		@Test
		public void loginButtonTest() throws InterruptedException {
			driver.findElement(By.id("cms-login-submit")).click();
			Thread.sleep(5000);
//			this will pause the webpage for 5 secs. this is not a part of testing.
		}

		@AfterTest
		public void tearUp() {
			driver.quit();
		}

	}


