package javaPrograms8PM;

public class NumberMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Number methods
		
		// to use number methods we will create objects
		//  Number methods are available in class like Math, Integer
		
	int a=10;
		
	Integer i=100;
	
	
	
	//  compareTo() : this method is used to comapre 2 integer values
	//   if integer 1 is greater than integer 2 : output will be 1
	// if integer 1 is less than integer 2 : output will be -1
	// if integer 1 is equal to integer 2 : output will be 0
	
	
	
	int result= i.compareTo(a);
	
	System.out.println(result); // 1
	
	
	int result1= i.compareTo(200);
	
	System.out.println(result1);  // -1	
		
	
	// equals()
	
	System.out.println(i.equals(200));
	
	
	// abs() method : Math class
	
	// classname.methodname()
	System.out.println(Math.abs(-3.45));
	
	// round()
	
	
	System.out.println(Math.round(5.47));
	
	System.out.println(Math.min(100, 200));  // 100
	
	
	
	System.out.println(Math.random());
	
	
	char c='X';
	// Character methods
	
	System.out.println(Character.isLetter('a'));
	// will give output true or false 
	
	
	
	System.out.println(Character.isDigit('a'));
	// will give output true or false 
	
	System.out.println(Character.isUpperCase('A'));
	// will give output true or false 
	

	System.out.println(Character.isUpperCase('1'));
	// will give output true or false  
	

	System.out.println(Character.isLowerCase('A'));
	// will give output true or false 
	
	
	
	
	
	
	
		
	}

}
