package step7.lecture2;

import java.util.ArrayList;
import java.util.Arrays;

public class RatInAMazeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
		mat.add(new ArrayList<>(Arrays.asList(1, 0, 0, 0)));
		mat.add(new ArrayList<>(Arrays.asList(1, 1, 0, 1)));
		mat.add(new ArrayList<>(Arrays.asList(1, 1, 0, 0)));
		mat.add(new ArrayList<>(Arrays.asList(0, 1, 1, 1)));

		ArrayList<String> ans = findPath(mat);
		System.out.println(ans.toString());

	}

	static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
		ArrayList<String> ans = new ArrayList<>();
		int n = mat.size();
		boolean[][] vis = new boolean[n][n];
		for (boolean[] row : vis) {
			Arrays.fill(row, false);
		}
		solve(0, 0, n, mat, ans, vis, "");
		return ans;
	}

	static void solve(int r, int c, int n, ArrayList<ArrayList<Integer>> mat, ArrayList<String> ans, boolean[][] vis,
			String path) {
		if (r == n - 1 && c == n - 1) {
			ans.add(path);
			return;
		}

		// go down - r + 1, c
		if (r + 1 < n && !vis[r + 1][c] && mat.get(r + 1).get(c) == 1) {
			vis[r][c] = true;
			solve(r + 1, c, n, mat, ans, vis, path + 'D');
			vis[r][c] = false;
		}

		// go left
		if (c - 1 >= 0 && !vis[r][c - 1] && mat.get(r).get(c - 1) == 1) {
			vis[r][c] = true;
			solve(r, c - 1, n, mat, ans, vis, path + 'L');
			vis[r][c] = false;
		}

		// go right
		if (c + 1 < n && !vis[r][c + 1] && mat.get(r).get(c + 1) == 1) {
			vis[r][c] = true;
			solve(r, c + 1, n, mat, ans, vis, path + 'R');
			vis[r][c] = false;
		}

		// go up
		if (r - 1 >= 0 && !vis[r - 1][c] && mat.get(r - 1).get(c) == 1) {
			vis[r][c] = true;
			solve(r - 1, c, n, mat, ans, vis, path + 'U');
			vis[r][c] = false;
		}

	}

}
