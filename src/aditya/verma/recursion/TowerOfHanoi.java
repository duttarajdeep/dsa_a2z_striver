package aditya.verma.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 1, h = 2, d = 3;

		solve(s, d, h, 4);
	}

	static void solve(int s, int d, int h, int n) {
		if (n == 1) {
			System.out.println("Moving " + n + " plates from " + s + " to " + d);
			return;
		}

		// move n - 1 plates to helper
		solve(s, h, d, n - 1);

		// move nth plate to d
		System.out.println("Moving " + n + " plates from " + s + " to " + d);

		// move n - 1 plates from helper to d
		solve(h, d, s, n - 1);
	}

}
