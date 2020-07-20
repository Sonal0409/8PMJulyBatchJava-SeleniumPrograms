package javaPrograms8PM;

public class ExceptionsDemo {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		
		//Arthematic Exceptions:
		
		//int x=10/0;   // the compiler threw an exception and stopped execution
		
	//	System.out.println(x);

		// Null pointer exception
		
		//Test cyclle 1
		// value of y fetched from web app was 100
		
		String y="100";
		
		y.length();   //3
		
		// Test Cycle 2
		
		// fetch the value of y
		
		
		//Handling an exception
		// Using try and catch block
		// Anything put in try block will be ignored
		
		
		 y= null;
		try
		{
		int l=y.length();
		System.out.println(l);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();  // to just print the exception message
			System.out.println("handling exceptions in java");
		}
		
		
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		Thread.sleep(3000);

	Thread.sleep(3000);
	
		System.out.println("handling exceptions1");
		System.out.println("handling exceptions2");
		System.out.println("handling exceptions3");
		
		
		
		
		
		
		
		
		
		
		
	}

}
