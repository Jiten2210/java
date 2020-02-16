package code.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamCompare {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11, 21, 3, 14, 5);

        Optional<Integer> result = list.stream().max(Integer::compareTo);
        System.out.println(result.get());

        result = list.stream().min(Integer::compareTo);
        System.out.println(result.get());

        long count = list.stream().count();
        System.out.println(count);

        Integer max = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .max(Comparator.comparing(Integer::valueOf))
                .get();

        Integer min = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .min(Comparator.comparing(Integer::valueOf))
                .get();

        System.out.println("max Number = " + max);
        System.out.println("min Number = " + min);
    }
}
