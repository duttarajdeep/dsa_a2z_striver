package step3.easy;

public class LongestSubArrayWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 10, 5, 2, 7, 1, 9 };
//		int[] nums = { 1, -1, 5, -2, 3 };
		int k = 15;
		System.out.println(lenOfLongestSubArrOpt(nums, k));

	}

	static int lenOfLongestSubarr(int[] arr, int k) {
		int length = 0;
		int maxLength = 0;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int j = i;
			while (j < arr.length) {
				sum += arr[j];
				if (sum == k) {
					length = j - i + 1;
					if (length > maxLength)
						maxLength = length;
				}
				j++;
			}
		}
		return maxLength;
	}

	static int lenOfLongestSubArrOpt(int[] arr, int k) {
		int left = 0;
		int right = 0;
		int sum = arr[0];
		int maxLen = 0;
		int n = arr.length;

		while (right < n) {
			while (left <= right && sum > k) {
				sum -= arr[left];
				left++;
			}
			if (sum == k)
				maxLen = Math.max(maxLen, right - left + 1);

			right++;
			if (right < n)
				sum += arr[right];
		}
		return maxLen;
	}

}
