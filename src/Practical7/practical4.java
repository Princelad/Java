package Practical7;

public class practical4 extends Thread {

    @Override
    public void run() {
        int number = 0;
        while (true) {
            System.out.println("Number : " + number);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            number++;
        }
    }

    public static void main(String[] args) {
        practical4 obj = new practical4();
        obj.start();
    }
}
