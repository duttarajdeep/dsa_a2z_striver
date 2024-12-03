package step1.lecture4;

public class Gcd {
    public static void main(String[] args) {
        int[] nums = {3, 3};
//        int[] nums = {2, 5, 6, 9, 10};
        System.out.println(findGCD(nums));

    }

    public static int findGCD(int[] nums) {
        int min = findMin(nums);
        int max = findMax(nums);
        return gcd(min, max);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) max = nums[i];
        }
        return max;
    }

    public static int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
        }
        return min;
    }
}
