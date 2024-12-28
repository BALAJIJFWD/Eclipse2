package javaproject;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertToUppercase {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        System.out.println("Original List: " + names.collect(Collectors.toList()));

        names = Stream.of("aBc", "d", "ef");
     }

}
