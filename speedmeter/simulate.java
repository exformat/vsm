package com.javarush.test.speedmeter;

import java.util.Date;

/**
 * Created by exformat on 27.01.17.
 */
public class simulate
{
    public double time() throws Exception
    {
        double rdn = (Math.random() * 100);
        Date dat1 = new Date();
        long msec1 = dat1.getTime();
        for (int a = 0; a < 150000000; a++)
        {
            int df = 456 * 8;
        }
        Date dat2 = new Date();
        long msec2 = dat2.getTime();
        double time = (msec2 - msec1) * 100 + rdn;
        return time;

    }
}
