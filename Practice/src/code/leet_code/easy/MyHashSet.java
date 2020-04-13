package code.leet_code.easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyHashSet {

    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        obj.add(5);
        obj.add(6);
        obj.add(7);
        obj.remove(6);
        System.out.println(obj.contains(5));
    }

    List<Integer> list;

    public MyHashSet() {
        list = new ArrayList<>();
    }

    public void add(int key) {
        if (!list.contains(key)) {
            list.add(key);
        }
    }

    public void remove(int key) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int val = it.next();
            if (val == key) {
                it.remove();
                return;
            }
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return list.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */

