package com.xyz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C://Users//2788295//Documents//workspace-spring-tools-for-eclipse-4.32.2.RELEASE//practice//Demo.txt")); // creates file if not exists"));
            String line;

            System.out.println("---- File Content ----");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } 
        catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}


