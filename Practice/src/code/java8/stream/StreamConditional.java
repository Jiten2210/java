package code.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class StreamConditional {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        // if-else logic
        Consumer<Integer> c = i -> {
            if (i % 2 == 0) System.out.println("Even Number " + i);
            else System.out.println("Odd Number " + i);
        };
        al.stream().forEach(c);

        //if logic
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        numberList.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

    }
}
