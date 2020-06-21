package code.array;

import java.util.*;

public class TopKFrequentNumbers {
    public static void main(String[] args) {
        System.out.println(findTopKfrequentNumbers(new int[]{2, 13, 14, 11, 34, 12, 11, 13}, 2));
    }

    private static List<Integer> findTopKfrequentNumbers(int[] ints, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int n : ints) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<Map.Entry<Integer, Integer>>((k1, k2) -> k1.getValue() - k2.getValue());
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        List<Integer> numbers = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            numbers.add(minHeap.poll().getKey());
        }
        return numbers;

    }
}
