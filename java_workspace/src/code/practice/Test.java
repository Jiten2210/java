package code.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>
                (Arrays.asList(1, 24, -1, 8, -3, 0));

       numbers.removeIf( i -> i < 0);
        System.out.println(numbers);
    }

        /*
        int[] a = new int[]{8, 4, 3, 7, 2};
        System.out.println("Kth largest element is --->" + findKthLargestElement(a, 3));

        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                second_max = max;
                max = a[i];
            } else if (a[i] != max && a[i] > second_max) {
                second_max = a[i];
            }
        }
        System.out.println("second largest element is --->" + second_max);
    }*/

    private static int findKthLargestElement(int[] a, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : a)
            heap.add(num);

        int n = a.length - k;
        int i = 1;

        while (i++ <= n)
            heap.poll();

        return heap.poll();
    }

}
