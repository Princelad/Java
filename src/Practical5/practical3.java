package Practical5;

import java.io.*;

public class practical3 {

    public static void method() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        System.out.println("rest of the code...");
    }
} 