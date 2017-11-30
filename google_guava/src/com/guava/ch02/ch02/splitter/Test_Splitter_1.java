package com.guava.ch02.ch02.splitter;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

/**
 * Created by barcvilla on 17/11/2017.
 */
public class Test_Splitter_1
{
    public static void main(String[] args)
    {
        String str = "a,,b,     c,,,d";
        Iterable<String> result = Splitter.on(',').split(str);
        // 1.
        System.out.println("-- start --");
        for(String s : result)
        {
            System.out.println(s);
        }
        System.out.println("-- end --");

        // 2. Ignorar cadena vacias
        result = Splitter.on(',').omitEmptyStrings().split(str);
        System.out.println("-- Start --");
        for(String s : result)
        {
            System.out.println(s);
        }
        System.out.println("-- end --");

        // 3. Aplicando Trim a casa string
        result = Splitter.on(',').omitEmptyStrings().trimResults().split(str);
        System.out.println("-- Start --");
        for(String s : result)
        {
            System.out.println(s);
        }
        System.out.println("-- end --");

        // 4. Limitar el numero de veces que se aplica el Split
        result = Splitter.on(',').omitEmptyStrings().trimResults().limit(3).split(str);
        System.out.println("-- Start --");
        for(String s : result)
        {
            System.out.println(s);
        }
        System.out.println("-- end --");

        // 5. Aplicar Trim a mas caracteres.
        String strs = "a,,b,  c1,,,d2  ";
        result = Splitter.on(',').omitEmptyStrings().trimResults(CharMatcher.digit()).trimResults().split(strs);
        System.out.println("-- Start --");
        for(String s : result)
        {
            System.out.println(s);
        }
        System.out.println("-- end --");

    }
}
