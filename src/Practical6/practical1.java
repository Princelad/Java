package Practical6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class practical1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No files provided as arguments.");
            return;
        }

        for (String fileName : args) {
            try {
                int lines = countLinesInFile(fileName);
                System.out.printf("The number of lines in %s is %d\n", fileName, lines);
            } catch (IOException e) {
                System.out.printf("Error reading file %s: %s\n", fileName, e.getMessage());
            } catch (Exception e) {
                System.out.printf("Unexpected error occurred with file %s: %s\n", fileName, e.getMessage());
            }
        }
    }

    private static int countLinesInFile(String fileName) throws IOException {
        int lines = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.readLine() != null) {
                lines++;
            }
        }
        return lines;
    }
}
