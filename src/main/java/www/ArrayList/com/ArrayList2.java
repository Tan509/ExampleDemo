package www.ArrayList.com;

//using Iterator to traverse

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Apple");
		list.add("Mango");
		list.add("Strawberry");
		list.add("Banana");
		list.add("Chickoo");

		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
