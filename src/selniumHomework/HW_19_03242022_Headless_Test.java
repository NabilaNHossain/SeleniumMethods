package selniumHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HW_19_03242022_Headless_Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		System.out.println("The text of the webelement is :" + driver.getCurrentUrl());
		driver.quit();
	}
}
