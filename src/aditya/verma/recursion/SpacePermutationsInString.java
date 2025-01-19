package aditya.verma.recursion;

public class SpacePermutationsInString {

	public static void main(String[] args) {
		String ip = "abc";

		// at first, we have only 1 choice to only include the first char
		solve(ip.substring(1), ip.substring(0, 1));
	}

	static void solve(String ip, String op) {
		if (ip.length() == 0) {
			System.out.println(op);
			return;
		}

		String op1 = op + "_" + ip.substring(0, 1);
		String op2 = op + ip.substring(0, 1);
		ip = ip.substring(1);

		solve(ip, op1);
		solve(ip, op2);
	}

}
