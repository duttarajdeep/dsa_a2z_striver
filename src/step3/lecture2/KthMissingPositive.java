package step3.lecture2;

public class KthMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 4, 7, 11 };
		System.out.println(findKthPositiveOpt(nums, 5));

	}

	public int findKthPositive(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= k)
				k++;
			else
				break;
		}
		return k;
	}

	// O(log(n)) solution
	static int findKthPositiveOpt(int[] arr, int k) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			int missing = arr[mid] - (mid + 1);
			if (missing < k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return low + k;
	}

}
