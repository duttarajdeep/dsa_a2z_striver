package step3.lecture2;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 7, 2, 5, 10, 8 };
		System.out.println(splitArray(nums, 2));

	}

	static int splitArray(int[] nums, int k) {
		int low = max(nums);
		int high = sum(nums);
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int splits = calcSplits(nums, mid);
			if (splits > k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low;
	}

	static int calcSplits(int[] nums, int maxSum) {
		int splits = 1;
		int subArraySum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (subArraySum + nums[i] <= maxSum)
				subArraySum += nums[i];
			else {
				splits++;
				subArraySum = nums[i];
			}
		}
		return splits;
	}

	static int max(int[] nums) {
		int max = 0;
		for (int n : nums) {
			if (n > max)
				max = n;
		}
		return max;
	}

	static int sum(int[] nums) {
		int sum = 0;
		for (int n : nums) {
			sum += n;
		}
		return sum;
	}

}
