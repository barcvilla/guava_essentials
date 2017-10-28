package com.guava.ch01;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by barcvilla on 13/10/2017.
 */
public class Test_Joiner
{
    public static void main(String[] args)
    {
        List<String> stringList = new ArrayList<>();
        stringList.add("uno");
        stringList.add("dos");
        stringList.add(null);
        stringList.add("tres");
        stringList.add(null);
        stringList.add("cuatro");
        stringList.add(null);
        stringList.add("cinco");

        // salta los nulos
       String join = Joiner.on('|').skipNulls().join(stringList);

        // reemplaza nulos con valor
        String join1 = Joiner.on('|').useForNull("no value").join(stringList);

        System.out.println(join);
        System.out.println(join1);
    }


}
