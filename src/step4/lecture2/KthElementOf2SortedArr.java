package step4.lecture2;

public class KthElementOf2SortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 3, 6, 7, 9 };
		int[] b = { 1, 4, 8, 10 };
		System.out.println(kthElement(a, b, 5));

	}

	static int kthElement(int[] a, int[] b, int k) {
		int n1 = a.length;
		int n2 = b.length;

		if (n1 > n2)
			return kthElement(b, a, k);

		int low = Math.max(0, k - n2), high = Math.min(k, n1);

		while (low <= high) {
			int m1 = low + (high - low) / 2;
			int m2 = k - m1;

			int l1 = m1 == 0 ? Integer.MIN_VALUE : a[m1 - 1];
			int l2 = m2 == 0 ? Integer.MIN_VALUE : b[m2 - 1];
			int r1 = m1 == n1 ? Integer.MAX_VALUE : a[m1];
			int r2 = m2 == n2 ? Integer.MAX_VALUE : b[m2];

			// reducing search spaces
			if (l1 <= r2 && l2 <= r1) {
				return Math.max(l1, l2);
			} else if (l1 > r2)
				high = m1 - 1;
			else
				low = m1 + 1;
		}
		return 0;
	}

}
