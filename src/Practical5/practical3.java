package Practical5;

import java.io.*;

public class practical3 {

    public static void method() throws FileNotFoundException {

        FileReader file = new FileReader("C:\\Users\\Prince\\Desktop\\abc.txt");
        BufferedReader fileInput = new BufferedReader(file);

        if(fileInput == null) {
            throw new FileNotFoundException();
        }
    }

    //main method  
    public static void main(String args[]) {
        try {
            method();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        System.out.println("rest of the code...");
    }
} 