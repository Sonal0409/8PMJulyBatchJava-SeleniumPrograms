package seleniumScripts;

import java.util.List;

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
		
		WebElement e= driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/center[1]/div/form/select"));
		
		
		Select dd = new Select(e);
		
		//Select dd = new Select(driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/center[1]/div/form/select")););
		
		dd.selectByIndex(0);  // this method will select the option at index 0 in the drop down
		
		Thread.sleep(3000);
		
		dd.selectByValue("sugar"); // this method will select the option based on value attribute in Options tag
		
		Thread.sleep(3000);
		
		dd.selectByVisibleText("With cream & sugar"); // this method will select the option based on text in the drop down
		
		
		// counting number of options in the drop down
		
		// List<String> s1;
		// List<Integer> in;
		// List Object
	List<WebElement>  li=dd.getOptions();  // this method will fetch all the options (5) from the drop down
		
	int num =li.size();   // will count the total number of values in the list
	
	System.out.println("Total values in DD : "+ num);
	
	
	//printing all the values from the drop down on your console
	
	// write a for loop
	
	for(int i=0; i<num;i++)
	{
		System.out.println(li.get(i).getText());
		
	}
	
	// OR
	
	for(WebElement i : li)
	{
		String x= i.getText();
		if(x.equals("with sugar"));
		System.out.println(x);
		break;
	}
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
