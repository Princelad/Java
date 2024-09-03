package Practical6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class practical3 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\Prince\\Documents\\Java Practicals\\src\\Practical6\\sample.txt");
            Scanner fileReader = new Scanner(file);
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter the word to be searched: ");
            String word = scan.next();

            Integer lines = 0;  // Using Integer wrapper class instead of int
            boolean wordFound = false;

            while (fileReader.hasNextLine()) {
                lines++;
                String line = fileReader.nextLine();
                if (line.contains(word)) {  // Using contains() to find the word within the line
                    System.out.printf("The word was found on line %d%n", lines);
                    wordFound = true;
                }
            }

            if (!wordFound) {
                System.out.println("The word was not found in the file.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
