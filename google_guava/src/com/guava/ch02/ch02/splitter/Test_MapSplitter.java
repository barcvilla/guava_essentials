package com.guava.ch02.ch02.splitter;

import com.google.common.base.Splitter;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by barcvilla on 17/11/2017.
 */
public class Test_MapSplitter
{
    /**
     * MapSplitter class toma un string donde la clave y el valor estan delimitados con un valor y retorna una instancia Map
     * con las entradas en el mismo orden que el string dado
     * @param args
     */
    public static void main(String[] args)
    {
        String startString = "Washington D.C=Redskins#New York City=Giants#Philadelphia=Eagles#Dallas=Cowboys";
        Map<String, String> testMap = Maps.newLinkedHashMap();

        // creamos el objeto base Splitter y luego especificamos el delimitador que el MapSplitter usa para separar el key/value
        Splitter.MapSplitter mapSplitter = Splitter.on("#").withKeyValueSeparator("=");
        Map<String, String> splitMap = mapSplitter.split(startString);
        System.out.println(splitMap);
    }
}
