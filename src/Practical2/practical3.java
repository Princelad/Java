package Practical2;

import java.util.Scanner;

public class practical3 {
    static boolean array_front9(int[] arr) {

        for(int i = 0; i < 4; i++){
            if(arr[i] != 9) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the size : ");
            int size = scan.nextInt();

            int[] arr = new int[size];

            System.out.print("Enter the array : ");
            for (int i = 0; i < size; i++) {
                arr[i] = scan.nextInt();
            }

            System.out.println("'9' in first 4 elements : " + array_front9(arr));

            scan.close();
            System.out.println("This Practical is made by 23CS037 - Prince lad ");
        }
    }
}
