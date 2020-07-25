package oOPSConcepts;

public class AbstrctMethdsImpl extends AbstJava{

	
	public int sum()
	{
		// a1, ,b1,c1 scope is only in between sum() method
		int a1=10;
		int b1=20;
		int c1=a1+b1;
		return c1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstrctMethdsImpl obj = new AbstrctMethdsImpl();
		
		obj.accountCreation();
		obj.accountCredit();
		System.out.println(obj.sum());
		
	}

	@Override
	public void accountCreation() {
		// TODO Auto-generated method stub
		
		System.out.println("Account creation method");
	}

	@Override
	public void accountDeletion() {
		// TODO Auto-generated method stub
		System.out.println("Account Deletion method");
	}

	@Override
	public void accountCredit() {
		// TODO Auto-generated method stub
		System.out.println("Account Credit method");
	}

	@Override
	public void accountDebit() {
		// TODO Auto-generated method stub
		System.out.println("Account Debit method");
	}


}
