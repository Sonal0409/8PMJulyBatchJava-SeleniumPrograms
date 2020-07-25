package oOPSConcepts;

public class ConstructorDemoJuly {

	// Constructors in Java
	
	String empname;
	
	int empid;
	//Constructors: are written in following way
	// every constructor name == classname
	// they are same as methods but they donot have any return type
	
	// Types of Constructor : Default constructor
	public ConstructorDemoJuly()   // this a constructor
	{
		System.out.println("calling default constructor");
	}
	
	public ConstructorDemoJuly(int empid)
	{
		System.out.println(empid);
	}
	
	public ConstructorDemoJuly(String empname, int empid)
	{
		this.empname=empname;
		this.empid=empid;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// As soon as we create an object, it will call the constructor
		ConstructorDemoJuly obj= new ConstructorDemoJuly();
		
		ConstructorDemoJuly obj1= new ConstructorDemoJuly(184672);
		
		ConstructorDemoJuly obj2= new ConstructorDemoJuly("Sonal",184672);
		ConstructorDemoJuly obj3= new ConstructorDemoJuly("Tom",23456);
	
	}

}
