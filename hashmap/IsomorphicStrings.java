package hashmap;
import java.util.*;
public class IsomorphicStrings {

	public static boolean str(String s,String t) {
		HashMap<Character,Character> map=new HashMap<>();
		for(int i=0;i<s.length()&&i<t.length();i++) {
		if(map.containsKey(s.charAt(i))) {
		char ch=map.get(s.charAt(i));
		if(!map.get(s.charAt(i)).equals(t.charAt(i))) {
			return false;
		}
		}
		else {
			if(map.containsValue(t.charAt(i))) {
				return false;
			}
			map.put(s.charAt(i), t.charAt(i));
		}		
	}
	return true;
	}
	
	public static void main(String[] args) {

		System.out.println(str("add","egg"));
	}

}
