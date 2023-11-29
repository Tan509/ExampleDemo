package www.TreeSet.com;

import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<String>();

		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		
		System.out.println("original List: "+ set);
		
		System.out.println("Reverse set: "+ set.descendingSet());
		
		System.out.println("HeadSet: " + set.headSet("C", true));
		
		System.out.println("Subset " + set.subSet("B", true, "E", false));
		
		System.out.println("Tail Set " + set.tailSet("C", true));
	}

}
