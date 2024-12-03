package step1.lecture5;

public class SumOfCubes {

    public static void main(String[] args) {
        System.out.println(sumOfCubes(3, 0));
    }

    static int sumOfCubes(int n) {
        if (n == 1) return 1;
        return n * n * n + sumOfCubes(n - 1);
    }

    // paramterized way
    static int sumOfCubes(int n, int sum) {
        // base case
        if (n == 0) return sum;

        // induction
        return sumOfCubes(n - 1, sum + (n * n * n));
    }

}
