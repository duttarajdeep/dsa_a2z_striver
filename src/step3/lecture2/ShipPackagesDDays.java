package step3.lecture2;

public class ShipPackagesDDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(shipWithinDays(nums, 5));

	}

	static int shipWithinDays(int[] weights, int days) {
		int low = findMax(weights);
		int high = findSum(weights);
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int daysTaken = calculateDays(weights, mid);
			if (daysTaken <= days)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}

	static int findMax(int[] nums) {
		int max = nums[0];
		for (int n : nums) {
			if (n > max)
				max = n;
		}
		return max;
	}

	static int findSum(int[] weights) {
		int sum = 0;
		for (int w : weights) {
			sum += w;
		}
		return sum;
	}

	static int calculateDays(int[] weights, int capacity) {
		int days = 1;
		int load = 0;
		for (int i = 0; i < weights.length; i++) {
			if (load + weights[i] > capacity) {
				days = days + 1;
				load = weights[i];
			} else {
				load += weights[i];
			}
		}
		return days;
	}

}
