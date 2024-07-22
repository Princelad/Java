package Practical4;

class Degree {
    void getDegree() {
        System.out.println("I got a degree.");
    }
}

class Undergraduate extends Degree {
    void getDegree() {
        System.out.println("I am a Undergraduate.");
    }
}
class Postgraduate extends Degree {
    void getDegree() {
        System.out.println("I am a Postgraduate.");
    }
}

public class practical5 {
    public static void main(String[] args) {
        Degree d1 = new Degree();
        d1.getDegree();
        Undergraduate d2 = new Undergraduate();
        d2.getDegree();
        Postgraduate d3 = new Postgraduate();
        d3.getDegree();
    }
}
