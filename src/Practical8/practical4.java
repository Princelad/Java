package Practical8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class practical4 {
    public static void main(String[] args) throws FileNotFoundException {
        HashSet<String> keywords = getKeywords();

        // Reading the Java file
        File file = new File("C:\\Users\\Prince\\Documents\\Java Practicals\\src\\Practical8\\practical4.java");
        Scanner sc = new Scanner(file);

        // HashMap to store keyword counts
        HashMap<String, Integer> keywordCountMap = new HashMap<>();

        // Reading words and counting keywords
        while (sc.hasNext()) {
            String word = sc.next();
            // Check if the word is a keyword
            if (keywords.contains(word)) {
                keywordCountMap.put(word, keywordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        // Printing the keyword counts
        System.out.println("Keyword counts: " + keywordCountMap);
        sc.close();
    }

    private static HashSet<String> getKeywords() {
        String[] javaKeywords = {
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
                "const", "continue", "default", "do", "double", "else", "enum", "extends", "final",
                "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "null", "package", "private", "protected",
                "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized",
                "this", "throw", "throws", "transient", "try", "void", "volatile", "while", "true",
                "false"
        };
        // Add the keywords to the set
        return new HashSet<>(Arrays.asList(javaKeywords));
    }
}
