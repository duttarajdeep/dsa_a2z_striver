package step7.lecture2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	public boolean wordBreak(String s, List<String> wordDict) {
		int[][] memo = new int[s.length()][s.length()];
		for (int[] i : memo)
			Arrays.fill(i, -1);
		return solve(0, 0, s, new HashSet<String>(wordDict), memo);
	}

	public boolean solve(int start, int end, String s, Set<String> wd, int[][] memo) {
		if (memo[start][end] != -1)
			return memo[start][end] == 1 ? true : false;

		if (end == s.length() - 1) {
			if (wd.contains(s.substring(start, end + 1)))
				return true;
			return false;
		}

		if (wd.contains(s.substring(start, end + 1)))
			if (solve(end + 1, end + 1, s, wd, memo)) {
				memo[start][end] = 1;
				return true;
			}

		boolean ans = solve(start, end + 1, s, wd, memo);
		memo[start][end] = ans ? 1 : 0;
		return ans;
	}

}
