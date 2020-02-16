package code.java8.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.LongStream.concat;

public class Stream1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jitu", "Tanu", "Mummy", "Papa", "Puja");

        List<String> result = names.stream().filter(name -> !"jitu".equalsIgnoreCase(name)).collect(Collectors.toList());
        result.forEach(System.out::println);

        List<String> result1 = Collections.singletonList(names.stream()
                .filter(x -> "jack".equals(x))
                .findAny()
                .orElse(null));
        System.out.println(result1);

        Stream<Integer> stream = Stream.of(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbersList);

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8, 9);

        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

        List<Integer> listOfAllIntegers = listOfLists.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        System.out.println(listOfAllIntegers);

        List<Integer> ints = IntStream.iterate(0, i -> i + 2)
                .mapToObj(Integer::valueOf)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(ints);

        Stream<Integer> first = Stream.of(1, 2);
        Stream<Integer> second = Stream.of(3,4);
        Stream<Integer> third = Stream.of(5, 6);
        Stream<Integer> fourth = Stream.of(7,8);

        Stream<Integer> resultingStream = Stream.concat(first, concat(second, concat(third, fourth)));

        System.out.println( resultingStream.collect(Collectors.toList()) );

    }
}
