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

    public static void main(String[] args)
    {
        demoGetDigitAndTextFromString();
        demoRemoveTabs();
        demoRemoveUpperAndLowerCase();
        demoCountingMatchingChar();
    }
}
