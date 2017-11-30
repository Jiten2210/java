package Programming;

import java.util.Arrays;

public class AlternativeSorting {
public static void main(String[] args) {
	int arr[] = {1,23,43,21,32,12,56,2,3,4,90};
	Arrays.sort(arr);
	int n = arr.length;
	 int i = 0, j = n-1;
     while (i < j) {
         System.out.print(arr[j--] + " ");
         System.out.print(arr[i++] + " ");
     }
   
     
     if (n % 2 != 0)
         System.out.print(arr[i]);
}
}
