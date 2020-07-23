package oOPSConcepts;

// extends keyword is used to inherit the properties from 1 class to another

public class HomeLoans  extends BaseClass {
	
	// prerequiste is 
	// that the cusotmer should loginto the application
	// create its account
	// only than customer can apply for loan
	// writing test steps for logginto application
	// write test steps for creating an account
	
	public void applyLoan()
	{
		System.out.println("Test steps to apply for Homeloan on the application");
	}
	
	// that the user should login and search for it details
	public void LoanPayments()
	{
		System.out.println("Test steps to generate loanpayment details on the application");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HomeLoans obj= new HomeLoans();
		// obj is pointing to HomeLoans class, as well as my BaseClass
		//Test Case: 
		// open the chrome browser
		
		chromebrowser();
		
		//1. Loginto Banking application
		
		obj.login();
		//2. Create an New Customer account
		obj.AccountCreation();
		//3. Apply for Home loan for new cusotmer created
		obj.applyLoan();
		//4.Logout of application
		obj.logout();
		
		// execute this in FF browser
		FFbrowser();
		
		
		//5. Loginto the application
		obj.login();
		//6. Search for an exisitng customer
		obj.CustomerDetails();
		//7. Generate loan payment details
		obj.LoanPayments();
		// 8. logout of the application.
		
		obj.logout();
		
	}

}
