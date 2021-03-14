package code.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KLargestNumbers {
    public static void main(String[] args) {
        int k = 4;
        System.out.println(findKLargestNumbers(new int[]{12, 19, 1, 34, 5, 61, 4}, k));
    }

    private static List<Integer> findKLargestNumbers(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(num -> num));
        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(nums[i]);
            }

        }
        return new ArrayList<>(minHeap);
    }
}
