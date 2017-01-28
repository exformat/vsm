package com.javarush.test.speedmeter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by exformat on 27.01.17.
 */
public class enterData
{
    public double eData() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double R = Double.parseDouble(reader.readLine());
        return R;
    }
}
