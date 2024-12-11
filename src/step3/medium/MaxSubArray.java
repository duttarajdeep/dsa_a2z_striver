package step3.medium;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -2, 1, -3, -1 };
		System.out.println(maxSubArray(nums));

	}

	static int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int currentSum = 0;

		for (int i : nums) {
			currentSum += i;
			if (currentSum > maxSum)
				maxSum = currentSum;
			if (currentSum < 0)
				currentSum = 0;
		}

		return maxSum;
	}

}
