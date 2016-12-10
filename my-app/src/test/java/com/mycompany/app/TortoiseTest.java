package com.mycompany.app;

/**
 * Created by dbrown on 12/10/16.
 */
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class TortoiseTest {

    @Test
    public void test1() {
        System.out.println("Basic Tests");
        assertArrayEquals(new int[]{0, 32, 18}, Tortoise.race(720, 850, 70));
        assertArrayEquals(new int[]{3, 21, 49}, Tortoise.race(80, 91, 37));
        assertArrayEquals(new int[]{2, 0, 0}, Tortoise.race(80, 100, 40));
        assertArrayEquals(new int[]{0, 0, 0}, Tortoise.race(80, 100, 0));
        assertArrayEquals(null, Tortoise.race(800, 100, 0));
    }
}
