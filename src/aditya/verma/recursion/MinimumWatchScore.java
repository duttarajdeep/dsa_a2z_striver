package aditya.verma.recursion;

import java.util.HashMap;
import java.util.Map;

public class MinimumWatchScore {

	public static int findMinimumWatchScore(int[] watchHistory, int series1, int series2) {
		int n = watchHistory.length;
		int minScore = Integer.MAX_VALUE;

		int left = 0;
		Map<Integer, Integer> seriesCount = new HashMap<>();

		for (int right = 0; right < n; right++) {
			seriesCount.put(watchHistory[right], seriesCount.getOrDefault(watchHistory[right], 0) + 1);

			while (seriesCount.containsKey(series1) && seriesCount.containsKey(series2)) {

				int currentScore = right - left + 1;
				minScore = Math.min(minScore, currentScore);

				seriesCount.put(watchHistory[left], seriesCount.get(watchHistory[left]) - 1);
				if (seriesCount.get(watchHistory[left]) == 0) {
					seriesCount.remove(watchHistory[left]);
				}
				left++;
			}
		}

		return minScore == Integer.MAX_VALUE ? -1 : minScore;
	}

	public static void main(String[] args) {
		int[] watchHistory = { 1, 3, 2, 1, 4 };
		int series1 = 1;
		int series2 = 2;

		int result = findMinimumWatchScore(watchHistory, series1, series2);
		System.out.println("Minimum Watch Score: " + result); // Output: 2
	}
}
