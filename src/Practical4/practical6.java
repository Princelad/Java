package Practical4;

interface P1 {
    int c1 = 10;
    void
    displayP1();
}

interface P2 {
    int c2 = 20;
    void displayP2();
}

interface P12 extends P1, P2 {
    int c3 = 30;
    void displayP12();
}

class Q implements P12 {
    @Override
    public void displayP1() {
        System.out.println("Constant in P1 :" + c1);
    }
    @Override
    public void displayP2() {
        System.out.println("Constant in P2 :" + c2);
    }
    @Override
    public void displayP12() {
        System.out.println("Constant in P12 :" + c3);
    }
}

public class practical6 {
    public static void main(String[] args) {
        Q q = new Q();
        q.displayP1();
        q.displayP2();
        q.displayP12();
    }
}
