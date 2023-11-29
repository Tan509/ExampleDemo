package www.ArrayList.com;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {



		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("Apple");
		list1.add("Mango");
		list1.add("Strawberry");
		list1.add("Banana");
		list1.add("Chickoo");

		System.out.println("List1: " + list1);
		
		ArrayList<String> list2 = new ArrayList<String>();

		list2.add("Onion");
		list2.add("Tomato");
		list2.add("Potato");
		
		System.out.println("Size: "+ list1.size());
		

		System.out.println("List2:"+ list2);
		
		list1.addAll(list2);
		
		System.out.println("newly added list: " + list1 );
		
		list1.retainAll(list2);
		
		System.out.println("newly retained list: " + list1 );
		
		System.out.println("list after is empty: " + list1.isEmpty());
		
		 list1.removeAll(list2);
		  
		  System.out.println("newly removed list: " + list1 );
		 
		

		System.out.println("list after is empty: " + list1.isEmpty());
		
		
		

	}

}
