package javaproject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckEmptyStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bcd", "", "defg", "abcd", "", "jkl");

        List<String> nonEmptyStrings = strings.stream()
                                              .filter(s -> !s.isEmpty())
                                              .collect(Collectors.toList());
        
        System.out.println("Non-Empty Strings: " + nonEmptyStrings);
    }
}