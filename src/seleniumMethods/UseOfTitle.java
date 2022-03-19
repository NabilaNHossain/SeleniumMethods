package seleniumMethods;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.netty.handler.codec.socksx.v5.DefaultSocks5PasswordAuthResponse;

public class UseOfTitle {
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

	@Test(enabled = true, priority = 1)
	public void CheckBoxSelected() throws InterruptedException {
		driver.findElement(By.cssSelector("label#cms-label-tc")).click();
		Thread.sleep(5000);
		boolean checkBox = driver.findElement(By.cssSelector("label#cms-label-tcl")).isSelected();
		System.out.println("Is the Check box selected? Ans:" + checkBox);

	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
