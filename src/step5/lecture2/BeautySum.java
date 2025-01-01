package step5.lecture2;

public class BeautySum {
	public int beautySum(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int[] freq = new int[26];
			for (int j = i; j < s.length(); j++) {
				freq[s.charAt(j) - 'a'] += 1;
				sum += calcBeauty(freq);
			}
		}
		return sum;
	}

	public int calcBeauty(int[] freq) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < 26; i++) {
			if (freq[i] == 0)
				continue;
			min = Math.min(min, freq[i]);
			max = Math.max(max, freq[i]);
		}

		return max - min;
	}

}
