package com.example.dex.mvpexample;

/**
 * Created by dex on 30/3/18.
 */

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }
}
