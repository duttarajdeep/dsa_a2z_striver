package step3.lecture2;

public class KokoEatingBananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 805306368, 805306368, 805306368 };
		System.out.println(minEatingSpeed(nums, 1000000000));
	}

	static int minEatingSpeed(int[] piles, int h) {
		int low = 1;
		int high = findMax(piles);

		while (low <= high) {
			int mid = low + (high - low) / 2;
			int eatingTime = calculateEatingTime(piles, mid);
			if (eatingTime > h) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}

	static int calculateEatingTime(int[] piles, int k) {
		int eatingTime = 0;
		for (int p : piles) {
			eatingTime += (Math.ceil((double) p / k));
		}
		return eatingTime;
	}

	static int findMax(int[] nums) {
		int max = nums[0];
		for (int n : nums) {
			if (n > max)
				max = n;
		}
		return max;
	}

}
