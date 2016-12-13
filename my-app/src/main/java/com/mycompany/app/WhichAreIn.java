package com.mycompany.app;

import java.util.Arrays;

/**
 * Created by dbrown on 12/13/16.
 */
public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(e -> Arrays.stream(array2)
                        .anyMatch(f -> f.contains(e)))
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }
}
