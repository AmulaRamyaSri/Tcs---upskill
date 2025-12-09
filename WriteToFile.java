package com.xyz;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C://Users//2788295//Documents//workspace-spring-tools-for-eclipse-4.32.2.RELEASE//practice//Demo.txt"); // creates file if not exists
            fw.write("Hello, this is a sample text written using File IO.\n");
            fw.write("Java FileWriter makes writing to files easy.");
            fw.close(); // close the stream
            System.out.println("Data written to file successfully!");
        } 
        catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
