package com.mycompany.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by dbrown on 12/13/16.
 */
public class HighLow {
    public static String HighAndLow(String numbers) {
        List<Integer> numbersArray = Arrays.stream(
                numbers.split((" ")))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return String.format("%d %d", Collections.max(numbersArray), Collections.min(numbersArray));
    }
}
