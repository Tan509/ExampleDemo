package www.hashmap.com;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
	
	//No Duplicate Key on HashMap

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();

		map.put(1,"Mango");
		map.put(2,"Apple");
		map.put(3,"Peru");
		map.put(4,"Banana");
		map.put(5,"Pineapple");
		map.put(1,"Kiwi");

		System.out.println("Interating Hashmap");
		
		for(Map.Entry<Integer,String> m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
