package com.example.springbootcrudwithsplunkintegration.programing;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OptionalIntEx {


    public static void main(String[] args) {

        OptionalInt optionalInt = OptionalInt.of(55);
        OptionalInt optionalInt1 = OptionalInt.of(0);

        // Get the value if present, otherwise provide a default value
        int valueOrDefault = optionalInt1.orElseGet(() -> {
            // provide a default value
            return 2;
        });

        System.out.println("1: " + valueOrDefault);

        // Get the value if present, otherwise provide a specified value
        int valueOrSpecified = optionalInt.orElse(0);

// Perform an operation on the value if present
        optionalInt.ifPresent(value -> {
            // perform an operation on the value
            System.out.println(value);
        });


        // Map the value to a new value if present
        //OptionalInt mapped = optionalInt.map(value -> value * 2);

        // Filter the value if present
        //OptionalInt filtered = optionalInt.filter(value -> value > 0);

// Get the value if present, or perform an operation on it
        optionalInt.ifPresentOrElse(value -> {
            // perform an operation on the value
            System.out.println(value);
        }, () -> {
            // provide a default value
            System.out.println("No value present");
        });

        // Try to extract the value, or provide a default value if present
        int valueOrDefault2 = optionalInt.orElseGet(() -> {
            // provide a default value
            return 0;
        });

        // Try to extract the value, or provide a specified value if present
        int valueOrSpecified2 = optionalInt.orElse(0);
        List<String> names = Arrays.asList("John", "Mary", "David");
        Predicate<String> predicate = name -> name.startsWith("J");
        List<String> filteredNames = names.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        System.out.println(filteredNames);
        System.out.println(getUserName());


    }
    public static Optional<String> getUserName() {
        // simulate a method that may return null
        String userName = null;
        return Optional.ofNullable(userName);
    }
}
