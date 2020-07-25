package oOPSConcepts;

public class AbsChildClass extends BaseAbsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AbsChildClass obj= new AbsChildClass();
		
		obj.login();
		obj.clickonbutton();
		obj.attributebutton();
		obj.logout();
	}

	@Override
	public void clickonbutton() {
		// TODO Auto-generated method stub
		
		System.out.println("click functionality");
	}

	@Override
	public void attributebutton() {
		// TODO Auto-generated method stub
		System.out.println("attribute functionality");	
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		System.out.println("logout functionality");	
	}

}
