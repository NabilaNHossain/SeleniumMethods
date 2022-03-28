package selniumHomework;

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

public class HW_18_3222022_3 {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test(enabled = true, priority = 1)
	public void dropdown() throws InterruptedException {
		WebElement dd = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dd);
		select.selectByIndex(4);
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 2)
	public void dropdown2() {
		WebElement ddw = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(ddw);
		select.selectByValue("20081");
		select.selectByVisibleText("Collectibles");
	}

	@Test
	public void mouseHoverOver() {
		Actions actions = new Actions(driver);
		WebElement notif = driver.findElement(By.xpath("//i[text()='Notification']"));
		actions.moveToElement(notif).build().perform();
		System.out.println("The text of the WebElement is :" + notif.getText());
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
