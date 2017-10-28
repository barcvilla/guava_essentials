package com.guava.ch01;

import com.google.common.base.Joiner;

/**
 * Created by barcvilla on 27/10/2017.
 */
public class Joiner_StringBuilder
{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Joiner jn = Joiner.on("|").skipNulls();

        // retornamos una instancia de stringbuilder con los valores foo, bar, baz añadimos el simbolo "|" como delimitador
        System.out.println(jn.appendTo(sb, "foo", "bar", "baz"));

    }
}
