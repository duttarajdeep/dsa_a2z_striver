package step1.lecture5;

public class FibonacciNumber {
	
	public static void main(String[] args) {
		System.out.println(fib(5));
	}
	
	static int fib(int n) {
		if(n == 0 || n == 1) return n;
		return fib(n - 1) + fib(n - 2);
	}

}
