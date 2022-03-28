package seleniumMethods;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfGetMethodByTestNg2 {
//Test NG library has the capability to run the test  and without the main method.

	@BeforeTest
	public void setUp () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
 		WebDriver driver = new ChromeDriver(options);
		driver.get("https://portal.cms.gov/portal/");
		driver.findElement(By.xpath("//a[text()='New User Registration']"));
	}
	
	
	
}
