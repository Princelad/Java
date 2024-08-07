package Practical4;

import java.util.Scanner;

interface shape {
    void capture();
}

interface sign {
    void text(String text);
}

class rectangle implements shape,sign {
    private final double width;
    private final double length;
    private final String color;

    public rectangle(double width, double length, String color, String text) {
        this.width = width;
        this.length = length;
        this.color = color;
        capture();
        text(text);
    }

    @Override
    public void capture() {
        System.out.printf("Rectangle is created for width = %.2f, length = %.2f and color = %s.\n", width, length, color);
    }

    @Override
    public void text(String text) {
        System.out.println("Rectangle is created for text = " + text);
    }
}

class circle implements shape,sign {
    private final double radius;
    private final String color;

    public circle(double radius, String color, String text) {
        this.radius = radius;
        this.color = color;
        capture();
        text(text);
    }

    @Override
    public void capture() {
        System.out.printf("Circle is created for radius = %.2f, color = %s.\n", radius, color);
    }

    @Override
    public void text(String text) {
        System.out.println("Circle is created for text = " + text);
    }
}

public class practical7 {

    static void menu() {
        System.out.println("Choose :");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do{
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
                    String text = sc.next();
                    new rectangle(width, length, color, text);
                }
                case 2 -> {
                    System.out.println("Enter the radius of the circle: ");
                    double radius = sc.nextDouble();
                    System.out.println("Enter the color of the circle: ");
                    String color = sc.next();
                    System.out.println("Enter the text of the sign: ");
                    String text = sc.next();
                    new circle(radius, color, text);
                }
                case 3 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice");
            }
        }while(choice != 3);

        sc.close();
    }
}
