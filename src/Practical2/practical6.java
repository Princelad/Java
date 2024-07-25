package Practical2;

import java.util.Arrays;
import java.util.Scanner;

public class practical6 {
    static String sortString(String str) {
        char[] charStr = str.toCharArray();

        Arrays.sort(charStr);

        return new String(charStr);
    }

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the string : ");
            String str = scan.nextLine();
            StringBuilder nstr = new StringBuilder(str);

            System.out.println("Length of the string : " + str.length());
            System.out.println("Lowercase of the string : " + str.toLowerCase());
            System.out.println("Uppercase of the string : " + str.toUpperCase());
            System.out.println("Reverse of the string : " + nstr.reverse());
            System.out.println("Sort the string : " + sortString(str));

            scan.close();
            System.out.println("This Practical is made by 23CS037 - Prince lad ");
        }
    }
}
