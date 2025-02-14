package step12.lecture1;

import java.util.Arrays;

public class AssignCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] g = { 1, 2 }; // greed
		int[] s = { 1, 2, 3 }; // size of cookie
		System.out.println(findContentChildren(g, s));

	}

	static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);

		int l = 0, r = 0;

		while (l < s.length) {
			if (g[r] <= s[l])
				r++;
			l++;
		}

		return r;
	}

}
