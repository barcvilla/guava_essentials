package com.guava.ch02.CharMatcher;

import com.google.common.base.CharMatcher;

/**
 * Created by barcvilla on 07/12/2017.
 */
public class Test_CharMatcher
{
    public static void headerText(String headerText)
    {
        System.out.println("\n============================================");
        System.out.println(" " + headerText);
        System.out.println("\n============================================");
    }

    public static void demoGetDigitAndTextFromString()
    {
        String header = "Get digits and Text from a String";
        headerText(header);
        String cadena = "123123This Is Letter$%^&*()_12312";

        String digit = CharMatcher.digit().retainFrom(cadena);
        System.out.println("Get only digit from: " + cadena + " : " + digit);

        String digit1 = CharMatcher.digit().or(CharMatcher.whitespace()).retainFrom(cadena);
        System.out.println("Get digit plus space from: " + cadena + " : " + digit1);

        String text = CharMatcher.javaLetter().or(CharMatcher.whitespace()).retainFrom(cadena);
        System.out.println("Get only text from: " + cadena + " : " + text);
    }

    public static void demoRemoveTabs()
    {
        String header = "Remove whitespace from a string";
        headerText(header);
        String cadena = "String     with        spaces and         tabs";
        String text = CharMatcher.whitespace().trimAndCollapseFrom(cadena, ' ');
        System.out.println("Get text without tabs from: " + cadena + " : " + text);
    }

    public static void demoRemoveUpperAndLowerCase()
    {
        String header = "Remove Upper Case and Lower Case";
        headerText(header);
        String cadena = "THIS IS UPPER CASE story of my code by www.putracode.com";
        String upper = CharMatcher.javaUpperCase().removeFrom(cadena);
        String lower = CharMatcher.javaLowerCase().removeFrom(cadena);

        System.out.println("Remove uppder case from text: " + cadena + " : " + upper);
        System.out.println("Remove lower case from text: " + cadena + " : " + lower);
    }

    public static void demoCountingMatchingChar()
    {
        String header = "Count Matching Char";
        headerText(header);
        String cadena = "www.putracode.com awesome 123456";
        int countNumber = CharMatcher.digit().countIn(cadena);
        int countLetter = CharMatcher.javaLetter().is('w').countIn(cadena);

        System.out.println("Counting digits in cadena: " + cadena + " : " + countNumber);
        System.out.println("Counting letter w in cadena: " + cadena + " : " + countLetter);
    }

    public static void demoTrimLeadingSpaces()
    {
        String header = "Trim Leading Spaces";
        headerText(header);
        String leftTrimmedString = CharMatcher.whitespace().trimLeadingFrom("    Some String    "); //get "some string     "
        System.out.println("Trim leading spaced: " + leftTrimmedString);
    }

    public static void demoTrimTrailingSpaces()
    {
        String header = "Trim Trainling Spaces";
        headerText(header);
        String rightTrimmedString = CharMatcher.whitespace().trimTrailingFrom("     some string   "); // get "    some string"
        System.out.println("Trim trailing spaces: " + rightTrimmedString);
    }

    public static void demoTrillAllSpaces()
    {
        String header = "Trim all Spaces";
        headerText(header);
        String trimmedString = CharMatcher.whitespace().trimFrom("   some string    "); // get "some string"
        System.out.println("Trimmed al space: " + trimmedString);
    }

    public static void demoRemoveAllAsterisk()
    {
        String header = "Remove all Asterisk in a String";
        headerText(header);
        String stringWithoutAsterisk = CharMatcher.is('*')
                .removeFrom("** this is a comment ** will be ignored *");
        System.out.println("String with asterik: ** this is a comment ** will be ignored *");
        System.out.println("String without asterisk: " + stringWithoutAsterisk);
    }

    public static void demoObtainDigitsFromString()
    {
        String header = "Obtain Digits from String";
        headerText(header);
        String telephone = CharMatcher.inRange('0','9').retainFrom("$5454.20");
        System.out.println("The string is: $5454.20");
        System.out.println("Only digits: " + telephone);
    }

    public static void demoCollapseWhiteSpace()
    {
        String header = "Collapse whitespace to Dash";
        headerText(header);
        String address = "505 Williams Street";
        String addressWithDash = CharMatcher.whitespace().collapseFrom(address, '-');
        System.out.println(address);
        System.out.println(addressWithDash);
    }

    public static void main(String[] args)
    {
        demoGetDigitAndTextFromString();
        demoRemoveTabs();
        demoRemoveUpperAndLowerCase();
        demoCountingMatchingChar();
        demoTrimLeadingSpaces();
        demoTrimTrailingSpaces();
        demoTrillAllSpaces();
        demoRemoveAllAsterisk();
        demoObtainDigitsFromString();
        demoCollapseWhiteSpace();
    }
}
