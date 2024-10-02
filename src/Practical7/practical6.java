package Practical7;

import java.util.LinkedList;

public class practical6 {
    // Shared buffer class to manage synchronization
    static class Buffer {
        private final LinkedList<Integer> list = new LinkedList<>();

        public void produce(int value) throws InterruptedException {
            synchronized (this) {
                int capacity = 5;
                while (list.size() == capacity) {
                    System.out.println("Buffer is full, producer is waiting...");
                    wait();
                }
                list.add(value);
                System.out.println("Produced: " + value);
                notifyAll(); // Notify all waiting threads (consumers)
            }
        }

        public void consume() throws InterruptedException {
            synchronized (this) {
                while (list.isEmpty()) {
                    System.out.println("Buffer is empty, consumer is waiting...");
                    wait();
                }
                int value = list.removeFirst();
                System.out.println("Consumed: " + value);
                notifyAll(); // Notify all waiting threads (producers)
            }
        }
    }

    // Producer class
    static class Producer implements Runnable {
        private final Buffer buffer;

        public Producer(Buffer buffer) {
            this.buffer = buffer;
        }

        @Override
        public void run() {
            int value = 0;
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    buffer.produce(value++);
                    Thread.sleep(1000); // Simulate production time
                }
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted");
                Thread.currentThread().interrupt();
            }
        }
    }

    // Consumer class
    static class Consumer implements Runnable {
        private final Buffer buffer;

        public Consumer(Buffer buffer) {
            this.buffer = buffer;
        }

        @Override
        public void run() {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    buffer.consume();
                    Thread.sleep(1500); // Simulate consumption time
                }
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted");
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();

        // Run for 10 seconds before stopping the threads for demonstration
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the threads to stop execution
        producerThread.interrupt();
        consumerThread.interrupt();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Producer and Consumer stopped.");
    }
}
