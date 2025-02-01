package step7.lecture2;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

	public static void main(String[] args) {
		List<List<Integer>> ans = combinationSum3(3, 7);
		System.out.println(ans.toString());
	}

	static List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> ans = new ArrayList<>();
		solve(0, new ArrayList<>(), ans, k, n);
		return ans;
	}

	static void solve(int idx, List<Integer> temp, List<List<Integer>> ans, int k, int target) {
		if (idx == k) {
			if (target == 0) {
				ans.add(new ArrayList<>(temp));
				return;
			}
		}

		for (int i = 1; i <= 9; i++) {
			if (temp.contains(i))
				continue;
			temp.add(i);
			solve(i + 1, temp, ans, k, target - i);
			temp.remove(temp.size() - 1);
		}

	}

}
