package code;

//A Java program to find all symmetric pairs in a given array of pairs
import java.util.HashMap;

class SymmetricPairs {

	static void findSymPairs(int arr[][]) {
		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int first = arr[i][0];
			int sec = arr[i][1];
			Integer val = hM.get(sec);

			if (val != null && val == first)
				System.out.println("(" + sec + ", " + first + ")");

			else
				hM.put(first, sec);
		}
	}

	// Drive method
	public static void main(String arg[]) {
		int arr[][] = new int[5][2];
		arr[0][0] = 11;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 5;
		arr[2][1] = 10;
		arr[3][0] = 40;
		arr[3][1] = 30;
		arr[4][0] = 10;
		arr[4][1] = 5;
		findSymPairs(arr);
	}
}