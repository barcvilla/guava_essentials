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

    //isNullOrEmpty

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

    public static void main(String[] args)
    {
        demoIsNullOrEmpty();
    }
}
