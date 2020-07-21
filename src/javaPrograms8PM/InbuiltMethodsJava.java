package javaPrograms8PM;

public class InbuiltMethodsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		
		// String methods
		
		String s1="Selenium123";
		
	    String s2="Selenium";
	    
	    // 1. compareTo() method
	    // Ascii value : A to Z(65 to 90)
	    //a to z(97 to 122)
	    //0-9 -48 to 57
	    // it is sued to comapre between 2 strings
	    // output is going to either +ve value, 0 or -ve value
	    // if String1 is greater than string 2  --- +ve value as output
	    // if String 1 is lessthan string 2----> -ve value
	    // if String 1 and string 2 are equal ---> 0
	    
	    
	   int output1= s1.compareTo(s2);
	    
	   System.out.println(output1);
	   
	    
	  // 2. equals() method : it is used to check if 2 strings are equal or not
	   
	   // output is going to be boolean
	   
	   
	  System.out.println("equals method output : " + s1.equals(s2));
	   
	  System.out.println("equals method output : " + s1.equals("Selenium123"));
	   
	   // 3. concat() -- used to join 2 strings
	  
	  System.out.println("concat method output : " + s1.concat("training"));
	   
	  
	  //4.charAt(): return the character presnet at the index value provided
	  // output is going to be a character
	  
	  String s3="JavaProgram";
	  
	 System.out.println("charAT() method output: " + s3.charAt(5));
	  
	  
	  // 5. equalsIgnoreCase
	 
	 String s4="SELENIUM";
	 String s5="selenium";
	  
	   
	   s4.equals(s5);  // False
	   
	   
	   s4.equalsIgnoreCase(s5); //True
	   
	  // write a program  in which you declare 2 strings
	   
	   // toUppercase()
	  //  toLowercase()

	   // on first string ="seleniuM" and apply the method toUppercase()
	   
	   // 2nd string " Selenium" and apply method to  toLowercase()
	   
	   
	   
	   String d1= "  Username   ";
	   
	   System.out.println("before trim"+ d1);
	   
	   String dresult= d1.trim();   // it will remove the spaces before or after the string a
	   
	  System.out.println("AFter trim" + dresult);
	   
	   
	  // substring()
	  
	  String ss= "Welcome to the selenium class";
	  
	  String ssresult= ss.substring(15);
	  
	  System.out.println(ssresult);
	  
	  
	  // endswith(): this method checks if the given strings ends with the 
	  //series of characters provided by the user. it will give true or false as output.
	  
	boolean ersult=  ss.endsWith("class45");
	  
	  System.out.println(ersult);
	  
	  boolean cresult= ss.contains("selenium");
	  System.out.println(cresult);
	  
	  
	 System.out.println( ss.length());  // fetch us the number of characters in the string
	  
	  
	  
	  String toU="SeleniuM";
	  
	  System.out.println(toU.toUpperCase());
	  
	
	  String toL="SeleniuM";
	  
	  
	  System.out.println(toL.toLowerCase());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	   
	   
	    
	    
	    
	    

	}

}
