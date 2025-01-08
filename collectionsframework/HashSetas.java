package collectionsframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetas {
	public static void main(String[] args) {

		LinkedHashSet<Integer> set = new LinkedHashSet<>();
set.remove(1);
		set.add(1);
		set.add(2);

		set.add(3);
		set.add(4);
		
		if(set.contains(1))
			System.out.println("set contains 1 ");
		else
			System.out.println("set does not contins 1");
		
		// iterator
		Iterator it=set.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		
		System.out.println();
		
		set.remove(9);
		System.out.println(set);
		
		set .add(2);
		
		for(int  i :set) {
			System.out.println(i);
		}
	}
}
