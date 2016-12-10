package com.mycompany.app;

/**
 * Created by dbrown on 12/9/16.
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FighterSolutionTest {
        @Test
        public void basicTests() {
            assertEquals("Lew", FighterSolution.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
            assertEquals("Harry", FighterSolution.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
            assertEquals("Harald", FighterSolution.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
            assertEquals("Harald", FighterSolution.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
            assertEquals("Harald", FighterSolution.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
            assertEquals("Harald", FighterSolution.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
        }
    }