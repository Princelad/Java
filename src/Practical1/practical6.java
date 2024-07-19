package Practical1;

import java.util.Scanner;

public class practical6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        num = scan.nextInt();

        int rem;
        int res = 0;

        while (num > 0) {
            rem = num % 10;
            res = (res * 10) + rem;
            num = num / 10;
        }

        System.out.println(res);

        scan.close();
        System.out.println("This Practical is made by 23CS037 - Prince lad ");
    }
}
