package com.stackroute.pe2;

/**
 * Write a Java method to Reverse the given input & Check if it is a Palindrome
 */
public class ReverseandPalindrome {

    public String reverse(String inp){
        String stringinp=inp;
        String reverse = "";
        for(int i = stringinp.length() - 1; i >= 0; i--)
        {
            reverse = reverse + stringinp.charAt(i);
        }
        return reverse;
    }

    public String palindrome(String input){
        String answer="";
        String reversed="";
        int n = input.length();
        for(int i = n - 1; i >= 0; i--)
        {
            reversed = reversed + input.charAt(i);
        }
        if(input.equalsIgnoreCase(reversed))
        {
            answer="Yes";
        }
        else
        {
            answer="No";
        }
        return answer;
    }
}
