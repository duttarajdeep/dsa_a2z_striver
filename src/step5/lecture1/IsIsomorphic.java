package step5.lecture1;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsomorphic("badc", "kikp"));

	}

	static boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);

			if (map.containsKey(c1) && map.get(c1) != c2 && map.containsValue(c2))
				return false;

			if (map.containsKey(c2) && map.get(c2) != c1 && map.containsValue(c1))
				return false;

			map.put(c1, c2);
		}

		return true;
	}

}
