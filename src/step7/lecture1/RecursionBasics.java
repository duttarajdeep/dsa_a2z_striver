package step7.lecture1;

public class RecursionBasics {

	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printName("Raj");
//		printSequence(5);
//		System.out.println();
//		printSequenceReverse(7);
//		System.out.println();
//		System.out.println(sumOf1stN(3));

		System.out.println(myPow(2.00000, -2147483648));

	}

	static void printName(String name) {
		if (count > 4)
			return;
		System.out.println(name);
		count++;
		printName(name);
	}

	static void printSequence(int n) {
		if (n == 0)
			return;
		printSequence(n - 1);
		System.out.print(n + " ");
	}

	static void printSequenceReverse(int n) {
		if (n == 0)
			return;
		System.out.print(n + " ");
		printSequenceReverse(n - 1);
	}

	static int sumOf1stN(int n) {
		if (n == 1)
			return 1;
		return n + sumOf1stN(n - 1);
	}

	static double myPow(double x, int n) {
		double ans = 1;
		int m = n;
		long nn = n;
		if (x == 0 || x == 1)
			return x;
		if (nn < 0)
			nn = -1 * nn;

		while (nn > 0) {
			if (nn % 2 == 1) {
				ans = ans * x;
				nn = nn - 1;
			} else {
				x = x * x;
				nn = nn / 2;
			}
		}

		if (m < 0)
			return (1.0 / ans);
		else
			return ans;
	}

}
