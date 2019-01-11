package com.stackroute.pe2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class MemberVariableTest {

    Member mem;

    @Before
    public void setup() throws Exception{
        mem =new Member();
        MemberVariable mv=new MemberVariable();
    }


    @Test
    public void getNameSuccess(){
        String name="amrit";
        assertEquals(name, mem.getNameOfMember("amrit"));

    }

    @Test
    public void getNameFail(){

        String namefail="amrit";
        assertNotEquals(namefail, mem.getNameOfMember("amt"));

    }

    @Test
    public void getSalarySuccess(){
        int salary=50000;
        assertEquals(salary, mem.getSalaryOfMember(50000));

    }

    @Test
    public void getSalaryFailure(){
        int salaryfail=5000;
        assertNotEquals(salaryfail, mem.getSalaryOfMember(50000));

    }

    @Test
    public void getAgeSuccess(){
        int age=30;
        assertEquals(age, mem.getAgeOfMember(30));


    }

    @Test
    public void getAgeFail(){
        int agefail=30;
        assertNotEquals(agefail, mem.getAgeOfMember(300));
    }



}
