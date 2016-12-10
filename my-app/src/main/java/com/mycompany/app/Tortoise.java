package com.mycompany.app;

/**
 * Created by dbrown on 12/10/16.
 * Tortoise Racing
 * Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour. Young B knows she runs faster than A and furthermore has not finished her cabbage.

 When she starts, at last, she can see that A has a 70 feet lead but B speed is 850 feet per hour. How long will it take B to catch A?

 More generally: given two speeds v1 (A speed, integer > 0) and v2 (B speed, integer > 0) and a lead g (integer > 0) how long will it take B to catch A?

 The result will be an array [h, mn, s] where h, mn, s is the time needed in hours, minutes and seconds (don't worry for fractions of second). If v1 >= v2 then return nil, nothing, null, None or {-1, -1, -1} for C++.
 *
 * .2 .23611 1939 .03611
 *
 */


public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2) return null;

        Integer v1InFeetPerSecond = v1;
        Integer v2InFeetPerSecond = v2;

        Float v1SpeedInSeconds = v1InFeetPerSecond.floatValue() / 60 / 60;
        Float v2SpeedInSeconds = v2InFeetPerSecond.floatValue() / 60 / 60;

        Float totalSecondsNeededToCatchUp = g / (v2SpeedInSeconds - v1SpeedInSeconds);
        Integer secondsNeededToCatchup = ((Float)(totalSecondsNeededToCatchUp %60 )).intValue();
        Integer minutesNeededToCatchup = ((Float)(totalSecondsNeededToCatchUp /60%60)).intValue();
        Integer hoursNeededToCatchup = ((Float)(totalSecondsNeededToCatchUp /60/60)).intValue();

        return new int[] {hoursNeededToCatchup, minutesNeededToCatchup, secondsNeededToCatchup};
    }
}
