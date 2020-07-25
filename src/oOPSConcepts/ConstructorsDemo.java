package oOPSConcepts;

public class ConstructorsDemo {

	String empname;
	int empid;
	
	//Constructor is a block of code and it has same name as the class
	// there is no return type with a constructor
	// Use of constructor is to intialize the object
	
	// default constructor// how to call a constructor
	// in a class we can have multiple constructors
	public ConstructorsDemo()
	{
		System.out.println("Default constructor");
	}
	
	public ConstructorsDemo(int i)
	{
		System.out.println(i);
	}
	
	// this keyword : to assign class variable to localvariables
	public ConstructorsDemo(String empname, int empid)   // this is  constructor
	{
		this.empname=empname;
		this.empid=empid;
		
		System.out.println(empname + " "+ empid);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A constructor gets automatically executed as soon as the object is created
		ConstructorsDemo obj = new ConstructorsDemo();
		ConstructorsDemo obj1 = new ConstructorsDemo(10);
		ConstructorsDemo obj3 = new ConstructorsDemo("Tom",123);
	
				

	}

}
