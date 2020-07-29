package collectionsFramwork;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array: stores same set of multiple data
		
// collections: group of objects
	// it is also a framework	
	//	We use it to store the data, manipulate, delete , sort
		
// Example: webpage ---> dropdowns(static, dynamic), tables		
	
		// Arrays are fixed in size
		
		// Collection are used as they can grow dynamically
		// you can increase the size or decrease the size of the collection of data
	
	//ArrayList()	
		
	// its a class whichis used to store data or list of values	, the list can grow dynamically
		
	// when we are declaring an array list, we have also give the type of data that we are going to store	
		
		ArrayList<String> list= new ArrayList<String>();
		
		ArrayList<Integer> list1= new ArrayList<Integer>();
		
	// How to add values to an arraylist
		
		
		list.add("300");   // index =0
		list.add("selenium"); // index=1
		list.add("true");  // index=2
		list.add("data");  //index=3
		
		// all the above values are stored in arrayList
	// we want to fetch the values from the array list	
	// get() method is sued to fetch the values from an arraylist
		
		System.out.println(list.get(1));
		
		
		//length() -- array
		//size() -- arraylist

		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		// for each loop
		
		for(String i: list)
		{
			System.out.println(i);
		}
		
		
		Iterator itr =list.iterator();
		
		// hasNext() -- is used to go to array list and check if the list has next value inside it or not
		// next()
		
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
