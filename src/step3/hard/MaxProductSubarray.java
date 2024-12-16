package step3.hard;

public class MaxProductSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = { 2, 3, -2, 4 };
		int[] nums = { -2, 0, -1 };
//		int[] nums = { 0, 2 };
		System.out.println(maxProductOpt(nums));

	}

	static int maxProduct(int[] nums) {
		int maxProduct = nums[0];
		for (int i = 0; i < nums.length; i++) {
			int currentProduct = nums[i];
			maxProduct = Math.max(maxProduct, currentProduct);
			for (int j = i + 1; j < nums.length; j++) {
				currentProduct *= nums[j];
				maxProduct = Math.max(maxProduct, currentProduct);
			}
		}
		return maxProduct;
	}

	static int maxProductOpt(int[] nums) {
		int pre = 1; // prefix product
		int suff = 1; // suffix product
		int max = Integer.MIN_VALUE; // max product
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			if (pre == 0)
				pre = 1;
			if (suff == 0)
				suff = 1;

			pre *= nums[i];
			suff *= nums[n - i - 1];

			max = Math.max(max, Math.max(pre, suff));
		}

		return max;

	}

}
