package Practical1;

import java.util.Scanner;

public class practical2 {
    public static void main(String[] args){
        int var;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value : ");
        var = scan.nextInt();
        System.out.printf("\"%d is the value of var\"\n",var);
        float var1 = var;
        System.out.printf("\"%f is the value of var\"",var1);
        scan.close();
        System.out.println("This Practical is made by 23CS037 - Prince lad ");

    }
}