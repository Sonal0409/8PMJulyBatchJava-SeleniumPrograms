package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (12)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  // maximize the browser window
		
		driver.manage().deleteAllCookies(); 
		
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		
		// Select is a selenium class used when we want to test static drop down menus
		
		WebElement wb= driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/center[1]/div/form/select"));
		
		Select dd = new Select(wb);
		
		 
		dd.selectByIndex(0);  // this method will select the option at index 0 in the drop down
		
		Thread.sleep(3000);
		
		dd.selectByValue("sugar"); // this method will select the option based on value attribute in Options tag
		
		Thread.sleep(3000);
		
		dd.selectByVisibleText("With cream & sugar"); // this method will select the option based on text in the drop down
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
