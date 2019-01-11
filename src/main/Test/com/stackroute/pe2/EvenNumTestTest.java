package com.stackroute.pe2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EvenNumTestTest {

    EvenNumTest obj;

    @Before
    public void setup() throws Exception{
        obj=new EvenNumTest();
    }


    @Test
    public void isEvenTest(){
        Boolean test=true;
        Boolean answer=obj.isEven(4);
        assertEquals(test,answer);

    }

    @Test
    public void isEvenTestFailure(){
        Boolean test=true;
        Boolean answer=obj.isEven(5);
        assertNotEquals(test,answer);

    }
}
