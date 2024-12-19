package step4.lecture1;

public class FindPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 1, 3, 5, 6, 4 };
		System.out.println(findPeakElement(nums));

	}

	static int findPeakElement(int[] nums) {
		int n = nums.length;
		if (n == 1)
			return 0;

		if (nums[0] > nums[1])
			return 0;

		if (nums[n - 1] > nums[n - 2])
			return n - 1;

		int low = 1;
		int high = nums.length - 2;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
				return mid;
			else if (nums[mid] > nums[mid - 1])
				low = mid + 1;
			else
				high = mid - 1;

		}
		return -1;
	}

}
