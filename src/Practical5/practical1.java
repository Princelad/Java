package Practical5;

import java.util.Scanner;

public class practical1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for x :");
        int x = sc.nextInt();
        System.out.println("Enter the value for y :");
        int y = sc.nextInt();
        int div = 0;
        try {
            div = x / y;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println(div);
    }
}
