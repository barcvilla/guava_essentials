package com.guava.ch02.utilities;

/**
 * Created by barcvilla on 04/01/2018.
 */
public class TraditionalEmployee
{
    public enum Gender{FEMALE, MALE};

    private final String lastName;
    private final String firstName;
    private final String employeerName;
    private final Gender gender;

    public TraditionalEmployee(final String lastName, final String firstName, final String employeerName, final Gender newGener)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.employeerName = employeerName;
        this.gender = newGener;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmployeerName() {
        return employeerName;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TraditionalEmployee that = (TraditionalEmployee) o;

        if (!lastName.equals(that.lastName)) return false;
        if (!firstName.equals(that.firstName)) return false;
        if (!employeerName.equals(that.employeerName)) return false;
        return gender == that.gender;
    }

    @Override
    public int hashCode() {
        int result = lastName.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + employeerName.hashCode();
        result = 31 * result + gender.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "TraditionalEmployee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", employeerName='" + employeerName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
