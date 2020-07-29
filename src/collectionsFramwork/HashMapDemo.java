package collectionsFramwork;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer, String> hmap= new HashMap<Integer, String>();
		// we want to store data in the form of key and value
		hmap.put(106, "abcd");
		hmap.put(101, "Kenny");
		hmap.put(102, "John");
		hmap.put(103, "Mark");
		hmap.put(105, "Sally");
		
		System.out.println(hmap.get(101));  // fetch the value of key 101 --Kenny
		System.out.println(hmap.get(106));  //Sally
	
		System.out.println(hmap);
		hmap.put(101, "Sonal");
		System.out.println(hmap.get(101)); 
		System.out.println(hmap);
	
	// for-each loop to fetch the values from HashMap
	// for(datatype counter : listname)
	//{
		
	//}
	// keySet() method will fetch the set of keys for that particular hashmap
	
	System.out.println("printing values using for-each loop");
	
	for(Integer temp : hmap.keySet())
	{
		
		System.out.println(temp);   // fetch all the keys of the hmap
		System.out.println(hmap.get(temp));/// fetch values of the key
	}
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	}

}
