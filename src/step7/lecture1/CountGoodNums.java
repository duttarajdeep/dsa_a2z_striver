package step7.lecture1;

public class CountGoodNums {

	private static int MOD = 1_000_000_007;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countGoodNums(5));

	}

	static int countGoodNums(long n) {
		long even = (n + 1) / 2;
		long odd = n / 2;
		long first = pow(5, even) % MOD;
		long second = pow(4, odd) % MOD;
		return (int) ((first * second) % MOD);
	}

	static long pow(long x, long n) {
		long ans = 1;
		while (n > 0) {
			if (n % 2 == 1) {
				ans = (ans * x) % MOD;
				n = n - 1;
			} else {
				x = (x * x) % MOD;
				n = n / 2;
			}
		}
		return ans;
	}

}
