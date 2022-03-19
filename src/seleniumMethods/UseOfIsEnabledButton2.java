package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfIsEnabledButton2 {
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
	
	@Test (enabled = true, priority = 1)
	public void  logoTest() {
	boolean logInButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']")).isEnabled();
   System.out.println("Is the LogIn button Enabled? Ans:" + logInButton);
		}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}
	
}
