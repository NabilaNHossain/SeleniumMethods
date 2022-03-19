package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfClickMethodCssSelector2 {
//Test NG library has the capability to run the test  and without the main method.
	WebDriver driver;
	@BeforeTest
	public void setUp () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();  
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
	}
	
	@Test
	public void  logInButtonTest() {
		driver.findElement(By.cssSelector("button#cms-login-submit[name='Submit Login']")).click();
		}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
