package step7.lecture2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSumsI {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1 };
		List<Integer> subsetSums = subsetSums(arr);
		System.out.println(subsetSums.toString());

	}

	static List<Integer> subsetSums(int[] arr) {
		List<Integer> op = new ArrayList<>();
		solve(0, 0, arr, op);
		Collections.sort(op);
		return op;
	}

	static void solve(int i, int sum, int[] ip, List<Integer> op) {

		if (i == ip.length) {
			op.add(sum);
			return;
		}

		solve(i + 1, sum + ip[i], ip, op);

		solve(i + 1, sum, ip, op);

	}

}
