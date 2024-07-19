package Practical3;

import java.util.Scanner;

public class practical1 {
    static int toRupees(int pound) {
        return (100*pound);
    }
    
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the amount : ");
            int num = scan.nextInt();
            System.out.println("The amount in Rupees : " + toRupees(num));
            
            scan.close();
        }
    }
}
