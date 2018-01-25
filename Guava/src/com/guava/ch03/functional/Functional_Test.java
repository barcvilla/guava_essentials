/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guava.ch03.functional;

import java.util.Date;

/**
 *
 * @author barcvilla
 */
public class Functional_Test 
{
    public static void DateFormatDemo()
    {
        DateFormatFunction dff = new DateFormatFunction();
        System.out.println(dff.apply(new Date(25/01/2018)));
    }
    
    public static void main(String[] args) {
        DateFormatDemo();
    }
}
