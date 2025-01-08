package String;

public class RotateStringFindGoalPresent {

	private static void find(String s, String goal) {
	
		boolean result= s.length()==goal.length()&&(s+s).contains(goal);
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {

		String s="abcde";
		String goal="abced";
		find(s,goal);

	}

	
}
