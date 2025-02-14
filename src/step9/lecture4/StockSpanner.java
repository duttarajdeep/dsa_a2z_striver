package step9.lecture4;

import java.util.ArrayList;
import java.util.List;

public class StockSpanner {

	List<Integer> prices;

	public static void main(String[] args) {
		StockSpanner obj = new StockSpanner();
		System.out.println(obj.next(100));
		System.out.println(obj.next(80));
		System.out.println(obj.next(60));
		System.out.println(obj.next(70));
		System.out.println(obj.next(60));
		System.out.println(obj.next(75));
		System.out.println(obj.next(85));
	}

	public StockSpanner() {
		prices = new ArrayList<>();
	}

	public int next(int price) {
		int span = 0;
		prices.add(price);
		for (int p : prices) {
			if (p <= price)
				span++;
		}
		return span;
	}

}
