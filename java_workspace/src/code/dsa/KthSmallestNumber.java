package code.dsa;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestNumber {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 6, 2};
        int k = 2;
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : a)
            heap.add(num);
        int n = a.length - k;
        int i = 1;
        while (i++ <= n)
            heap.poll();
        System.out.println(heap.poll());
    }
}
