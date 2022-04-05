package selniumHomework;

import java.time.Duration;

import org.apache.hc.client5.http.nio.ManagedAsyncClientConnection;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_19_03242022_alert {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://enthrallit.com/selenium/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
@Test
public void alert() {
	driver.findElement(By.xpath("//button[text()='Alert']")).click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
}

@Test
public void confirm() {
	driver.findElement(By.xpath("//button[text()='Alert']")).click();
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
}

@AfterTest
public void tearUP() {
	driver.quit();
}
}
