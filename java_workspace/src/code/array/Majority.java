package code.array;

class Majority {
	void printMajority(int a[], int size) {
		int cand = findCandidate(a, size);

		if (isMajority(a, size, cand))
			System.out.println(" " + cand + " ");
		else
			System.out.println("No Majority Element");
	}

	int findCandidate(int a[], int size) {
		int maj_index = 0, count = 1;
		int i;
		for (i = 1; i < size; i++) {
			if (a[maj_index] == a[i])
				count++;
			else
				count--;
			if (count == 0) {
				maj_index = i;
				count = 1;
			}
		}
		return a[maj_index];
	}

	boolean isMajority(int a[], int size, int cand) {
		int i, count = 0;
		for (i = 0; i < size; i++) {
			if (a[i] == cand)
				count++;
		}
		if (count > size / 2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Majority majorelement = new Majority();
		int a[] = new int[] { 1, 3, 3, 1, 2 };
		int size = a.length;
		majorelement.printMajority(a, size);
	}
}
