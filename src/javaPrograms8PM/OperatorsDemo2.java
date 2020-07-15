package javaPrograms8PM;

public class OperatorsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lOGICAL OPERATORS ARE PERFORMED ON 2 RELATIONAL EXPRESIONS
		
		//AND Operator  -- &&
		// When && (AND) operator is used : 
		//the out is going to be TRUE only when both the relation expression is true
		
		int x=300;
		int y=500;
		int z=500;
		
		//((x<y)      &&          (x<z))  // logical expression in Java
		
		// (true      &&             true)   // the output is going to be true
		
		//((x==y)      &&          (x>z))
		 
		//( false  &&  False)   // the final output is going to be False
		//((x>y)      &&          (x<z))
		 
		//( false  &&  true)   // the final output is going to be False	 
		
		
		if((x==y)&&(x>z))  // compound condition
{
	System.out.println("execute the block of code");
}
		
		
		
		boolean results= ((x<y)&&(x<z));  // true
		System.out.println(results);
		
		
		//OR operator  ||
		
		// In case of OR operator, 
		//if anyone of the relational expression is true, the final output is going to be true
		
		
		// x=400;
		// y=500;
		// z=400;
		 
			//((x<y)      ||        (x==z))
		
		//   ( true || true)   ----> true
		
		// false || true   ----> TRUE
		
		// false  ||  false----> false
		
		// True || False  --->true
		
		int age= 30;
		
		 if((age==30)||(age>18))
		 {
			 System.out.println("give the licence to customer");
		 }
		
		
		 
		 
		
		// Not operator  !  - if the original value of the expression is true, and if we use ! operator on it, 
		//the output will be changed to False
		
	int x1=100;
	int y1=50;
	
	if(!(x1==y1))       // x1 not equal to y1  ---true
		
		
		// !(x==y)
		
	{
		System.out.println("the output is true");
	}
		// x>y --> 100>50 --->true
		 
		//!(x>y)  ---!(100>50)  ---> False
		// 100 is not greater than 50   ---> false
		
		
		
		
		
		
		
	}

}
