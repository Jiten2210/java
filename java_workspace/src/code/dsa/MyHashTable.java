package code.dsa;
public class MyHashTable<K, V> {


	private static int SIZE = 10;
	private V[] tableValues = (V[]) new Object[SIZE];
	public  V put(K key, V value) {
		if (value == null) {
			throw new NullPointerException();
		}

		int index = hash(key.hashCode()) ;
		tableValues[index] = value;
		return value;
	}
	public  V get(K key) {
		int index = hash(key.hashCode());
		return tableValues[index];

	}

	public  void delete(K key) {
			int index = hash(key.hashCode());
			tableValues[index]=null;
	}

	private  int hash(int h) {
		h = (h*7)% SIZE; // this is my hash function. IT is the most basic hash function
		return h ;

	}



	public static void main(String arg[]) {

		MyHashTable<Integer, String> table = new MyHashTable<Integer, String>();

//////////////////////////////INSERTION////////////////////////////////////////////////////////////
	for (int i = 0; i < 10; i++) {   // here i am trying to generate some random values and trying to insert them in hash table
			table.put(i,"value"+i);
		}
		table.put(15,"value15");
		table.put(34,"value34");
		table.put(5,"value5");

////////////////////////////////LOOKUP/////////////////////////////////////////////////////
		for (int i = 0; i < 10; i++) {
			System.out.println(table.get( i));  //here I am retrieving all the key values

		}
		System.out.println("Value for key 34 : "+table.get(34));// here I am retrieving values for key 15

//////////////////////////////////DELETION////////////////////////////////////////////////

		table.delete(15);
		table.delete(1);
		System.out.println("\nafter deletion value for key 15 : "+table.get(15));

	}

}