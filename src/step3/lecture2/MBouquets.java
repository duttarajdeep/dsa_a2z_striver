package step3.lecture2;

public class MBouquets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 7, 7, 7, 7, 12, 7, 7 };
		System.out.println(minDays(nums, 2, 3));

	}

	static int minDays(int[] bloomDay, int m, int k) {
		if ((long) m * k > (long) bloomDay.length)
			return -1;

		int low = 1;
		int high = findMax(bloomDay);

		while (low <= high) {
			int mid = low + (high - low) / 2;
			int noOfBouq = calculateNoOfBouq(bloomDay, mid, k);
			if (noOfBouq >= m) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

	static int calculateNoOfBouq(int[] bloomDay, int wait, int k) {
		int noOfBouq = 0;
		int bloomedFlowers = 0;
		for (int i = 0; i < bloomDay.length; i++) {
			if (bloomDay[i] <= wait) {
				bloomedFlowers++;
				if (bloomedFlowers == k) {
					noOfBouq++;
					bloomedFlowers = 0;
				}
			} else
				bloomedFlowers = 0;
		}
		return noOfBouq;
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
