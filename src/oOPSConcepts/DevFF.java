package oOPSConcepts;


// FireFoxDriver  which implements WebDriver

public class DevFF implements DevTemplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void ownmethod()
	{
		System.out.println("own method of DevFF class");
	}

	@Override
	public void browserMethod() {
		// TODO Auto-generated method stub
		System.out.println("Browser method to open FF browser");
	}

	@Override
	public void OpenURL() {
		// TODO Auto-generated method stub
		System.out.println("Browser method to open Url on the FF browser");
	}

	@Override
	public void senddata() {
		// TODO Auto-generated method stub
		System.out.println("Browser method to send data in text box on FF browser");
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Browser method to oclick on a button or link");
	}

	@Override
	public void getattribute() {
		// TODO Auto-generated method stub
		System.out.println("Browser method to get attributes of any element");
	}
}
