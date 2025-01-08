package collectionsframework;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMapCollection {
	public static void main(String[] args) {

		HashMap<String , Integer> map=new HashMap<>();
	
		map.put("China", 180);
		map.put("Inida", 170);
		map.put("Russia", 70);	
		map.put("Indonesia", 12);
		System.out.println(map);
		
		for (Map.Entry<String,Integer>  e  :map.entrySet()) {
			System.out.println(e.getKey()+" " + e.getValue());
		}
		
		map.remove("Indonesia");
		System.out.println(map);
	
	
	Set<String> st=map.keySet();
	for(String key :st) 
		System.out.println(key+" "+map.get(key));
	
	if(map.containsKey("China")) {
			
		System.out.println(map);
	}
	
	
	}
	
	
	
	
	
}
