package com.xyz;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Readfromfiles {

    public static void main(String[] args) {

        try {
            // Reading file through FileInputStream
            FileInputStream fis = new FileInputStream("C://Users//2788295//Documents//workspace-spring-tools-for-eclipse-4.32.2.RELEASE//practice//Demo.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String line;

            System.out.println("\n--- File Content (Using FileInputStream) ---");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            isr.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}

/*
  package File.java;
import java.io.FileReader;

public class ReadwithFile {
	public static void main(String[] args) {
		String filepath = "C:\\Users\\2790963\\Documents\\workspace-spring-tools-for-eclipse-4.32.2.RELEASE\\JAVA\\src\\File\\java\\Demo.txt";
		try(FileReader fr = new FileReader(filepath)){ 
			int ch;
			while((ch=fr.read())!= -1) {
				System.out.print((char)ch);
			}
		}
		catch(Exception e) {
			System.out.println("Error: " +e.getMessage());
		}
	}
	
  
  */
