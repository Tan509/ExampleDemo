package www.hashmap.com;

import java.util.HashMap;
import java.util.Map;

public class HashMap4 {

	public static void main(String[] args) {

		HashMap<Integer,String> map = new HashMap<Integer,String>();

		map.put(1,"Mango");
		map.put(2,"Apple");
		map.put(3,"Peru");
		map.put(4,"Banana");
		map.put(5,"Pineapple");

		System.out.println("Interating Hashmap");

		for(Map.Entry m : map.entrySet())

		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

		System.out.println("After removing Key");

		map.remove(3);

		for(Map.Entry m : map.entrySet())

		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

		System.out.println("After removing Value");

		map.remove(1,"Mango");

		for(Map.Entry m : map.entrySet())

		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	   
		
	}

}
