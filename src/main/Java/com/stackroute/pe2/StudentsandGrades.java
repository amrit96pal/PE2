package com.stackroute.pe2;

/**
 *  Write a program, which reads number of students and n grades as input
 *  (of int between 0 and 100, inclusive) and displays the average, minimum and maximum.
 *  Your program shall check for valid input. You should keep all the grades in an int[] and
 *  use a method for each of the computations.
 *
 *  Output:
 *
 * Enter the number of students: 4
 *
 * Enter the grade for student 1: 86
 *
 * Enter the grade for student 2: 65
 *
 * Enter the grade for student 3: 98
 *
 * Enter the grade for student 4: 77
 *
 * The average is 81.50
 *
 * The minimum is 65
 *
 * The maximum is 98
 */

public class StudentsandGrades {

    public int numberOfStudents(int inp){
        int array[]= new int[inp];
        return  array.length;
    }

    public int[] grades_of_students(int[] inp){
        int[] grades=new int[inp.length];
        grades=inp;
        return grades;
    }

    public Double average(int[] inp){
        double avg=0;
        for(int i=0;i<inp.length;i++){
            avg+=inp[i];
        }
        Double average=avg/inp.length;
        return average;
    }

    public int minimum(int[] inp){
        int min=inp[0];
        for(int i=0;i<inp.length;i++){
            if(inp[i]<min){
                min=inp[i];
            }
        }
        return min;
    }

    public int maximum(int[] inp){
        int max=inp[0];
        for(int i=0;i<inp.length;i++){
            if(inp[i]>max){
                max=inp[i];
            }
        }
        return max;
    }

}
