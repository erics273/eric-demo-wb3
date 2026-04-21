package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {

    public static void main(String[] args) {

        try {
            // create a FileWriter //use appent set to true if you want to append to the file instead of overwrting the contents
            FileWriter fileWriter = new FileWriter("src/main/resources/flaosdjlasdfklfadkj.txt");
            // create a BufferedWriter
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);
            // write to the file
            bufWriter.write("id|name|gross pay\n");
            bufWriter.write("111|Cameron Tay|3277.65\n");
            bufWriter.write("222|James Tee|2150.00\n");
            // close the writer
            bufWriter.close();
        } catch (Exception e) {
            System.out.println("ERROR: An unexpected error occurred");
            e.getStackTrace();
        }
    }

}

