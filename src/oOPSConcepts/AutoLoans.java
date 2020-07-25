package oOPSConcepts;

public class AutoLoans extends HomeLoans {

	public void browser()
	{
		System.out.println(" Test case to opne MS edge browser");
	}
	
	public void applyAutoLoan()
	{
		System.out.println("Test Case to apply for Autoloan on the application");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AutoLoans obj = new AutoLoans();
		
		//Test Case: 
		// MSEdge browser
		
		// Over riding : if methods with same name are present in child class and parent class
		//Then only method of current class will be called
		obj.browser();  // which class method will be called when  both class have same method names
		
		//1. Loginto Banking application
		obj.login();
		//2. Create an New Customer account
		obj.AccountCreation();
		//3. Apply for Auto loan for new cusotmer created
		obj.applyAutoLoan();
		//4.Logout of application
		obj.logout();
		chromebrowser();
		//5. Loginto the application
		obj.login();
		//6. Search for an exisitng customer
		obj.CustomerDetails();
		//7. Generate loan payment details
		obj.LoanPayments();
		// 8. logout of the application.
		obj.login();

	}

}
