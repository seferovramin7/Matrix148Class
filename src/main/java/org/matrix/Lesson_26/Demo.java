package org.matrix.Lesson_26;

//a simple program to demonstrate the use of stream in java

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Demo {
    public static void main(String args[]) {

        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // demonstration of map method
        List<Integer> square = number
                .stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(square);

        List<Integer> collect = number
                .stream()
                .map(n -> n * 11)
                .collect(Collectors.toList());


        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

        List<String> result = names

                .stream()
                .filter(a -> a.equals("Reflection"))
                .collect(Collectors.toList());


        System.out.println(result);

        // demonstration of sorted method
        List<String> show =
                names
                        .stream()
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream()
                        .map(x -> x * x)
                        .collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        number
                .stream()
                .map(x -> x * x)
                .forEach(y -> System.out.println(y));

        // demonstration of reduce method
        int even =
                number.stream()
                        .filter(x -> x % 2 == 0)
                        .reduce(0, (t, i) -> t + i);

        System.out.println(even);
    }
}

