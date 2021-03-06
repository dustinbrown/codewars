package com.mycompany.app;

import java.util.Arrays;

/**
 * Created by dbrown on 12/9/16.
 * In a factory a printer prints labels for boxes. For one kind of boxes the printer has to use colors which, for the sake of simplicity, are named with letters from a to m.

 The colors used by the printer are recorded in a control string. For example a "good" control string would be aaabbbbhaijjjm meaning that the printer used three times color a, four times color b, then one time color a...

 Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm.

 You have to write a function printer_error which given a string will output the error rate of the printer as a string representing a rational whose numerator is the number of errors and the denominator the length of the control string. Don't reduce this fraction to a simpler expression.

 The string has a length greater or equal to one and contains only letters from ato z.
 */
public class Printer {

    public static String printerError(String s) {
        Long errors = Arrays.stream(s.split("")).filter(m ->  m.charAt(0) < 97|| 109 < m.charAt(0)).count();
    return String.format("%d/%d", errors, s.length());}
}
