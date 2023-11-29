package www.hashmap.com;

import java.util.HashMap;
import java.util.Map;

public class HashMap5 {

	public static void main(String[] args) {
	

		HashMap<Integer,String> map = new HashMap<Integer,String>();

		map.put(1,"Mango");
		map.put(2,"Apple");
		map.put(3,"Peru");
		map.put(4,"Banana");
		map.put(5,"Pineapple");
		
		System.out.println("Key set"+ map.keySet());
		
		System.out.println("Value Set: "+ map.values());
		
		System.out.println("Key value set: "+ map.entrySet());
		
		

		System.out.println("Interating Hashmap");

		for(Map.Entry m : map.entrySet())

		{
			System.out.println(m.getKey()+" "+m.getValue());
		}


		map.replace(2, "Jamun");
		
		System.out.println("After Replace");

		for(Map.Entry m : map.entrySet())

		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

		map.replace(3, "Peru", "Papaya");
		
		System.out.println("After Replace");

		for(Map.Entry m : map.entrySet())

		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
