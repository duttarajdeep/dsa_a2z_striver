package step3.hard;

public class NumberOfInversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 4, 3, 2, 1 };
		System.out.println(numberOfInversions(nums, nums.length));
		System.out.println(numberOfInversionsOpt(nums, nums.length));
	}

	static int numberOfInversions(int[] a, int n) {
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j])
					ans++;
			}
		}
		return ans;
	}

	static int merge(int[] a, int low, int mid, int high){
		int left = low;
		int right = mid + 1;
		int count = 0;
		int k = 0;
		int[] t = new int[a.length];

		while(low <= mid && right <= high){
			if(a[left] < a[right]){
				t[k] = a[left];
				left++;
			} else {
				t[k] = a[right];
				count += mid - left + 1;
				right++;
			}
			k++;
		}

		while(left <= mid){
			t[k] = a[left];
			left++;
		}

		while(right <= high){
			t[k] = a[high];
			right++;
		}

		for(int i = low; i <= high; i++){
			a[i] = t[i - low];
		}
		return count;
	}

	static int mergeSort(int[] a, int low, int high){
		int count = 0;
		if(low >= high) return count;
		int mid = low + (high - low) / 2;
		count += mergeSort(a, low, mid);
		count += mergeSort(a, mid + 1, high);
		count += merge(a, low, mid, high);
		return count;
	}

	static int numberOfInversionsOpt(int[] a, int n){
		return mergeSort(a, 0, n - 1);
	}

}
