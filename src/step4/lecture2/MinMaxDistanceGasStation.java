package step4.lecture2;

import java.util.PriorityQueue;

public class MinMaxDistanceGasStation {

	public static class Pair {
		double first;
		int second;

		Pair(double first, int second) {
			this.first = first;
			this.second = second;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stations = { 1, 13, 17, 23 };
		System.out.println(minimiseMaxDistance(stations, 5));
		System.out.println(minimiseMaxDistanceBetter(stations, 5));
		System.out.println(minimiseMaxDistanceOptimal(stations, 5));
	}

	// brute force - O(k * n) + O(n)
	static int minimiseMaxDistance(int[] stations, int k) {
		int n = stations.length;
		int[] howMany = new int[n - 1];

		for (int gas = 1; gas <= k; gas++) {
			int maxSectionLength = -1;
			int maxSectionIndex = -1;
			for (int i = 0; i < n - 1; i++) {
				int dist = stations[i + 1] - stations[i];
				int sectionLength = dist / (howMany[i] + 1);
				if (sectionLength > maxSectionLength) {
					maxSectionLength = sectionLength;
					maxSectionIndex = i;
				}
			}
			howMany[maxSectionIndex]++;
		}

		int maxAns = -1;
		for (int i = 0; i < n - 1; i++) {
			int sectionLength = (stations[i + 1] - stations[i]) / (howMany[i] + 1);
			maxAns = Math.max(maxAns, sectionLength);
		}

		return maxAns;
	}

	// better solution - O(Nlog(N) + klog(N))
	static double minimiseMaxDistanceBetter(int[] stations, int k) {
		int n = stations.length;
		int[] howMany = new int[n - 1];

		PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.first, a.first));

		for (int i = 0; i < n - 1; i++) {
			double sectionLen = stations[i + 1] - stations[i];
			pq.add(new Pair(sectionLen, i));
		}

		for (int gs = 1; gs <= k; gs++) {
			Pair top = pq.poll();
			int sectionIdx = top.second;

			// place the current gs at this section
			howMany[sectionIdx]++;

			double diff = stations[sectionIdx + 1] - stations[sectionIdx];
			double newSectionLen = diff / (double) (howMany[sectionIdx] + 1);

			pq.add(new Pair(newSectionLen, sectionIdx));
		}

		return pq.peek().first;
	}

	// optimal solution - O(logN)
	static double minimiseMaxDistanceOptimal(int[] stations, int k) {
		int n = stations.length;
		double low = 0;
		double high = 0;
		for (int i = 0; i < n - 1; i++) {
			high = Math.max(high, (double) stations[i + 1] - stations[i]);
		}

		double diff = 1e-6;

		while (high - low > diff) {
			double mid = low + (high - low) / (2.0);
			int count = numberOfGasStationsRequired(mid, stations);
			if (count > k)
				low = mid;
			else
				high = mid;
		}

		return (int) high;
	}

	static int numberOfGasStationsRequired(double dist, int[] stations) {
		int count = 0;
		for (int i = 1; i < stations.length; i++) {
			int distInBetween = stations[i] - stations[i - 1];
			int positionsInBetween = (int) (distInBetween / dist);
			if (distInBetween / dist == positionsInBetween * dist)
				positionsInBetween--;
			count += positionsInBetween;
		}
		return count;
	}
}
