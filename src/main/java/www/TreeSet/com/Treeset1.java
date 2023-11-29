package www.TreeSet.com;

import java.util.Iterator;
import java.util.TreeSet;



public class Treeset1 {

	public static void main(String[] args) {
		
		TreeSet<String> names = new TreeSet<String>();
		
		names.add("Tanvi");
		names.add("Kiyansh");
		names.add("Innaya");
		names.add("Ruhi");
		names.add("Aaradhya");
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Iterator<String> i = names.descendingIterator();
		
		System.out.println("List in desecneding manner: ");
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
