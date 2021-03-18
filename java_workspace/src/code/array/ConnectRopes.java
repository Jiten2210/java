package code.array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ConnectRopes {
    public static void main(String[] args) {
        System.out.println(getMinimumCost(new int[]{1, 3, 11, 5}));
        System.out.println(getMinimumCost(new int[]{3, 4, 5, 6}));
    }

    private static int getMinimumCost(int[] ropeLength) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(n -> n));
        for (int i = 0; i < ropeLength.length; i++) {
            minHeap.add(ropeLength[i]);
        }

        int out = 0, temp = 0;
        while (minHeap.size() > 1) {
            temp = minHeap.poll() + minHeap.poll();
            out += temp;
            minHeap.add(temp);
        }
        return out;
    }
}
