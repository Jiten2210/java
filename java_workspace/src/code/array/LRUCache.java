package code.array;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

class LRUCache {

    Set<Integer> cache;
    int capacity;

    public LRUCache(int capacity) {
        this.cache = new LinkedHashSet<Integer>(capacity);
        this.capacity = capacity;
    }

    public boolean get(int key) {
        if (!cache.contains(key))
            return false;
        cache.remove(key);
        cache.add(key);
        return true;
    }

    public void refer(int key) {
        if (get(key) == false)
            put(key);
    }

    public void display() {
        LinkedList<Integer> list = new LinkedList<>(cache);
        Iterator<Integer> itr = list.descendingIterator();

        while (itr.hasNext())
            System.out.print(itr.next() + " ");
    }

    public void put(int key) {
        if (cache.size() == capacity) {
            int firstKey = cache.iterator().next();
            cache.remove(firstKey);
        }

        cache.add(key);
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(4);
        lruCache.refer(1);
        lruCache.refer(2);
        lruCache.refer(3);
        lruCache.refer(1);
        lruCache.refer(4);
        lruCache.refer(5);
        lruCache.display();
    }
}

