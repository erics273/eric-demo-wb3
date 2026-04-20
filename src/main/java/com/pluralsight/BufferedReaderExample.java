package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReaderExample {

    public static void main(String[] args) {




        try {
            //create the buffered reader
            BufferedReader theReader = new BufferedReader(new FileReader("src/main/resources/poem.txt"));

            //create a variable to hold the current line of the file until
            String currentLine;

            //loop over each line in the file until you run out of lines
            while((currentLine = theReader.readLine()) != null){

                //do something with each line (currentline)

                //print out the current line
                System.out.println(currentLine.toUpperCase());

            }

            //close the connection to the file
            theReader.close();

        } catch (Exception e) {
            System.out.println("could not find file");
        }


    }

}
