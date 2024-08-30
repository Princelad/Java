package Practical6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class practical2 {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("C:\\Users\\Prince\\Documents\\Java Practicals\\src\\Practical6\\sample.txt");
             Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the character to count: ");
            char countChar = scanner.next().charAt(0);

            int count = 0;
            int character;

            while ((character = fileReader.read()) != -1) {
                if (character == countChar) {
                    count++;
                }
            }

            System.out.printf("The number of occurrences of the character '%c' in the file is %d.\n", countChar, count);

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please ensure the file path is correct.");
        } catch (IOException e) {
            System.out.println("Error reading file. Please try again.");
        }
    }
}
