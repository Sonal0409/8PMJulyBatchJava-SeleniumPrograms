package collectionsFramwork;

import java.util.ArrayList;
import java.util.Iterator;

public class  ArrayListDemo {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		//Collections -> multiple of Interface and Classes
		// it is group objects
		// when we want to fetch data, delete data, sort data, storing data
		
		// Array List Demo
		
		// it is used to store dynamin data and the size of array is not fixed, it can grow
		
		// Creation of ArrayList
		
		// import ArrayList class from java.util package
		ArrayList arr1= new ArrayList ();
		
		// using the object arr1, we can add data into the array
		// we use method called add()
		// each data in arraylist is stored at an sequential index
		arr1.add(10);  // index 0=10
		arr1.add(200); // index 1= 200
		arr1.add(500);
		arr1.add("Selenium");
		arr1.add(2.34);
		arr1.add(true);
		arr1.add(false);
		
		// size() is the method used to find total values or length of the arrayList
		
		System.out.println(arr1.size());
		// printing the data of an array list
		
		System.out.println(arr1);
		
		//for(int i=0; i<arr1.size();i++)
		//{
		//	System.out.println(arr1.get(i));
		
	//	}
		
		
		// printing values using iterator() method
		
		
	Iterator itr =arr1.iterator();
		// hasNext() -- is used to go to array list and check if the list has next value inside it or not
		
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
		
		//generic and non generic
		
		ArrayList<String> arr2= new ArrayList<String>();
		
		arr2.add("selenium");
		
		arr2.add("Testing");
		
		ArrayList<Integer> arr= new ArrayList<Integer>();
		
		arr.add(50);
		arr.add(60);
		arr.add(70);
		
		ArrayList<Integer> arr3= new ArrayList<Integer>();
		
		arr3.add(2);  // add the value to list
		
		
		arr3.add(1, 200); // add value to index 1 of the list
		
		arr3.add(2, 500);
		
		arr3.addAll(arr);  // add all the list of values from arr to arr3
		
		for(int i=0; i<arr3.size();i++)
				{
					System.out.println(arr3.get(i));
				
				}
		
		arr3.remove(0);  // remove values from index 0
		
		
		
		for(int i=0; i<arr3.size();i++)
		{
			System.out.println(arr3.get(i));
		
		}
		
		/*Integer b1= arr3.remove(2);// have we removed the object 2 from the list or not.It will return a boolean value
		
		arr3.rem
		System.out.println(b1);*/
		
		arr3.removeAll(arr);  // remove all the values of list arr from arr3
		
		
		
		
	}

}
