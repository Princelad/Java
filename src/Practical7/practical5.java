package Practical7;

public class practical5 extends Thread {
    @Override
    public void run() {}

    public static void main(String[] args) {
        practical5 FIRST = new practical5();
        practical5 SECOND = new practical5();
        practical5 THIRD = new practical5();

        FIRST.setPriority(3);
        SECOND.setPriority(5);
        THIRD.setPriority(7);

        System.out.println("Priority of the FIRST is: " + FIRST.getPriority());
        System.out.println("Priority of the SECOND is: " + SECOND.getPriority());
        System.out.println("Priority of the THIRD is: " + THIRD.getPriority());
    }
}
