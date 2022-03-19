package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class A01_use_of_get_method_by_main_method {

	public static void main(String[] args) throws InterruptedException {
//		system is a class from java library and set property is a method.setproperty(string key,string value). Location is copied from the chrome driver.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tthik\\eclipse-workspace\\SeleniumMethods\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  
//		or use full screen() method instead of maximize.this maximizes the page.
		driver.manage().deleteAllCookies();
//		this command delete all the cookies to run the browser smoothly.
		driver.get("https://www.amazon.com");
//use get(string type) . This line will be used to open the browser/URL. interview question.
		Thread.sleep(5000);
		driver.close();
//		we can use close() method as well instead of quit.
	}

}
