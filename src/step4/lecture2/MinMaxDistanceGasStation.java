package step4.lecture2;

public class MinMaxDistanceGasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stations = { 1, 13, 17, 23 };
		System.out.println(minimiseMaxDistance(stations, 5));
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

}
