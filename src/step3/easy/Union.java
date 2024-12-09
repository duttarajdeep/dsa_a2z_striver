package step3.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Union {

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 1 };
		int[] b = { 2, 2 };
		System.out.println(Arrays.toString(union(a, b)));
	}

	static int[] union(int[] a, int[] b) {
		ArrayList<Integer> union = new ArrayList<>();
		int i = 0, j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] <= b[j]) {
				if (union.isEmpty() || union.get(union.size() - 1) != a[i]) {
					union.add(a[i]);
				}
				i++;
			} else {
				if (union.isEmpty() || union.get(union.size() - 1) != b[j])
					union.add(b[j]);
				j++;
			}
		}

		while (i < a.length) {
			if (union.get(union.size() - 1) != a[i]) {
				union.add(a[i]);
			}
			i++;
		}

		while (j < b.length) {
			if (union.get(union.size() - 1) != b[j])
				union.add(b[j]);
			j++;
		}

		return union.stream().mapToInt(Integer::intValue).toArray();
	}

}
