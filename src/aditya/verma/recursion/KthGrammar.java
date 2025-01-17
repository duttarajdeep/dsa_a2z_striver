package aditya.verma.recursion;

public class KthGrammar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve(2, 2));
	}

	static int solve(int n, int k) {
		if (n == 1 && k == 1)
			return 0;
		int mid = (int) ((Math.pow(2, n - 1)) / 2);
		if (k <= mid)
			return solve(n - 1, k);
		else
			return 1 - solve(n - 1, k - mid);
	}

}
