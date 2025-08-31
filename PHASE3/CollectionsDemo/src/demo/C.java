package demo;

import java.util.ArrayList;
import java.util.List;

public class C {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		//Create a sample list
		List<String> list = new ArrayList<>();
		
		//Add some elements to the list
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		// let's add one more element
		list.add("F");
		
		// let's add another
		list.add("G");
		
		//Iterate the list demo
		for (String s : list) {
			System.out.println(s);
		}
		

	}

}
