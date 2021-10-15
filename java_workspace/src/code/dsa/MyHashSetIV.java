package code.dsa;

public class MyHashSetIV {
    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(5);
        obj.add(6);
        obj.add(7);
        obj.remove(6);
        System.out.println(obj.contains(5));
    }

    boolean[] set;

    /**
     * Initialize your data structure here.
     */
    public MyHashSetIV() {
        set = new boolean[1000001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return set[key];
    }
}
