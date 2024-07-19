package Practical1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class practical5 {

    public static void generateHeader() {
        
        System.out.println("=*****************=Bill=****************=");
    
        System.out.println("* Name\t\t\t\tPrice\t*");

    }
    
    public static void generateBill(int price, float tax, String item) {

        System.out.println("* " + item + "\t\t\t\t" + (price + (price*(tax/100))) + "\t*");    

    }

    public static void generateFooter() {

        System.out.println("*****************************************");

    }

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int key;
            Map<Integer, String> hm = new HashMap<>();
            hm.put(1, "Motor");
            hm.put(2, "Fan");
            hm.put(3, "Tube light");
            hm.put(4, "Wires");
            hm.put(5, "Other items");
            int[] prices = { 50, 100, 80, 10, 50 };

            System.out.println("Enter the item to be purchased :");
            System.out.println("[1] Motor");
            System.out.println("[2] Fan");
            System.out.println("[3] Tube light");
            System.out.println("[4] Wires");
            System.out.println("[5] Other items");
            
            System.out.print("Enter your choice :");
            key = scan.nextInt();
            
            generateHeader();

            switch (key) {
                case 1 -> generateBill(prices[0], 8f, hm.get(key));
                
                case 2 -> generateBill(prices[1], 12f, hm.get(key));
                
                case 3 -> generateBill(prices[2], 5f, hm.get(key));
                
                case 4 -> generateBill(prices[3], 7.5f, hm.get(key));
                
                case 5 -> generateBill(prices[4], 3f, hm.get(key));
                
                default -> {
                    System.out.println("Enter proper input.");
                    main(args);
                }
            }
            
            generateFooter();

            scan.close();

            System.out.println("This Practical is made by 23CS037 - Prince lad ");
        }
    }
}
