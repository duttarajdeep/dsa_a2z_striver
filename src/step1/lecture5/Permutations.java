package step1.lecture5;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        String str = "abcd";
        permutations(str);
    }

    static void permutations(String s) {
        // helper(processed, s);
        // System.out.println(helperList("", "abc"));
        System.out.println(helperCount("", s));
    }

    // Getting permutations as string
    static void helper(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0, i);
            String s = processed.substring(i);
            helper(f + ch + s, unprocessed.substring(1));
        }
    }

    // Getting permutations as list
    static List<String> helperList(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = unprocessed.charAt(0);
        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0, i);
            String s = processed.substring(i);
            ans.addAll(helperList(f + ch + s, unprocessed.substring(1)));
        }
        return ans;
    }

    // Getting permutation count
    static int helperCount(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            return 1;
        }
        char ch = unprocessed.charAt(0);
        int count = 0;
        for (int i = 0; i <= processed.length(); i++) {
            String f = processed.substring(0, i);
            String s = processed.substring(i);
            count += helperCount(f + ch + s, unprocessed.substring(1));
        }
        return count;
    }

}
