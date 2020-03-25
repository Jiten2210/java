package code.java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
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


        List<Integer> list = Arrays.asList(11, 21, 3, 14, 5);

        Optional<Integer> out = list.stream().max(Integer::compareTo);
        System.out.println(out.get());

        out = list.stream().min(Integer::compareTo);
        System.out.println(out.get());

        long count = list.stream().count();
        System.out.println(count);

        // Find Min/Max in a Integer Stream
        System.out.println("max Number = " + Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .max(Comparator.comparing(Integer::valueOf))
                .get());
        System.out.println("min Number = " + Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .min(Comparator.comparing(Integer::valueOf))

                .get() + "------ " +  IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min().getAsInt());

        //sum of all element
        System.out.println("Sum is: " + IntStream.of(1, 2, 3, 4, 5).sum());

        Set<Integer> hs = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        //sum of all elements
        System.out.println("Sum = " + hs.stream().collect(Collectors.summingInt(p -> p)));

        //Maximum number out of the Integer List
        System.out.println("Max = " + hs.stream().reduce(Math::max).get());

        //Summary of collection elements
        System.out.println("Collection Summary = " + hs.stream().collect(Collectors.summarizingInt(p -> ((Integer) p))));

        //set to map
        System.out.println("Map = " + hs.stream().collect((Collectors.toMap(p -> p, q -> q * 100))));

        //elements group by even and odd
        System.out.println("Group by even odd" + hs.stream().collect(Collectors.groupingBy(p -> p % 2)));
    }

}