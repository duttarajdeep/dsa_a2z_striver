package step7.lecture2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		List<List<Integer>> ans = combinationSum2(candidates, target);
		System.out.println(ans.toString());

	}

	static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> ans = new ArrayList<>();
		solve(candidates, 0, target, new ArrayList<>(), ans);
		return ans;
	}

	static void solve(int[] ip, int idx, int target, List<Integer> temp, List<List<Integer>> ans) {
		if (target == 0) {
			ans.add(temp);
			return;
		}

		for (int i = idx; i < ip.length; i++) {
			if (i > idx && ip[i] == ip[i - 1])
				continue;
			if (ip[i] > target)
				break;

			temp.add(ip[i]);
			solve(ip, idx + 1, target, temp, ans);
			temp.remove(temp.size() - 1);
		}
	}

}
