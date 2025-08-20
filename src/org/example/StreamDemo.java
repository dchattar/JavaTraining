package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList( "Siddharth","Shubhangi", "Aniket", "Shubhangi", "Siddharth", "Aniket", "Shubhangi", "Siddharth");

      // With Stream
        list.stream()
                //.filter(s -> s.contains("S")) // filter out strings containing 'S'
                .sorted()
               .distinct()
                .limit(1)
               // .skip(2)
               // .peek(s -> System.out.println(s)) // peek to see the elements
               // .skip(2)
                .takeWhile(s -> s.contains("S"))
              //  .map(s -> s.toUpperCase(Locale.ROOT))// convert each element to upper case
                .forEach(System.out::println); // forEach to perform an action on each element

        // Example of .collect() to gather results into a List
       Optional<String> str= list.stream()
                .filter(s -> s.contains("S")) // filter out strings containing 'S'
                .map(String::toUpperCase) // convert each element to upper case
                .reduce((s1, s2) -> s1 + ", " + s2); // reduce to concatenate strings


        // collect results into a List
        System.out.println("First element in the list : " + str.orElse("No match found"));


        //simple example of reduce
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        String concatenatedNames = names.stream()
                .reduce("", (s1, s2) -> s1 + s2); //
        System.out.println("Concatenated names: " + concatenatedNames);

        // example of reduce to calculate sum of integers
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum); // reduce to calculate sum

        System.out.println("Sum of numbers: " + sum);

        int sum1 = 0;
        for(int i = 0; i< numbers.size(); i++) {
            sum1 = sum1 + numbers.get(i);
        }

        System.out.println("Sum : " + sum);

    }

    //what other methods can be used as intermidate operations in streams?
    // Some common intermediate operations include:
    // - `map()`: Transforms each element in the stream.
    // - `filter()`: Filters elements based on a condition.
    // - `distinct()`: Removes duplicate elements.
    // - `sorted()`: Sorts the elements in the stream.
    // - `limit()`: Limits the number of elements in the stream.
    // - `skip()`: Skips a specified number of elements in the stream.
    // - `flatMap()`: Flattens nested structures into a single stream.
    // - `peek()`: Allows you to perform an action on each element without modifying the stream.
    // - `takeWhile()`: Takes elements while a condition is true.
    // - `dropWhile()`: Drops elements while a condition is true.
    // - `reduce()`: Combines elements in the stream into a single result.

    //what examples of terminal operations can be used in streams?

    // Some common terminal operations include:
    // - `forEach()`: Performs an action for each element in the stream.
    // - `collect()`: Collects the elements of the stream into a collection (e.g., List, Set).
    // - `count()`: Counts the number of elements in the stream.
    // - `findFirst()`: Returns the first element of the stream, if present.
    // - `findAny()`: Returns any element of the stream, if present.
    // - `allMatch()`: Checks if all elements match a given predicate.
    // - `anyMatch()`: Checks if any element matches a given predicate.
    // - `noneMatch()`: Checks if no elements match a given predicate.
    // - `reduce()`: Combines elements in the stream into a single result.
    // - `toArray()`: Converts the stream to an array.
    // - `min()`: Finds the minimum element in the stream based on a comparator.
    // - `max()`: Finds the maximum element in the stream based on a comparator.
    // - `toList()`: Collects the elements into a List.
    // - `toSet()`: Collects the elements into a Set.
    // - `toMap()`: Collects the elements into a Map.
    // - `join()`: Joins the elements into a single String.
    // - `reduce()`: Combines elements in the stream into a single result.
    // - `summaryStatistics()`: Collects statistics (count, sum, min, max





}

//take an array of Strings, filterout the strings having letter 'S' in them and convert to upper case using stream apis
