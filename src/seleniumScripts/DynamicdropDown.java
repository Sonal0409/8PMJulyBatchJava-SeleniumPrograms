package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicdropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Dynamic dropdowns
		
	//	capture the drop down using inspector
		
		// write an xpath to capture all the options of the drop down
         // and store it in a list object -- 10 options
		// size() to count the number of values
		// getoptions() method to fetch all the options
		// for loop to go to each option and match out required text and print it
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (12)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  // maximize the browser window
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/#ddle=0");
		
		driver.findElement(By.name("q")).sendKeys("java doc");
	
		List<WebElement>obj=driver.findElements(By.xpath("//*[@role='listbox']/child::*"));
	
	int num=obj.size();
	
	
	
	
	
	}

}
