package com.guava.ch01;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by barcvilla on 27/10/2017.
 */
public class testMapJoiner
{
    public static void main(String[] args)
    {
        // Usamos LinkHashMap asi el orden original es preservado
        String expectedString = "Washington D.C=Redskins#New York City=Giants#Philadelphia=Eagles#Dallas=Cowboys";
        Map<String, String> testMap = Maps.newLinkedHashMap();
        testMap.put("Washington DC","Redkins");
        testMap.put("New York City","Giants");
        testMap.put("Philadelphia", "Eagles");
        testMap.put("Dallas", "Cowboys");
        String returnedString = Joiner.on("#").withKeyValueSeparator("=").join(testMap);
        System.out.println(returnedString);
    }
}
