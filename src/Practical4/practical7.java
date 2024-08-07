package Practical4;

import java.util.Scanner;

interface Shape {
    void capture();
}

interface Sign {
    default void text(String text){
        System.out.println("Text on the sign: " + text);
    }
}

class rectangleSign implements Shape, Sign {
    private final double width;
    private final double length;
    private final String color;

    public rectangleSign(double width, double length, String color, String text) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.capture();
        this.text(text);
    }

    @Override
    public void capture() {
        System.out.printf("Rectangle is created with width = %.2f, length = %.2f and color = %s.\n", width, length, color);
    }
}

class circleSign implements Shape, Sign {
    private final double radius;
    private final String color;

    public circleSign(double radius, String color, String text) {
        this.radius = radius;
        this.color = color;
        this.capture();
        this.text(text);
    }

    @Override
    public void capture() {
        System.out.printf("Circle is created with radius = %.2f and color = %s.\n", radius, color);
    }
}

public class practical7 {

    static void menu() {
        System.out.println("Choose:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            menu();
            choice = sc.nextInt();

            switch(choice) {
                case 1 -> {
                    System.out.println("Enter the width of the rectangle: ");
                    double width = sc.nextDouble();
                    System.out.println("Enter the length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.println("Enter the color of the rectangle: ");
                    String color = sc.next();
                    System.out.println("Enter the text of the sign: ");
                    sc.nextLine();  // Consume newline left-over
                    String text = sc.nextLine();
                    new rectangleSign(width, length, color, text);
                }
                case 2 -> {
                    System.out.println("Enter the radius of the circle: ");
                    double radius = sc.nextDouble();
                    System.out.println("Enter the color of the circle: ");
                    String color = sc.next();
                    System.out.println("Enter the text of the sign: ");
                    sc.nextLine();  // Consume newline left-over
                    String text = sc.nextLine();
                    new circleSign(radius, color, text);
                }
                case 3 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 3);

        sc.close();
    }
}
