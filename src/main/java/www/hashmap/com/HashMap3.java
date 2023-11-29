package www.hashmap.com;

import java.util.HashMap;
import java.util.Map;

public class HashMap3 {

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

			map.putIfAbsent(6, "Mango");
			
			System.out.println("After put if absent");
			
			for(Map.Entry m : map.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}

			
			HashMap<Integer,String> names = new HashMap<Integer,String>();
			
			names.put(21,"Tanvi");
			names.put(22,"Anvi");
			names.put(23, "Sanvi");
			
			names.putAll(map);
			
			System.out.println("after adding 1 map into another");
			
			for(Map.Entry<Integer,String> m : names.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
	}

}
