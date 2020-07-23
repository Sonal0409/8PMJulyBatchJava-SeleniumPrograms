package javaPrograms8PM;

public class InbuiltMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		
		Integer i=200;
		
		// classanme uniquename= new Classname();
		// Classname uniquename;
		// here name= object
		
		// we need an object to call a method
		
		// equals()  ---> String class
		
		// String s="selenium";
		
		  String s1="Selenium123";  // s1 becomes an object
		
	    String s2="Selenium";
	    
	 // Ascii value : A to Z(65 to 90)
	    //a to z(97 to 122)
	    //0-9 -48 to 57
	    
        //  equals() method : it is used to check if 2 strings are equal or not

	    // output is going to be boolean -- true or False
	    
	      System.out.println("equals method output : " + s1.equals(s2));
		   
		   System.out.println("equals method output : " + s1.equals("Selenium123"));
		   
		   // 3. concat() -- used to join 2 strings
		   
	
		  System.out.println("concat method output : " + s1.concat("training"));
		   
		  // 5. equalsIgnoreCase   // ignore the case of the Characters and just compare each character
		  
		  // output will be boolean
		 // Expected output : googlesearch
		  
		  // Actual output --GoogleSearch
			 
			 String s4="SELENIUM";
			 String s5="selenium";
			  
			   
			   s4.equals(s5);  // False
			   
			   
			   s4.equalsIgnoreCase(s5); //True	
			   
			// contains() method
			   
			   // Expected output : "www.inbuiltmethod%20%50%70.gov.in"
				  
				  // Actual output --" www.inbuiltmethod%20%50%70.gov.in" 
			   
			   
			   String Actual="www.inbuiltmethod%20%50%70.gov.in";
			   
			   if(Actual.contains("inbuiltmethod"))
			   {
				   System.out.println("you are on correct page");
			   }
			   
			   
			   String ss= "selenium Training 8 PM";
			   
			   boolean cresult= ss.contains("selenium");
				  System.out.println(cresult);
				  
	// Number methods
				  
				  
			Integer x=100;
			
			// equals()
			
			System.out.println("output of equals() method:" + " " + x.equals(200));  // False
				  
			
			// Classname.methodname
			// classnmae.propertyname.methodname
			
			// objname.methodname.methodname
			
			
			
			int res=Math.min(100, 300);
			
			System.out.println("output of min() method" + " " +res);
				  
				  
				  
				s1.length(); // will return an integer value which is number of characters in the string  
				  
			String s3="Javaprogram"	  ;
				  
				  
				  
				  
				  
				  
				  
				  
				  

	}

}
