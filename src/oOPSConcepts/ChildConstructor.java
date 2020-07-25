package oOPSConcepts;

public class ChildConstructor extends ConstructorDemoJuly {

	
	
	public ChildConstructor()
	{
		super();   // it will fetch the dafult constrctor of parent class
		System.out.println("child default constructor");
	}
	
	public ChildConstructor(int i)
	{
		super(12345);   // it will fetch the constrctor with 1 paremeter of parent class

		System.out.println("value of i" + " "+ i);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ChildConstructor obj= new ChildConstructor();
		ChildConstructor obj2= new ChildConstructor(10);

	}

}
