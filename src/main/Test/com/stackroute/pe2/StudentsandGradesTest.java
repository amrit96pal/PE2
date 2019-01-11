package com.stackroute.pe2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class StudentsandGradesTest {

    StudentsandGrades obj;

    @Before
    public void setup() throws Exception{
        obj=new StudentsandGrades();
    }

    @Test
    public void StudentsNumberPositive(){
        int answer=5;
        int student_number=obj.numberOfStudents(answer);
        assertEquals(answer,student_number);
    }


    @Test
    public void gradesWithinRangeSuccess(){
        int[] grades={66,78,89,54,55};
        int student_grades[]=obj.grades_of_students(grades);
        assertEquals(grades,student_grades);

    }


    @Test
    public void averageSuccess(){
        int[] grades={50,50,50,50,50};
        Double avg=50.0;
        Double average=obj.average(grades);
        assertEquals(avg,average);



    }
    @Test
    public void averageFailure(){
        int[] grades={50,50,50,50,50};
        Double avg=40.0;
        Double average=obj.average(grades);
        assertNotEquals(avg,average);

    }

    @Test
    public void minimumSuccess(){
        int[] grades={50,40,50,50,50};
        int min=40;
        int minimum=obj.minimum(grades);
        assertEquals(min,minimum);

    }

    @Test
    public void minimumFailure(){
        int[] grades={50,40,50,50,50};
        int min=30;
        int minimum=obj.minimum(grades);
        assertNotEquals(min,minimum);

    }

    @Test
    public void maximumSuccess(){
        int[] grades={50,40,50,50,70};
        int max=70;
        int maximum=obj.maximum(grades);
        assertEquals(max,maximum);

    }

    @Test
    public void maximumFailure(){
        int[] grades={50,40,50,50,70};
        int max=50;
        int maximum=obj.maximum(grades);
        assertNotEquals(max,maximum);

    }



}

