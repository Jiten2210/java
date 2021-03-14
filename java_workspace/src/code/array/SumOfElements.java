package code.array;

//find the sum of all numbers between the K1’th and K2’th smallest elements of that array

import java.util.PriorityQueue;

public class SumOfElements {

    public static void main(String[] args) {
        System.out.println(findSumOfElements(new int[]{1, 34, 32, 14, 17, 29}, 3,7));

    }

    private static int findSumOfElements(int[] a, int k1, int k2) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
        for (int i = 0; i < a.length; i++) minHeap.add(a[i]);
        System.out.println(minHeap);
        for (int i = 0; i < k1; i++) minHeap.poll();
        int sum = 0;
        System.out.println(minHeap);
        for (int i = 0; i < k2 - k1 - 1; i++) sum += minHeap.poll();

        return sum;

    }
}
