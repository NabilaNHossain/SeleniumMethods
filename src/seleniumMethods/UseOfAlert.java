package seleniumMethods;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UseOfAlert {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

@Test
public void accept() {
driver.findElement(By.xpath("//button[text()=''Try it]")).click();
Alert alert = driver.switchTo().alert();
alert.accept();
}


@Test
public void alertDismiss() {
driver.findElement(By.xpath("//button[text()=''Try it]")).click();
Alert alert = driver.switchTo().alert();
alert.dismiss();
}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}
