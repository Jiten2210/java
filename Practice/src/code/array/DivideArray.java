package code.array;
 import java.util.*;
 public class DivideArray
 {
 	public static void main(String[] args)
 	{
 		List<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(3);
        arr1.add(8);
        arr1.add(9);
        arr1.add(6);
        arr1.add(11);
        arr1.add(15);
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);


        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        Integer minDiff = 0;
        Integer currDiff = 0;
        Integer minIndex = 0;
        Integer currIndex = 0;
        for(int i=0;i < arr1.size();i++)
        {
            minDiff += arr1.get(i);
        }
        System.out.println(arr1);
        currDiff = minDiff;

        for(int j = arr1.size()-1;j >= 0; j--)
        {
            currDiff = currDiff - (2*arr1.get(j));
            System.out.println(currDiff);
            if(Math.abs(currDiff) <= minDiff)
            {
                minDiff = Math.abs(currDiff);
                minIndex = j;
                arr2.add(arr1.get(j));
                arr1.remove(j);
            }
            else
            {
                break;
            }
        }


        System.out.println(arr1.toString() + "," + arr2.toString());
        System.out.println(minIndex);


    }
}