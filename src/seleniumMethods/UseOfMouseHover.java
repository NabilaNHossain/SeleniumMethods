package seleniumMethods;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfMouseHover {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://healthy.kaiserpermanente.org/front-door");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void selectByMouseHover() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement drug = driver.findElement(By.xpath("//a[normalize-space(text())='Browse the Drug Encyclopedia']"));
		actions.moveToElement(drug).build().perform();
		Thread.sleep(5000);
		System.out.println("The text is: " + drug.getText());
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
