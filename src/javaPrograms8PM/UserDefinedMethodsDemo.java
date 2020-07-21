package javaPrograms8PM;

public class UserDefinedMethodsDemo {
	
	// Static variables or global variables
	
	// variables which can be used anywhere, in any methods of the same class or in other classes
	// declared just after the class and outside main method
	
	static String  st="selenium";
	
	
	
	
	
	
	// User defined methods: 
	//   Methods which return value
	//   methods which donot return value
	
	
// Syntax: modifier dataype	methodname()
	//  {
              // lines of code // to add 2 numbers
//                          }
//the  datatype should be given based on the type of data which the 
	//method is going to return
	
	//   Methods which return value
	// methods are written outside main method
	
	public  int add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Adding 2 numbers");
		System.out.println(st);
		return sum;
	}
	
	// Methods which donot return a value
	
	public void login()
	{
		// selenium script
		System.out.println("Enter data in Username");
		System.out.println("Enter data in Password");
		System.out.println("Enter data in Email");
		System.out.println("click on login button");
		//System.out.println(a);
		System.out.println(st);
	}
	
	public void sum()
	{
		int a=10;
		int b=20;
		int result=a+b;
		System.out.println(result);
	}
	
	// Static methods
	public static void mul()
	{
		int a=10;   // local variables
		int b=20;
		int mulresult=a*b;
		
		System.out.println(mulresult);
	}
	
	public static int sub()
	{
		int a=10;
		int b=20;
		int result=b-a;
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		// Java -- 2 types : User defined methods, In built methods(length)
		
				int x1=20;
				
				System.out.println(st);
			
				System.out.println("learning Java");
				
				// we call the methods inside main method
				
			// 2 ways of calling a method	
			
				// 1. In java we can Call a method using an Object
				
				// Create an Object
				// Object will be created for the class in which method is present
				
				// Classname  object name = new ClassName();
				
				UserDefinedMethodsDemo obj = new UserDefinedMethodsDemo();
				
				// we call the method in following format
				// output is returned to the line calling it
				int x= obj.add();  // 30
				
				int y=30;
				
				int mul= x*y;
				
				System.out.println(mul);
				
				obj.login();
				
				System.out.println("The addition of 2 numbers is :" + obj.add());  //30
				
			// A method can be called several times	
				
				obj.sum();
				
			//Calling a method without using an object	
				
				sub();
				
				mul();
				
				
				
				String s2;
				
				
				
		
		
	}
}
