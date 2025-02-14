package step12.lecture1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FractionalKnapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[] = { 60, 100, 120 }, wt[] = { 10, 20, 30 };
		int capacity = 50;
		List<Integer> values = Arrays.stream(val).boxed().collect(Collectors.toList());
		List<Integer> weights = Arrays.stream(wt).boxed().collect(Collectors.toList());
		System.out.println(fractionalKnapsack(values, weights, capacity));

	}

	static double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
		List<Item> items = new ArrayList<>();
		for (int i = 0; i < val.size(); i++) {
			items.add(new Item(wt.get(i), val.get(i)));
		}

		Collections.sort(items, new ItemComparator());

		double maxVal = 0.0;

		for (Item it : items) {
			if (it.weight <= capacity) {
				maxVal += (double) it.value;
				capacity -= it.weight;
			} else {
				maxVal += (double) (it.value / it.weight) * capacity;
				break;
			}
		}
		return maxVal;
	}

	static class Item {
		int weight, value;

		public Item(int w, int v) {
			weight = w;
			value = v;
		}
	}

	static class ItemComparator implements Comparator<Item> {
		@Override
		public int compare(Item a, Item b) {
			double r1 = (double) a.value / (double) a.weight;
			double r2 = (double) b.value / (double) b.weight;
			if (r1 < r2)
				return 1;
			else if (r1 > r2)
				return -1;
			else
				return 0;
		}
	}

}
