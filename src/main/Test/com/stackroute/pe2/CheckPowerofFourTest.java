package com.stackroute.pe2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;


public class CheckPowerofFourTest {

    CheckPowerofFour obj;

    @Before
    public void setup() throws Exception{
        obj=new CheckPowerofFour();
    }

    @Test
    public void isPowerOfFour(){
        String answer=obj.isPowerOfFour(16);
        assertEquals("Yes",answer);

    }

    @Test
    public void isPowerOfFourFail(){
        String answer1=obj.isPowerOfFour(15);
        assertNotEquals("Yes",answer1);

    }
}
