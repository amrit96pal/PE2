package com.stackroute.pe2;

public class MemberVariable {

    private String Name="";
    private int Age;
    private int Salary;

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getSalary() {
        return Salary;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) { Age = age;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
