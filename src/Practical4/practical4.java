package Practical4;

class A {
    static int x  = 10;

    void display() {
        System.out.println(x);
    }
}
class B extends A {
    int x = 20;
    void display() {
        System.out.println(x);
        System.out.println(A.x);
    }
}

public class practical4 {
    public static void main(String[] args) {
        B b = new B();
        b.display();

    }
}
