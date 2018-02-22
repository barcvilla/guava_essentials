/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guava.math;

import com.google.common.math.IntMath;

/**
 *
 * @author barcvilla
 */
public class InMathTest 
{
    public static void checkedAddDemo()
    {
        System.out.println("Using InMath.checkedAdd: " + IntMath.checkedAdd(15, 10));       
    }
    
    public static void main(String[] args)
    {
        checkedAddDemo();
    }
}
