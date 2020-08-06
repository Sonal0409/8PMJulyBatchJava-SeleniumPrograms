package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	
	// Links , LinkText locator
	// isEnabled(), isDisplayed, clear() , isSelected()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (12)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  // maximize the browser window
		
		driver.manage().deleteAllCookies();  // delete cookies on the browser
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Selenium+%28software%29");
		
		
		// Links: basic action on link: click, if we click on a link we will be redirected to a new page
		// in order to find a link we will use a linkText locator
		
		driver.findElement(By.linkText("Main page")).click();
		
		// to check if we have landed on the correct page or not?
		
		System.out.println(driver.getTitle());
		
		// partialLinkText  -- is also applicable to links
		
		driver.findElement(By.partialLinkText("anyone")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
