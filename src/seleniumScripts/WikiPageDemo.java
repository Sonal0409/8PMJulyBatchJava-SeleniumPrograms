package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiPageDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (12)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  // maximize the browser window
		
		driver.manage().deleteAllCookies();  // delete cookies on the browser
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
		
		// locate the text box and enter data in the text box
		
	driver.findElement(By.id("wpName256")).sendKeys("Username1");	
	
	Thread.sleep(3000);
	
	// Inspect password textbox and enter data in the text box
	driver.findElement(By.name("wpPassword")).sendKeys("password@123");
	
	// Inspect confirm password and enter data
	
	// inspect email address text box and enter data
	
	// inspect button and click() on it
	
	driver.findElement(By.xpath("//button[@value='Create your account']")).click();
	
	driver.navigate().to("https://ironspider.ca/forms/checkradio.htm");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@value='yellow']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@value='blue']")).click();
	
	
	// finding checkbox and clicking onit
	
	
	driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[2]/form/input[1]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
