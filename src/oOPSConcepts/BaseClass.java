package oOPSConcepts;

public class BaseClass {

	public static void chromebrowser()
	{
		System.out.println("Steps to open chromebrowser");
		System.out.println("steps to open the webpage on the chromebrowser");
	}
	
	public static void FFbrowser()
	{
		System.out.println("Steps to open FFbrowser");
		System.out.println("steps to open the webpage on the chromebrowser");
	}
	public static void IEbrowser()
	{
		System.out.println("Steps to open IEbrowser");
		System.out.println("steps to open the webpage on the chromebrowser");
	}
	
	public void login()
	{
		System.out.println("Test steps to test loginto an application");
	}
	
	public void AccountCreation()
	{
		System.out.println("Test steps for Account creation on the application");
	}
	
	public void CustomerDetails()
	{
		System.out.println("Test steps to find exisitng customer details");
	}
	
	public void logout()
	{
		System.out.println("Test Steps to logout of an application");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseClass obj= new BaseClass();
		
		obj.login();
		
		obj.AccountCreation();
		
		obj.logout();
		
		obj.login();
		
		obj.CustomerDetails();
		
		obj.logout();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
