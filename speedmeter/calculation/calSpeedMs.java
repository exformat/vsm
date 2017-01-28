package com.javarush.test.speedmeter.calculation;

/**
 * Created by exformat on 27.01.17.
 */
public class calSpeedMs
{
    public double calSpeedms() throws Exception
    {
        calLength Length = new calLength();
        calTime time = new calTime();
        double Lng = Length.callength();
        double milliSec = time.calTime();
        double metrSec = Lng / milliSec;
        return metrSec;
    }
}
