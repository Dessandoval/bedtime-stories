package com.pluralsight;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BedtimeApp {
    public static void main(String[] args)  {

        try {
            FileReader fileReader = new FileReader("goldilocks.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.out.println("Cannot find file.");
//            e.printStackTrace();
        }

    }
}
