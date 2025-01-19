package aditya.verma.recursion;

public class PermutationWithCaseChange {

	public static void main(String[] args) {
		String ip = "ab";
		solve(ip, "");
	}

	static void solve(String ip, String op) {
		if (ip.length() == 0) {
			System.out.println(op);
			return;
		}

		String op1 = op + ip.substring(0, 1);
		String op2 = op + ip.substring(0, 1).toUpperCase();

		ip = ip.substring(1);

		solve(ip, op1);
		solve(ip, op2);
	}

}
