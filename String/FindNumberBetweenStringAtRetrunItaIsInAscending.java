package String;

public class FindNumberBetweenStringAtRetrunItaIsInAscending {
	public static boolean find(String s) {
		int prev = 0;
		String[] str = s.split(" ");

		for (int i = 0; i < str.length; i++) {
			try {
				int next = Integer.parseInt(str[i]);
				System.out.println(next);

				if (prev > next)
					return false;

				prev = next;
			}

			catch (Exception e) {
			}

		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(find("abhishek 6 sharma 2 ashdsal 3 "));

	}
}
