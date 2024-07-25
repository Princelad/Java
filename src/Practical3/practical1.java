package Practical3;

import java.util.Scanner;

public class practical1 {
    static int toRupees(int pound) {
        return (100 * pound);
    }// returning the answer according to the problem.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        int pound = scan.nextInt();// Scanning the Amount of money in pound.
        System.out.println("The amount in Rupees : " + toRupees(pound));

        scan.close();
    }
}
