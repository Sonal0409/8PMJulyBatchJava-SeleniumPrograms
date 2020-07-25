package oOPSConcepts;



public class Demo extends AutoLoans {

	// Whenever a user needs to pass different set of data each time the method is called, we prameterization the methods
	// data is passed to the method when the method is called
	
	public int sum(int a , int b)
	{
		int result= a+b;
		return result;
	}
	
	public String sum(String a , String b)
	{
		String result= a+b;
		return result;
	}
	
	public String sum(String x, int y)
	{
		String result= x+y;
		return result;
	}
	public String sum(String x, int y, String z)
	{
		String result= x+y;
		return result;
	}
	
	public void sum()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo obj = new Demo();
		
		
		
		//System.out.println(obj.sum(100, 200));
		
		//System.out.println(obj.sum(50, 50));
		
		
		
		
	}

}
