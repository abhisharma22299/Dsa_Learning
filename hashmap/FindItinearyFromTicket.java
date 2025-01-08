package hashmap;

import java.util.HashMap;
import java.util.Map;

public class FindItinearyFromTicket {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Chennai", "Bengaluru");
		map.put("Mumbai", "Delhi");
		map.put("Goa", "Chennai");
		map.put("Delhi", "Goa");

		String str = "";

		HashMap<String, String> rev = new HashMap<>();
		for (Map.Entry<String, String> e : map.entrySet()) {
			String temp1 = e.getKey();
			String temp2 = e.getValue();
			rev.put(temp2, temp1);

		}
		System.out.println(rev);

		for (String key : map.keySet()) {
			if (!map.containsKey(rev.containsKey(key))) {
				str = key;
			}
		}

		while (map.containsKey(str)) {
			System.out.print(str + "->");

			str = map.get(str);
		}
		System.out.println(str);

	}
}
