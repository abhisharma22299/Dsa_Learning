package GuestInvitationProblem;

public class WaysToCallAGuest {
	public static int waysToCallAGuest(int n) {
		if (n <= 1)
		{
			return 1;
		}
		
		
		int single = waysToCallAGuest(n - 1);
		int pair = (n - 1) * waysToCallAGuest(n - 2);

		return single + pair;
	}

	public static void main(String[] args) {
		System.out.println(waysToCallAGuest(4));
	}
}
