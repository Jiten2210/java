package Programming;

public class KthMinimum {

	static int kth(int arr1[], int arr2[], int m, int n, int k) {
		int[] sorted = new int[m + n];
		int i = 0, j = 0, c = 0;
		while (i < m && j < n) {
			if (arr1[i] < arr2[j])
				sorted[c++] = arr1[i++];
			else
				sorted[c++] = arr2[j++];
		}
		while (i < m)
			sorted[c++] = arr1[i++];
		while (j < n)
			sorted[c++] = arr2[j++];
		return sorted[k - 1];
	}

	// main function
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 6, 7, 9 };
		int arr2[] = { 1, 4, 8, 10 };
		int k = 4;
		System.out.print(kth(arr1, arr2, 5, 4, k));
	}
}
