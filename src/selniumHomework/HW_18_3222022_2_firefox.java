package selniumHomework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_18_3222022_2_firefox {
	FirefoxDriver driver;

	@BeforeTest
	public void setUp3() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test(priority = 2)
	public void mouseHoverover() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement sgn = driver.findElement(By.id("gh-btn"));
		actions.moveToElement(sgn).build().perform();
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void title() {
		System.out.println("The title of the page is : " + driver.getTitle());
	}

	@Test(priority = 3)
	public void dropdown() {
		WebElement ddw = driver.findElement(By.cssSelector("select#gh-cat"));
		Select select = new Select(ddw);
		select.selectByValue("267");
		System.out.println("The name of the webelement is: "+ ddw.getText());
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
