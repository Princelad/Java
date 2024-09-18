package Practical7;

import java.util.Random;

class MyThread extends Thread {
    int num = new Random().nextInt(100);

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Number : " + num + "\n");

        if (num % 2 == 0) {
            square sq = new square(num);
            sq.start();
        } else {
            cube c = new cube(num);
            c.start();
        }
    }
}

class square extends Thread {
    int num;

    square(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Number : " + (num*num) + "\n");
    }
}

class cube extends Thread {
    int num;

    cube(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Number : " + (num*num*num) + "\n");
    }
}

public class practical3 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}
