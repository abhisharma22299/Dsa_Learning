package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperation {

	public static void main(String[] args) {
// key value 

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Aman");
		map.put(2, "India");
		map.put(3, "chaman");
		// update the value if we insert the same key
		System.out.println(map.get(1));

		System.out.println();
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}

	}
}
