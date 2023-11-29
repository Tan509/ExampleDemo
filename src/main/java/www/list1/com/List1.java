package www.list1.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
	
		List<String> names = new ArrayList<String>();
		
		names.add("Tanvi");
		names.add("Kiyansh");
		names.add("Rupali");
		
		Iterator itr = names.iterator();
		
		System.out.println("index: "+ itr);
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
			
		}
		
		
		

	}

}
