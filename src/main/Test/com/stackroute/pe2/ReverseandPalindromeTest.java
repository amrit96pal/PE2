package com.stackroute.pe2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class ReverseandPalindromeTest {

    ReverseandPalindrome obj;

    @Before
    public void setup() throws Exception{
        obj=new ReverseandPalindrome();
    }

    @Test
    public void Success(){
        String answer_rev=obj.reverse("1234q");
        String palin_succ="q4321";
        String answer_palin=obj.palindrome("qwerewq");
        String palin="Yes";
        assertEquals(palin,answer_palin);
        assertEquals(palin_succ,answer_rev);
    }



    @Test
    public void reverseFailure(){
        String answer_revfail=obj.palindrome("123");
        String rev="qwe";
        assertNotEquals(rev,answer_revfail);
    }



    @Test
    public void palindromeFailure(){

        String answer_palinfail=obj.palindrome("qwerewq");
        String palinrev="No";
        assertNotEquals(palinrev,answer_palinfail);

    }




}
