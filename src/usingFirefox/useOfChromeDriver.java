package usingFirefox;

import java.time.Duration;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class useOfChromeDriver {
	FirefoxDriver driver;

	@BeforeTest
	public void setUp3() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void navigationTest() {
		System.out.println(driver.getCurrentUrl());
//	driver.navigate().back();
//	driver.navigate().forward();
//	driver.navigate().refresh();
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
