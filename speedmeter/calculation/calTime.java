package com.javarush.test.speedmeter.calculation;

import com.javarush.test.speedmeter.simulate;

/**
 * Created by exformat on 27.01.17.
 */
public class calTime
{
    public double calTime() throws Exception
    {
        simulate time = new simulate();
        double sec = time.time()/1000;
        return sec;
    }
}
