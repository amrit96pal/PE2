package com.stackroute.pe2;

/**
 *Write a Java method to check if a given number is power of 4
 */

public class CheckPowerofFour {

    public String isPowerOfFour(int x){
        String answer1="No";
        int i=1;
        while(i<x){
            Double an=Math.pow(4,i);
            if(an==x){
                answer1="Yes";
                break;
            }
            i++;
        }
        return answer1;
    }
}
