package step3.lecture2;

/**
 * Problem Statement: Given two numbers N and M, find the Nth root of M. The nth
 * root of a number M is defined as a number X when raised to the power N equals
 * M. If the 'nth root is not an integer, return -1.
 */

public class NthRoot {

	public static void main(String[] args) {
		System.out.println(nthRootM(64, 2));
	}

	static int nthRootM(int m, int n) {
		int low = 1;
		int high = m;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int currentAns = (int) Math.pow(mid, n);
			if (currentAns == m) {
				return mid;
			} else if (currentAns > m) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
