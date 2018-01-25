/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guava.ch03.functional;

import com.google.common.base.Function;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author barcvilla
 */
public class DateFormatFunction implements Function<Date, String>
{
    @Override
    public String apply(Date input)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        return dateFormat.format(input);
    }
}
