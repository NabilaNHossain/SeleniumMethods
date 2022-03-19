package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfNmaeLocator {
//Test NG library has the capability to run the test  and without the main method.
	WebDriver driver;
	@BeforeTest
	public void setUp () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();  
		driver.manage().deleteAllCookies();
	}
	
	@Test
	public void urlTest() {
		driver.get("https://www.amazon.com");
	}
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
