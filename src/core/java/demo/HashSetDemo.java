package core.java.demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		// No duplicate value
		// Data not sorted

		HashSet<String> hs = new HashSet<String>();
		hs.add("India");
		hs.add("India"); // Duplicate data
		hs.add("USA");
		hs.add("England");

		System.out.println(hs);
		System.out.println(hs.contains("India"));

		Iterator<String> i = hs.iterator();
		while (i.hasNext())  //checking next index has value
		{
			System.out.println(i.next()); //moving to next index
		}
		
		hs.remove("USA");
		System.out.println(hs);
		
		//Iterator<String> k = hs.iterator();
		//System.out.println(i.next());
		//System.out.println(i.next());
		
	}

}
