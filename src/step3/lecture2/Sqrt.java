package step3.lecture2;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrt(24));
	}

	static int sqrt(int n) {
		int ans = 1;
		int low = 1;
		int high = n / 2;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int square = mid * mid;
			if (square > n)
				high = mid - 1;
			else {
				ans = mid;
				low = mid + 1;
			}
		}
		return ans;
	}

}
