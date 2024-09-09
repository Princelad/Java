package Practical7;

class A implements Runnable {
    A(){
        Thread t1 = new Thread(this);
        t1.start();
    }
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}

public class practical1 {
    public static void main(String[] args) {
        new A();
    }
}