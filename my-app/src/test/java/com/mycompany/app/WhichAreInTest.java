package com.mycompany.app;

/**
 * Created by dbrown on 12/13/16.
 */
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class WhichAreInTest {
    @Test
    public void test1() {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
    @Test
    public void duplicatesTest() {
        String a[] = new String[]{ "arp", "live", "strong", "arp" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
    @Test
    public void noneTest() {
        String a[] = new String[] {};
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }

    @Test
    public void orderTest() {
        String a[] = new String[]{"live", "strong", "arp" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[]{ "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
}