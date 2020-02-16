package code.array;

import java.util.*;

class MyDS {
	ArrayList<Integer> arr;
	HashMap<Integer, Integer> hash;

	public MyDS() {
		arr = new ArrayList<Integer>();
		hash = new HashMap<Integer, Integer>();
	}

	void add(int x) {
		if (hash.get(x) != null)
			return;

		int s = arr.size();
		arr.add(x);

		hash.put(x, s);
	}

	void remove(int x) {
		Integer index = hash.get(x);
		if (index == null)
			return;

		hash.remove(x);
		// arr[] can be done in O(1) time
		int size = arr.size();
		Integer last = arr.get(size - 1);
		Collections.swap(arr, index, size - 1);

		arr.remove(size - 1);

		hash.put(last, index);
	}

	int getRandom() {
		Random rand = new Random();
		int index = rand.nextInt(arr.size());
		return arr.get(index);
	}

	Integer search(int x) {
		return hash.get(x);
	}

	public static void main(String[] args) {
		MyDS ds = new MyDS();
		ds.add(10);
		ds.add(20);
		ds.add(30);
		ds.add(40);
		System.out.println(ds.search(30));
		ds.remove(20);
		ds.add(50);
		System.out.println(ds.search(50));
		System.out.println(ds.getRandom());
	}
}