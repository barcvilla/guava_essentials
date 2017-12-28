package com.guava.ch02.Preconditions;

import static java.lang.System.err;
import static com.google.common.base.Preconditions.*;

/**
 * Created by barcvilla on 28/12/2017.
 */
public class Test_Preconditions
{
    private final boolean initialized = false;

    public static void printHeader(String newHeaderText)
    {
        err.println("\n========================================================");
        err.println(newHeaderText);
        err.println("========================================================");
    }

    public void testForNullArgument(String parameter)
    {
        String localParameter = checkNotNull(parameter, "Provied paramter is unacceptable null");
    }

    public void testDivisorNotZero(int divisor)
    {
        checkArgument(divisor != 0, "Zero divisor not allowed");
    }

    public void testArrayElement(String[] strArray, int indexNumber)
    {
        int index = checkElementIndex(indexNumber, strArray.length, "String array index number");
    }

    public void testArrayPosition(String[] strArray, int indexNumber)
    {
        int index = checkPositionIndex(indexNumber, strArray.length, "String array index number");
    }

    public void testState()
    {
        checkState(this.initialized, "cannot perform action because not initialized");
    }

    public static void main(String[] args) {
        Test_Preconditions pc = new Test_Preconditions();

        printHeader("Preconditions.checkNotNull");

        try
        {
            pc.testForNullArgument(null);
        }
        catch(NullPointerException ex)
        {
            ex.printStackTrace();
        }

        printHeader("Precoditions.checkArguments");
        try
        {
            pc.testDivisorNotZero(0);
        }
        catch(IllegalArgumentException ex)
        {
            ex.printStackTrace();
        }

        printHeader("Preconditions.checkElementIndex");
        try
        {
            pc.testArrayElement(new String[]{"Dusting", "Java"}, 3);
        }
        catch(IndexOutOfBoundsException ex)
        {
            ex.printStackTrace();
        }

        printHeader("Preconditions.checkPositionIndex");
        try
        {
            pc.testArrayPosition(new String[]{"Dusting", "Java"}, 3);
        }
        catch(IndexOutOfBoundsException ex)
        {
            ex.printStackTrace();
        }

        printHeader("Preconditions.checkSate");
        try
        {
            pc.testState();
        }
        catch(IllegalStateException ex)
        {
            ex.printStackTrace();
        }

    }
}
