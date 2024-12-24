package step3.lecture2;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static double findMedianSortedArrays(int[] a, int[] b) {
		int n1 = a.length;
		int n2 = b.length;
		if (n1 > n2)
			return findMedianSortedArrays(b, a);
		int low = 0, high = n1;
		int left = (n1 + n2 + 1) / 2;
		int n = n1 + n2;
		while (low <= high) {
			int m1 = low + (high - low) / 2;
			int m2 = left - m1;
			int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
			int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

			if (m1 < n1)
				r1 = a[m1];
			if (m2 < n2)
				r2 = b[m2];

			if (m1 - 1 >= 0)
				l1 = a[m1 - 1];
			if (m2 - 1 >= 0)
				l2 = b[m2 - 1];

			if (l1 <= r2 && l2 <= r1) {
				if (n % 2 == 1)
					return (double) Math.max(l1, l2);
				else
					return (double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
			} else if (l1 > r2)
				high = m1 - 1;
			else
				low = m1 + 1;
		}
		return 0.0;
	}

}
