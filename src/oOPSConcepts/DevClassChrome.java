package oOPSConcepts;


// ChromeDriver() class in selenium is implementing WebDriver

public class DevClassChrome implements DevTemplate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(name);
	}

	@Override
	public void browserMethod() {
		// TODO Auto-generated method stub
		System.out.println("Browser method to open Chrome browser");
	}



	@Override
	public void senddata() {
		// TODO Auto-generated method stub
		System.out.println("Browser method to send data in text box");
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

	@Override
	public void OpenURL() {
		// TODO Auto-generated method stub
		
	}

	

}
