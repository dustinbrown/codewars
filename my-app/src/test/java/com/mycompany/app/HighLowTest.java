package com.mycompany.app;

/**
 * Created by dbrown on 12/13/16.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighLowTest  {
    @Test
    public void Test1() {
        assertEquals("42 -9", HighLow.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        assertEquals("1 1", HighLow.HighAndLow("1"));
    }
}