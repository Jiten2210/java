package array;

public class PairDifference {

	public static void main(String[] args) {
		int[] arr= { 1, 8, 30, 40, 100 };
		int n = 60;
		findPair(arr, n);
	}

	static boolean findPair(int[] b, int n) {
		int size = b.length;
		int i = 0, j = 1;
        while (i < size && j < size) {
			if (i != j && b[j] - b[i] == n) {
				System.err.print(b[i] + ", " + b[j]);
				return true;
			} else if (b[j] - b[i] < n)
				j++;
			else
				i++;
		}

		System.err.print("Not Found");
		return false;
	}

}
