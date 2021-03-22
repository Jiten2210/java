package code.linked_list;

import java.util.HashMap;

public class LRUCache {
    Node head;
    Node tail;
    HashMap<Integer, Node> map = null;
    int cap = 0;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.map = new HashMap<>();
    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        lRUCache.get(1);    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        lRUCache.get(2);    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lRUCache.get(1);    // return -1 (not found)
        lRUCache.get(3);    // return 3
        lRUCache.get(4);
        System.out.println(lRUCache.get(4));    //4
    }

    public int get(int key) {
        if (map.get(key) == null) {
            return -1;
        }

        Node t = map.get(key);
        removeNode(t);
        insertNode(t);
        return t.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node t = map.get(key);
            t.value = value;

            removeNode(t);
            insertNode(t);
        } else {
            if (map.size() >= cap) {
                map.remove(head.key);
                removeNode(head);
            }

            //add to tail
            Node node = new Node(key, value);
            insertNode(node);
            map.put(key, node);
        }
    }

    private void removeNode(Node n) {
        if (n.prev != null) {
            n.prev.next = n.next;
        } else {
            head = n.next;
        }

        if (n.next != null) {
            n.next.prev = n.prev;
        } else {
            tail = n.prev;
        }
    }

    private void insertNode(Node n) {
        if (tail != null) {
            tail.next = n;
        }

        n.prev = tail;
        n.next = null;
        tail = n;

        if (head == null) {
            head = tail;
        }
    }

    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
