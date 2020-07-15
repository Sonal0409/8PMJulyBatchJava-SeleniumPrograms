package javaPrograms8PM;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// loops are fetching data from excel sheet, 
		//cell value for each row and col
		// once the values are fetched they have to be stored
		
		// variables is storing temp data
		
	// String username="us1", ps1, password123, username1@gmail.com;
		
		// A variable cannot be used to store mulitple set of data
		
		
	// Arrays --- Are Object in Java which is used to store multiple values	
		
		// how to declare an array
		
		// Name of array and datatype of it, length of the array, data to be stored
		
		
		// create an array storing integer values
		
		// Method 1 : to write an Array in Java
		
		// Declaring an Array
		
		int Arr[];
		
		// length of array as 4
		
		
		//new = if we want to allocate some memory sapce for that object we will use new keyword
		
		Arr= new int[4];
		
		// store values in the array
		
		Arr[0]=10;
		Arr[1]=20;
		Arr[2]=30;
		Arr[3]=40;
		//Arr[4]=50;
		
		System.out.println(Arr[0]);  // print the value stored at location Arr[0]
		
		
		
		// Method2 to write an Array
		
	// write an Array to store 4 String values
		
		//datatype[] name of array = new datatype[length]
		
		String [] arr1= new String[4];
		
		arr1[0]="Selenium";
		arr1[1]="training";
		arr1[2]="8PM";
		arr1[3]="H2k";
		
		System.out.println(arr1[0]);
		
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		
		// Method3 to write an array
		
		int [] arr2= {1,2,3,4,5,6,7,8};
		
		String [] arr3= {"A","B","C","D"};
		
		// datatype [] nameof arry= {"values to be stored"};
		
		// print the values
		
		System.out.println(arr3[2]);   // C
		
		// How can we print all the values
		
		for(int i=0; i<4;i++)
		{
			System.out.println(arr3[i]);
		}
		
	// Multi deminsional array	 : Array storing multiple sets of values
		
		int [][] arr4= {{1,2,3,4},{4,6,7,8},{43543,435456,456456}};
		
		
		String[] [] arr5= {{"sonal","mittal"},{"1","2","3"}};
		
		// Assignment - To print a multi dimensional array
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
