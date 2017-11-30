package com.guava.ch02.strings;

import com.google.common.base.Strings;
/**
 * Demostracion basica del uso de la clase com.google.common.base.Strings en Google Guava
 */
public class Test_Strings
{
    /**
     * Imprime como cabecera la operacion a realizarse
     */
    public static void printHeader(final String headerText)
    {
        System.out.println("\n====================================================");
        System.out.println("= " + headerText);
        System.out.println("\n====================================================");
    }

    // 1. isNullOrEmpty

    /**
     * Imprime via salida standard una cadena indicando si la cadena provista es null o empty o not null o empty
     * Este metodo utiliza Strings.isNullOrEmpty(String)
     * @param string
     */
    private static void printStringStatusNullOrEmpty(final String string)
    {
        if(Strings.isNullOrEmpty(string))
        {
            System.out.println("La cadena " + string + " ES null or Empty" );
        }
        else
        {
            System.out.println("La cadena " + string + " NO es null or empty");
        }
    }

    /**
     * Demuestra google guava method Strings.isNullOrEmpty(String) con una cadena de ejemplo
     */
    public static void demoIsNullOrEmpty()
    {
        printHeader("Strings.isNullOrEmpty(String)");
        printStringStatusNullOrEmpty("Dusting");
        printStringStatusNullOrEmpty(null);
        printStringStatusNullOrEmpty("");
    }

    // 2. nullToEmpty and emptyToNull

    /**
     * Imprime via salida standard  un simple mensaje que indica la cadena original provista y la cadena de salida provista
     */
    private static void printOriginalAndResult(final String originalString, final String resulting, final String operation)
    {
        System.out.println("Pasando '" + originalString + "' hacia '" + operation + "' produce '" + resulting + "'");
    }

    /**
     * Demostracion el metodo Strings.emptyToNull()
     */
    public static void demoEmptyToNull()
    {
        final String operation = "Strings.emptyToNull(String)";
        printHeader("operation");
        printOriginalAndResult("Dusting", Strings.emptyToNull("Dusting"), operation);
        printOriginalAndResult(null, Strings.emptyToNull(null), operation);
        printOriginalAndResult("", Strings.emptyToNull(""), operation);
    }

    /**
     * Demostracion del metodo Strings.nullToEmpty
     */
    public static void demoNullToEmpty()
    {
        final String operation = "Strings.nullToEmpty(String)";
        printHeader(operation);
        printOriginalAndResult("Dusting", Strings.nullToEmpty("Dusting"), operation);
        printOriginalAndResult(null, Strings.nullToEmpty(null), operation);
        printOriginalAndResult("", Strings.nullToEmpty(""), operation);
    }

    // 3. padStart
    public static void demoPadStart()
    {
        final String operation = "Strings.padStart(String, int, char)";
        printHeader(operation);
        printOriginalAndResult("Dusting", Strings.padStart("Dusting", 10, '_'), operation);
        printOriginalAndResult("", Strings.padStart("", 10, '_'), operation);
    }

    // 4. padEnd
    public static void demoPadEnd()
    {
        final String operation = "Strings.padEnd()";
    }

    public static void main(String[] args)
    {
        demoIsNullOrEmpty();
        demoEmptyToNull();
        demoNullToEmpty();
        demoPadStart();
    }
}
