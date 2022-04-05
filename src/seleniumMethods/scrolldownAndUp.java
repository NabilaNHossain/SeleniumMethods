package seleniumMethods;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scrolldownAndUp {
	WebDriver driver;
	JavascriptExecutor js;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		js =(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void scrollUp() throws InterruptedException {
		Actions actions= new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		Thread.sleep(5000);
}

	@Test
	public void scrollUpAndDown()  {
		driver.navigate().to("https://www.amazon.com/");
		Actions actions= new Actions(driver);
		js.executeScript("window.scrollBy(0,3000)", "");
		js.executeScript("window.scrollBy(0,-3000)", "");
		driver.navigate().back();
		driver.navigate().refresh();
}

	@AfterTest
	public void tearUP() {
		driver.quit();
	}

}
