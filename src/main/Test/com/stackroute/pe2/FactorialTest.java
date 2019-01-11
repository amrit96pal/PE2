package com.stackroute.pe2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class FactorialTest {
    Factorial fac;

    @Before
    public void setUp() throws Exception {
        fac = new Factorial();
    }
    @Test
    public void TestFact() {
        int inp = 5;
        int val = 13;
        int an = fac.fact(inp);
        int res = fac.fact(val);
        String ans="out of range";
        assertEquals(120, an);
        assertNotEquals(ans, res);
   }
}
