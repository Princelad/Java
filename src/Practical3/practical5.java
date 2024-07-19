package Practical3;

import java.util.Scanner;

class areaRectangle {
    private final int length;
    private final int breadth;

    public areaRectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea() {
        return (length*breadth);
    }

}

public class practical5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int length = scan.nextInt();
        System.out.print("Enter the breadth : ");
        int breadth = scan.nextInt();
        areaRectangle area = new areaRectangle(length, breadth);
        System.out.println("Area : " + area.returnArea());
        scan.close();
    }
}
