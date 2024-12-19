package step4.lecture1;

public class SingleElementInSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 2, 2, 3, 4, 4, 8, 8 };
		System.out.println(singleNonDuplicate(nums));

	}

	static int singleNonDuplicate(int[] nums) {
		int n = nums.length;
		int low = 0;
		int high = n - 1;

		// special cases
		if (nums.length == 1)
			return nums[0];
		if (nums[0] != nums[1])
			return nums[0];
		if (nums[n - 1] != nums[n - 2])
			return nums[n - 1];

		// remove 1st and last elements from search space, to simplify the code
		low++;
		high--;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
				return nums[mid];

			if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
				// we are on the left side of single element, so move search space to the right
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}
