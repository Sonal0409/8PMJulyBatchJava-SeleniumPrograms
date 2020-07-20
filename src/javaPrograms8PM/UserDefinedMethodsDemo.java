package javaPrograms8PM;

public class UserDefinedMethodsDemo {
	
	
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
	
	public static int add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Adding 2 numbers");
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
	}
	
	public void sum()
	{
		int a=10;
		int b=20;
		int result=a+b;
		System.out.println(result);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Java -- 2 types : User defined methods, In built methods(length)
		
		
	
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
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
