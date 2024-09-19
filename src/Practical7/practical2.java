package Practical7;

public class practical2 extends Thread {

    private final int start;
    private final int end;
    private static int totalSum = 0;
    private static final Object lock = new Object();

    public practical2(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        int sum = 0;
        // Calculate the sum of numbers in this thread's range
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        // Add this partial sum to the total sum in a synchronized block
        synchronized (lock) {
            totalSum += sum;
        }
    }

    public static void main(String[] args) {
        try {
            int number = Integer.parseInt(args[0]); // Total number N
            int numberOfThreads = Integer.parseInt(args[1]); // Number of threads

            // Calculate how many numbers each thread should sum
            int divisionSize = number / numberOfThreads;
            int remainder = number % numberOfThreads;

            // Create and start the threads
            Thread[] threads = new Thread[numberOfThreads];
            int start = 1;
            for (int i = 0; i < numberOfThreads; i++) {
                int end = start + divisionSize - 1;
                if (i < remainder) {
                    end++;  // distribute the remainder
                }
                threads[i] = new practical2(start, end);
                threads[i].start();
                start = end + 1;
            }

            // Wait for all threads to finish
            for (Thread thread : threads) {
                thread.join();
            }

            // Print the final result
            System.out.println("Total Sum: " + totalSum);

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide valid numbers: N (total numbers) and number of threads.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}
