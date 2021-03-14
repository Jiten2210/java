package code.array;

import java.util.Comparator;
import java.util.PriorityQueue;

//find the Kth largest element in a stream of numbers.
public class KthLargestNumberInStream {
    final int k;

    public KthLargestNumberInStream(int[] numbers, int k) {
        for (int i = 0; i < numbers.length; i++) {
            add(numbers[i]);
        }
        this.k = k;
    }

    public static void main(String[] args) {
        int[] input = new int[]{3, 1, 5, 12, 2, 11};
        KthLargestNumberInStream kthLargestNumberInStream = new KthLargestNumberInStream(input, 3);
        System.out.println("4th largest number --- > " + kthLargestNumberInStream.add(4));
        System.out.println("4th largest number --- > " + kthLargestNumberInStream.add(6));
    }

    private int add(int number) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(n -> n));
        minHeap.add(number);
        if (minHeap.size() > this.k) minHeap.poll();
        return minHeap.peek();
    }
}
