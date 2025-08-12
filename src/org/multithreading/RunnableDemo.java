package org.multithreading;

public class RunnableDemo {
    public static void main(String[] args) {
        // Create a thread using Runnable interface
        Thread t1 = new Thread(new MyRunnable());
        t1.start(); // Start the thread

        // Main thread continues to run
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable thread: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1000 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
