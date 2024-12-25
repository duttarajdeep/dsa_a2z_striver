package step3.lecture2;

import java.util.Arrays;

public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] stalls = { 0, 3, 4, 7, 10, 9 };
		int[] stalls = { 4, 2, 1, 3, 6 };
		System.out.println(aggressiveCows(stalls, 2));

	}

	static int aggressiveCows(int[] stalls, int k) {
		Arrays.sort(stalls);
		int n = stalls.length;
		int low = 1;
		int high = stalls[n - 1] - stalls[0];

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (canPlaceCow(stalls, mid, k)) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return high;
	}

	static boolean canPlaceCow(int[] stalls, int dist, int cows) {
		int cp = 1; // cows placed
		int lpIdx = stalls[0]; // last placed index
		for (int i = 1; i < stalls.length; i++) {
			if (stalls[i] - lpIdx >= dist) {
				cp++;
				lpIdx = stalls[i];
			}
			if (cp == cows)
				return true;
		}
		return false;
	}

}
