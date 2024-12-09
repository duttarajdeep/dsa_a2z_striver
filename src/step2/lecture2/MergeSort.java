package step2.lecture2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5, 4, 3, 2, 1 };
		sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void sort(int[] nums) {
		mergeSort(nums, 0, nums.length - 1);
	}

	static void mergeSort(int[] nums, int low, int high) {
		if (low >= high)
			return;
		int mid = low + (high - low) / 2;
		mergeSort(nums, low, mid);
		mergeSort(nums, mid + 1, high);
		merge(nums, low, mid, high);

	}

	static void merge(int[] nums, int low, int mid, int high) {
		List<Integer> temp = new ArrayList<>();
		int left = low, right = mid + 1;
		while (left <= mid && right <= high) {
			if (nums[left] < nums[right]) {
				temp.add(nums[left]);
				left++;
			} else {
				temp.add(nums[right]);
				right++;
			}
		}

		while (left <= mid) {
			temp.add(nums[left]);
			left++;
		}

		while (right <= high) {
			temp.add(nums[right]);
			right++;
		}

		for (int i = low; i <= high; i++) {
			nums[i] = temp.get(i-low);
		}

	}

}
