package com.pluralsight;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeApp {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the name of a story: ");
        String fileName  = scanner.nextLine().trim().toLowerCase().replace(" ", "_");
        fileName += ".txt";

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            int lineNumber = 1;
            while (line != null) {
                System.out.println(lineNumber + " " + line);
                line = bufferedReader.readLine();
                lineNumber++;

            }
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("Cannot find that story. Run the program again and check the spelling.");
//            e.printStackTrace();
        }
        scanner.close();
    }
}
