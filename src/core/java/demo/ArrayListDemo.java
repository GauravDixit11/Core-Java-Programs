package core.java.demo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//data can be duplicate 
		//not sorted 
		//dynamic in nature
		ArrayList<String> al = new ArrayList<String>();
		al.add("Gaurav");
		al.add("Dixit");
        System.out.println(al);
        al.add(1, "Java");
        System.out.println(al);
        System.out.println(al.get(1));
        System.out.println(al.contains("testing"));
        System.out.println(al.contains("Java"));
        al.remove("Java");
        System.out.println(al);
	}

}
