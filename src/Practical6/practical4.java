package Practical6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class practical4 {
    public static void main(String[] args) {
        try (FileWriter copyFile = new FileWriter("C:\\Users\\Prince\\Documents\\Java Practicals\\src\\Practical6\\sampleCopy.txt")) {
            File file = new File("C:\\Users\\Prince\\Documents\\Java Practicals\\src\\Practical6\\sample.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                copyFile.write(line + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
