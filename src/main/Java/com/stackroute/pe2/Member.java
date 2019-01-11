package com.stackroute.pe2;

/**
 * Create a class named Member with Name, age, Salary as its variable, write an other class named
 * Member Variable that creates an instance of the Member class, initialises its member variables,
 * and then displays the value of each member variable.
 *
 * Output:
 *
 * Members Name: Harry Potter
 *
 * Members Age: 30
 *
 * Members Salary: 2500.3
 */

public class Member {
    MemberVariable member =new MemberVariable();
    public String getNameOfMember(String name){
        member.setName(name);
        String answer= member.getName();
        return answer;
    }

    public int getAgeOfMember(int age){
        member.setAge(age);
        int ans= member.getAge();
        return ans;
    }

    public int getSalaryOfMember(int sal){
        member.setSalary(sal);
        int ans= member.getSalary();
        return ans;
    }
}
