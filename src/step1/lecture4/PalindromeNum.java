package step1.lecture4;

public class PalindromeNum {
    public static void main(String[] args) {
        int x = 123221;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String numString = String.valueOf(x);
        int i = 0, j = numString.length() - 1;
        while (i < j) {
            if (numString.charAt(i) != numString.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
