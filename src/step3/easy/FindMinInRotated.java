package step3.easy;

public class FindMinInRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 5, 6, 7, 0, 1, 2, 3 };
//		int[] nums = { 3, 1, 2 };
		System.out.println(findMin(nums));

	}

	static int findMin(int[] nums) {
		/**
		 * [ 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 0, 1, 2, 3 ]
		 * 
		 */
		int min = Integer.MIN_VALUE;
		int low = 0;
		int high = nums.length - 1;

		while (low < high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] > nums[high])
				low = mid + 1;
			else {
				min = nums[mid];
				high = mid;
			}
		}

		return min;
	}

}
