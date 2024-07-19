package Practical4;

import java.util.Scanner;

class Rectangle {
    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return this.length * this.breadth;
    }

    public int perimeter() {
        return (2 * (this.length + this.breadth));
    }
}

class Square extends Rectangle {
    public Square(int length, int breadth) {
        super(length, breadth);
    }
}

public class practical3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square[] squares = new Square[2];

        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        squares[0] = new Square(length, breadth);
        System.out.println("Area of rectangle is " + squares[0].area());
        System.out.println("Perimeter of rectangle is " + squares[0].perimeter());

        System.out.println("Enter the side of square: ");
        int side = sc.nextInt();

        squares[1] = new Square(side, side);
        System.out.println("Area of square is " + squares[1].area());
        System.out.println("Perimeter of square is " + squares[1].perimeter());
    }
}
