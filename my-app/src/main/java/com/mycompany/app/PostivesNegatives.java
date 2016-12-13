package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class PostivesNegatives
{
    public static int[] countPositivesSumNegatives(int[] input)
        {
//            IntStream.rangeClosed(1, 100).toArray();
//            List<Integer> list = new ArrayList<>();
            if ( input == null || input.length == 0) {
                return new int[]{}; //return an array with count of positives and sum of negatives
            }
            int positive = 0;
            int negative = 0;

            for( int i: input) {
                if (i > 0) { positive++;} else { negative += i;}
            }

            return new int[] {positive, negative};
        }
        int[] a = new int[] {};


}
