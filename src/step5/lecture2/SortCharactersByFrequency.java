package step5.lecture2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String frequencySort(String s) {
		Map<Character, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();

		List<Character>[] arr = new ArrayList[s.length() + 1];

		for (char c : s.toCharArray()) {
			int count = map.getOrDefault(c, 0);
			map.put(c, count + 1);
		}

		map.keySet().forEach(c -> {
			if (arr[map.get(c)] == null)
				arr[map.get(c)] = new ArrayList<>();
			arr[map.get(c)].add(c);
		});

		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] != null) {
				for (Character c : arr[i]) {
					for (int j = 0; j < i; j++)
						sb.append(c);
				}
			}
		}
		return sb.toString();

	}

}
