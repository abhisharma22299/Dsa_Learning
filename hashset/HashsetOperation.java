package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetOperation {
	public static void main(String[] args) {
         //
		HashSet<Integer> set=new HashSet<>();
		// 
		set.add(1);
		set.add(2);
		set.add(1);

		
		System.out.println(set);
		// to print 
	for (Integer integer : set) {
		System.out.println(integer);
	}
//	System.out.println("8888888");
	Iterator it=set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	}
}
