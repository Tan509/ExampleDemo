package www.ArrayList.com;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Apple");
		list.add("Mango");
		list.add("Apple");
		list.add("Strawberry");
		list.add("Banana");
		list.add("Chickoo");
		
		for(String fruits: list)
		{
			System.out.println(fruits);
		}
		
		System.out.println("3rd position fruit name is:"+list.get(3));
		
		list.set(0, "Papaya");
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("Sorted List" + list);
		
		list.remove(3);
		
		System.out.println("List after removing: "+ list);
		
		list.remove("Apple");
		
		System.out.println("List after removing: "+ list);
	}

}
