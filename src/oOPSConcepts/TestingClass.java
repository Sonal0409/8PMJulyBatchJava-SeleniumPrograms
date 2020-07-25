package oOPSConcepts;

public class TestingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Testing of my application in chrome browser
		
		// We have an Interface name : DevTemplate  -- methodnames
		// we have classes like DevClassChrome, DevClassFF implementing methods of interface DevTemplate
		
		// if we have to class methods 
		
		// classname obj = new classname();
		// interfacename objectname = new interfacename() /// not allowed in java
		// instantiating an object or it is called as reference object for an interface and implementing class
		
		// interfacename objectname = new implementing class
		
		DevTemplate obj;
		
		obj= new DevClassChrome();
		
		obj.browserMethod();
		
		DevTemplate obj2= new DevFF();
		
		obj2.browserMethod();
		
		
		// Selenium -- Interface - WebDriver
		// Implementinf classes -- ChromeDriver , FireFoxDriver
		
		/*
		WebDriver driver;
		
		driver= new ChromeDriver();
		
		WebDriver driver = new FireFoxDriver();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
