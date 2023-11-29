package www.hash.com;

import java.util.HashSet;
import java.util.Iterator;



public class HashSet1 {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("three");
		set.add(null);
		set.add("five");


		Iterator itr = set.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		set.remove("four");

		System.out.println("After remove: "+ set);

		HashSet<String> set1 = new HashSet<String>();

		set1.add("Tanvi");
		set1.add("Ridhima");
		
		System.out.println("New List: "+ set1);
		
		set.addAll(set1);
		
		System.out.println("2nd list added in first: "+ set);
		
		set.removeAll(set1);
		
		System.out.println("2nd list remove in first: "+ set);
		
		
		




	}

}
