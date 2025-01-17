package aditya.verma.recursion;

import java.util.ArrayList;
import java.util.List;

public class SortArrayUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5, 4, 3, 2, 1 };
		List<Integer> input = new ArrayList<>();
		for (int num : nums) {
			input.add(num);
		}
		sort(input);
		System.out.println(input.toString());
	}

	static void sort(List<Integer> arr) {
		if (arr.size() == 1)
			return;
		int last = arr.get(arr.size() - 1);
		arr.remove(arr.size() - 1);
		sort(arr);
		insert(arr, last);
	}

	static void insert(List<Integer> arr, int element) {
		if (arr.size() == 0 || arr.get(arr.size() - 1) <= element) {
			arr.add(element);
			return;
		}

		int last = arr.get(arr.size() - 1);
		arr.remove(arr.size() - 1);
		insert(arr, element);
		arr.add(last);
	}

}
