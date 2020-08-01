package seleniumScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Test Case is : to Open wiki create account page in chrome browser
		
		// Provide the browser driver details
		// System.setProperty(name of the driver, path of driver in your machine along with chromedriver.exe file name)
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (12)\\chromedriver.exe");
		
		// open the browser -- ChromeBrowser
		
		// WebDriver interface ----> ChromeDriver , FireFoxDriver
	
		
		WebDriver driver= new ChromeDriver();
		
		// Maximize the browser
		
		driver.manage().window().maximize();
		
		// delete cookies on the browser
		
		driver.manage().deleteAllCookies();
		
		
		
		// open the application on the browser -- get() method
		
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		// close the browser
		
		
		
		driver.close();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
