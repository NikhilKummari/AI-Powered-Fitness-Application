import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

        //using list
        /*List<Integer> nums = List.of(1,2,3,4,5,6);
            nums.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println); */

       //Using array
      /*  int arr[] = {1,2,3,4};
        Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println); */

        // Using Stream.of() method
        /*Stream<Integer> usingStreamOf = Stream.of(1,2,3,4,5,6);
        usingStreamOf.filter(s -> s % 2 == 0)
                .forEach(System.out::println); */

        // using stream Iterate method
        /*
        Stream<Integer> usingStreamIterate = Stream.iterate(1, n -> n + 1);
        usingStreamIterate.filter(x -> x % 2 == 0)
                .limit(5)
                .forEach(System.out::println);*/
//
//        System.out.println("----------Find even numbers from a list.-----------");
//        List<Integer> nums = List.of(10,20,130,21,45,36,20, 10);
//        nums.stream()
//                .filter(x -> x % 2 == 0)
//                .forEach(System.out::println);
//
//
//        System.out.println("----------Find numbers starting with digit 1-----------");
//        nums.stream()
//                .map(String::valueOf)
//                .filter(num -> num.startsWith("1"))
//                .forEach(System.out::println);
//
//        List<Integer> dup = nums.stream()
//                                .filter(num -> Collections.frequency(nums, num) > 1)
//                                .distinct()
//                                .toList();
//        System.out.println(dup);




//        List<String> input = Arrays.asList("apple", "banana", "apple", "orange", "banana");
//
//        Set<String> set = new HashSet<>();
//        Set<String> dup = input.stream().filter(num -> !set.add(num)).collect(Collectors.toSet());
//
//        System.out.println(set);
//        System.out.println(dup);
//
//        Set<String> unique = new HashSet<>(input);
//
//        System.out.println(unique);

//        List<String> input = Arrays.asList("apple", "banana", "apple", "orange", "banana");
//        Set<String> set = new HashSet<>(input).stream().collect(Collectors.toUnmodifiableSet());
//        System.out.println(set);
//        List<String> unique = input.stream()
//                .distinct()
//                .toList();
//        System.out.println(unique);




        }
