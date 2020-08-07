package seleniumScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (12)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  // maximize the browser window
		
		driver.manage().deleteAllCookies();  // delete cookies on the browser
		
	    driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	    // inspecting username textbox and entering data
	   
	    driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Sonalmittal");
	    
	    // click on create account button
	    
	    driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();
	    
	    Thread.sleep(3000);
	    
	    // Switch from window to Alert box
	    
	    // Alert class have methods like accept(), dismiss(), getText(), sendKeys()
	    
	  Alert a=  driver.switchTo().alert();
	  
	  Thread.sleep(2000); 
	  String text= a.getText(); 
	    
	  System.out.println(text);
	  
	  Thread.sleep(2000);
	  
	  a.accept();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("sonal04");
	  
	  
	  
	  
	  
	    
	    
	    
	    
	    
	

	}

}
