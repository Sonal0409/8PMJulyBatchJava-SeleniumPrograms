package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (12)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();  // maximize the browser window
			
			driver.manage().deleteAllCookies(); 
			
			driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
			
			Thread.sleep(3000);
		driver.switchTo().frame("packageListFrame");
		
		driver.findElement(By.linkText("com.thoughtworks.selenium.webdriven")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("com.thoughtworks.selenium.webdriven.commands")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
