package step3.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OverlappingIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		merge(intervals);

	}

	static int[][] merge(int[][] intervals) {

		Arrays.sort(intervals, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});

		List<int[]> outputArr = new ArrayList<>();
		int[] currentInterval = intervals[0];
		outputArr.add(currentInterval);

		for (int[] interval : intervals) {
			int currentEnd = currentInterval[1];
			int nextStart = interval[0];
			int nextEnd = interval[1];

			if (currentEnd >= nextStart) {
				currentInterval[1] = Math.max(currentEnd, nextEnd);
			} else {
				currentInterval = interval;
				outputArr.add(currentInterval);
			}
		}

		return outputArr.toArray(new int[outputArr.size()][]);
	}

}
