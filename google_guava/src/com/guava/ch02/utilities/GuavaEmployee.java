package com.guava.ch02.utilities;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * Created by barcvilla on 04/01/2018.
 */
public class GuavaEmployee
{
    public enum Gender{FEMALE, MALE};

    private final String lastName;
    private final String firstName;
    private final String employerName;
    private final Gender gender;

    public GuavaEmployee(final String lastName, final String firstName, final String employerName, final Gender newGender)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.employerName = employerName;
        this.gender = newGender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmployerName() {
        return employerName;
    }

    public Gender getGender() {
        return gender;
    }

    /**
     * Usamos Google Guava Objects class para comparar dos objeto y ver su igualdad
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
        {
            return false;
        }
        if(getClass() != obj.getClass())
        {
            return false;
        }
        GuavaEmployee other = (GuavaEmployee)obj;
        return Objects.equal(this.lastName, other.lastName) &&
                Objects.equal(this.firstName, other.firstName) &&
                Objects.equal(this.employerName, other.employerName) &&
                Objects.equal(this.gender, other.gender);
    }

    /**
     * Usamos Google Guava Objects class para generar hash code del objeto instanciado
     */
    @Override
    public int hashCode()
    {
        return Objects.hashCode(this.lastName, this.firstName, this.employerName, this,gender);
    }

    /**
     * Usamos Google Guava Objects para hacer una representacion String de la instancia
     */
    @Override
    public String toString()
    {
        return MoreObjects.toStringHelper(this)
                .add("Last Name: ", getLastName())
                .add("First Name: ", getFirstName())
                .add("Employer Name: ", getEmployerName())
                .add("Gender: ", getGender())
                .toString();
    }
}
