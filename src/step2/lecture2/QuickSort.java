package step2.lecture2;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 6, 2, 5, 7, 9, 1, 3 };
		sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void sort(int[] nums) {
		quickSort(nums, 0, nums.length - 1);
	}

	static void quickSort(int[] nums, int low, int high) {
		if (low >= high) {
			return; // Base case: single element or invalid range
		}

		int pivot = partition(nums, low, high);

		// Sort left and right sub-arrays
		quickSort(nums, low, pivot - 1);
		quickSort(nums, pivot + 1, high);
	}

	static int partition(int[] nums, int low, int high) {
		int pivot = nums[low]; // Choose pivot as the first element
		int i = low + 1; // Pointer for elements greater than pivot
		int j = high; // Pointer for elements less than pivot

		while (i <= j) {
			while (i <= high && nums[i] <= pivot) {
				i++; // Move right for elements <= pivot
			}
			while (j >= low && nums[j] > pivot) {
				j--; // Move left for elements > pivot
			}
			if (i < j) {
				swap(nums, i, j); // Swap out-of-place elements
			}
		}

		// Swap the pivot element with the element at `j`
		swap(nums, low, j);
		return j; // Return the final position of the pivot
	}

	static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
