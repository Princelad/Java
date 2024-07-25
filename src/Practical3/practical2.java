package Practical3;

class TriangleArea {
    private double radius;
    private int base;
    private int height;

    // A No-argument constructor.
    public TriangleArea() {
        this.radius = 0;
        this.base = 0;
        this.height = 0;
    }

    // A Parameterized Constructor
    public TriangleArea(double radius) {
        this.radius = radius;
    }
    public TriangleArea(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }
}

public class practical2 {
    public static void main(String[] args) {
        // Instantiating three objects for the showcase.
        TriangleArea t = new TriangleArea(2.4);
        System.out.println("The radius of the triangle is " + t.getRadius());
        System.out.println("The base of the triangle is " + t.getBase());
        System.out.println("The height of the triangle is " + t.getHeight());

        TriangleArea t2 = new TriangleArea(2, 4);

        System.out.println("The radius of the triangle is " + t2.getRadius());
        System.out.println("The base of the triangle is " + t2.getBase());
        System.out.println("The height of the triangle is " + t2.getHeight());

        TriangleArea t3 = new TriangleArea();
        System.out.println("The radius of the triangle is " + t3.getRadius());
        System.out.println("The base of the triangle is " + t3.getBase());
        System.out.println("The height of the triangle is " + t3.getHeight());

    }
}

