package step9.lecture4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));

	}

	static int[] maxSlidingWindow(int[] nums, int k) {
		int n = nums.length;
		Deque<Integer> dQ = new ArrayDeque<>();
		List<Integer> ans = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (!dQ.isEmpty() && dQ.getFirst() <= i - k)
				dQ.removeFirst();
			while (!dQ.isEmpty() && nums[dQ.getFirst()] <= nums[i])
				dQ.removeLast();
			dQ.addLast(i);
			if (i >= k - 1)
				ans.add(nums[dQ.getFirst()]);
		}

		return ans.stream().mapToInt(Integer::intValue).toArray();
	}

}
