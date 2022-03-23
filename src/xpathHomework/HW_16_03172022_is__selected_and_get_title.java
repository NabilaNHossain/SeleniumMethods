package xpathHomework;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HW_16_03172022_is__selected_and_get_title {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.discover.com/");
	}

	@Test(priority = 1)
	public void buttonTest() throws InterruptedException {
		boolean checkBoxTest = driver.findElement(By.xpath("//input[@id='id-checkbox-content']")).isSelected();
		Thread.sleep(5000);
		System.out.println("Is the check box clicked? Ans: " + checkBoxTest);
	}

	@Test(priority = 2)
	public void getTitle() {
		System.out.println("The title of the page is " + driver.getTitle());
	}

	@Test(priority = 3)
	public void getCurrentUrl() {
		System.out.println("The current URL is " + driver.getCurrentUrl());
	}

	@Test(priority = 4)
	public void getCurrentUrl2() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='All Products']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='expand_menu_label' and @class='new_cc_link']")).click();
		Thread.sleep(3000);
		System.out.println("The current URL is " + driver.getCurrentUrl());
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}