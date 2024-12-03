package step1.lecture5;

public class PrintNums {
	
	public static void main(String[] args) {
		printNums(7);
	}

	static void printNums(int n) {
		if(n == 0) return;
		printNums(n - 1);
		System.out.print(n + " ");
	}
}
