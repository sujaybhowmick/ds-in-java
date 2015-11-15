package com.ds.tree;

/**
 * Created by Sujay on 16/11/2015.
 */
public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int compareTo(Student o) {
        return this.firstName.compareTo(o.firstName);
    }

    @Override
    public String toString() {
        return this.firstName + ", " + this.lastName;
    }
}
