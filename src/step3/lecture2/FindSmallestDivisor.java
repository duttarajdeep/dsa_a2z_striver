package step3.lecture2;

public class FindSmallestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 5, 9 };
		System.out.println(smallestDivisor(nums, 6));

	}

	static int smallestDivisor(int[] nums, int threshold) {
		int low = 1;
		int high = findMax(nums);
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int sumByD = sumByDivision(nums, mid);
			if (sumByD <= threshold) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}

	static int sumByDivision(int[] nums, int d) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += (int) Math.ceil((double) nums[i] / d);
		}
		return sum;
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
