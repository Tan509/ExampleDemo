package www.TreeSet.com;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {

		TreeSet<Integer> num = new TreeSet<Integer>();

		num.add(15);
		num.add(27);
		num.add(01);
		num.add(99);
		num.add(34);

		System.out.println("smallest num from list: " + num.pollFirst());

		System.out.println(num);


		System.out.println("Larger num from list: "+ num.pollLast());
		System.out.println(num);
	}

}
