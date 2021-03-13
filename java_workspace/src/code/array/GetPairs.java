package code.array;

// Java program to find pair whose sum
// already exists in array
import java.util.*;
import java.lang.*;
import java.io.*;

class Getpairs {
    // Function to find pair whose sum
    // exists in arr[]
    public static void findPair(int[] arr, int n)
    {
        /* store all the array elements as a
        Hash value*/
        HashSet<Integer> s = new HashSet<Integer>();

        for (Integer i : arr) {
            s.add(i);
        }

        /* Run two loop and check for the sum
    in the Hashset*/
        /* if not a single pair exist then found
    will be false else true*/
        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (s.contains(sum)) {
                    /* if the sum is present in
                 hashset then found become
                true*/
                    found = true;

                    System.out.println(arr[i] + " "
                            + arr[j]);
                }
            }
        }

        if (found == false)
            System.out.println("Not Exist ");
    }

    // driver function
    public static void main(String args[])
    {
        int[] arr = { 10, 4, 8, 13, 5 };
        int n = arr.length;
        findPair(arr, n);
    }
} 