package oOPSConcepts;

// Interface is like a template where we just have method name

// All interface are implemented in a seperate class


// WebDriver
public interface DevTemplate {
	
	String name="selenium";
	// these features have to implemented for chrome browser, FF browser and IE browser
	void browserMethod();
	void OpenURL();
	void senddata();
	void click();
	void getattribute();

}
