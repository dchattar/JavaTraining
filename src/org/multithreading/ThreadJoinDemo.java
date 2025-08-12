package org.multithreading;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        Thread1 t1 =  new Thread1();
        t1.setName("Thread1"); // Set name for the thread
        Thread2 t2 =  new Thread2();
        t2.setName("Thread2"); // Set name for the thread
        Thread3 t3 =  new Thread3();
        t3.setName("Thread3"); // Set name for the thread

       // t1.setPriority(3); // Set priority to minimum
       // t2.setPriority(2); // Set priority to maximum
        t3.setPriority(1); //priority 1 is the highest priority

        t1.start();
        t2.start();
        t3.start();
         // Create a second thread
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(200); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

class Thread2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                try {
                    Thread.sleep(200); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

class Thread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(200); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
