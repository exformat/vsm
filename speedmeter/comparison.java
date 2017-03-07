package com.javarush.test.speedmeter;

import com.javarush.test.speedmeter.calculation.formatDouble;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by exformat on 28.01.17.
 */
public class comparison
{


    public double comp() throws Exception
    {
        formatDouble speed = new formatDouble();//yydthehethethethth

        String spd = speed.formatD();
        String lastMax = readLastMaxSpeed();

        double kmH = Double.parseDouble(spd);
        double LastMaxSpeed = Double.parseDouble(lastMax);//dfsdgsgf

        //запись новой максимальной скорости
        if (kmH>LastMaxSpeed)
        {
            {
                try (PrintWriter writer = new PrintWriter("/home/exformat/IdeaProjects/JavaRushHomeWork/src/com/javarush/test/speedmeter/res/savemaxspeed"))
                {
                    // запись всей строки
                    writer.write(spd);
                    writer.flush();
                    writer.close();
                }
                catch (IOException ex)
                {

                    System.out.println(ex.getMessage());
                }
            }
        }
        return kmH;
    }

    public String readLastMaxSpeed() throws Exception

    {

        String fileName = "/home/exformat/IdeaProjects/JavaRushHomeWork/src/com/javarush/test/speedmeter/res/savemaxspeed";

        // читаем файл с помощью Scanner
        String lastMaxSpeed = readMaxSpeed1(fileName);
        return lastMaxSpeed;
    }


    // читаем файл с помощью Scanner
    public static String readMaxSpeed1(String fileName) throws IOException
    {
        Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
        //здесь мы можем использовать разделитель, например: "\\A", "\\Z" или "\\z"
        String data = scanner.useDelimiter(" ").next();
        scanner.close();
        return data;
    }
}