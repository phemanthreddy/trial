
package junit;

public class Q1MinMaxFinder {
	public int[] findMinMax(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int arr1[] = { arr[0], arr[arr.length - 1] };
		return  arr1;
	}
}