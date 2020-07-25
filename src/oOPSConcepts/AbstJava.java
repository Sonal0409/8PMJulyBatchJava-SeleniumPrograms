package oOPSConcepts;

// Abstract class
// whenever a class has abstract methods , than that class is called as abstract class
// provide keyword abstract
public abstract class AbstJava {

	// build an application which has following features: account creation, account deletion, creditSection, DebitSection
	
	// You can provide only the names of the methods
	
	// Developers build a template for all banking software
	// build a class which has only template methods and implementation of 
	//these methods is done everytime in a  new class depending upon the client
	
	//A class  can have methods with body(concrete methods) and 
	// methods without a body (abstract methods)
	
	// An abstract method will not have any block of code and it will end with a ;
	
	public abstract void accountCreation();
	public abstract void accountDeletion();
	public abstract void accountCredit();
	public abstract void accountDebit();
	
	
	public int sum()
	{
		// a1, ,b1,c1 scope is only in between sum() method
		int a1=10;
		int b1=20;
		int c1=a1+b1;
		return c1;
	}
	




		
	

}
