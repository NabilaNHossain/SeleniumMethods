package seleniumMethods;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.netty.handler.codec.socksx.v5.DefaultSocks5PasswordAuthResponse;

public class UseOfIsSelected {
//Test NG library has the capability to run the test  and without the main method.
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
	}

//right click--view page source--ctrl+f--type title-- select the one with the tag name Title
	@Test(enabled = true, priority = 1)
	public void getTitle() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()=New User Registration']")).click();
		Thread.sleep(5000);
		System.out.println("The current URL is " + driver.getCurrentUrl());
	}
//	Must explain why the sleep is necessary here?

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
