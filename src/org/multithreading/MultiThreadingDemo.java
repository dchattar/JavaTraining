package org.multithreading;

//1. Extending Thread class
//2. Implementing Runnable interface

class Chapati extends Thread {
    @Override
    public void run()  {
        try {
            System.out.println("Preparing Chapati...");

            System.out.println("Chapti: 1. Prepare Gola");

            Thread.sleep(2);
            System.out.println("Chapti: 2. Make rounded chapati");
            Thread.sleep(2);
            System.out.println("Chapti: 3. put on Oil");
            Thread.sleep(2);
            System.out.println("Chapti: 4. Put on the flame");
            Thread.sleep(2);
            System.out.println("Chapti: 5. Put the chapati on the pan");
            Thread.sleep(2);
            System.out.println("Chapti: 6. Chapati is ready to serve");
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

class Tea extends Thread {
    @Override
    public void run() {
    try {
        System.out.println("Preparing Tea...");

        System.out.println("Tea: 1. Boil water");

        Thread.sleep(2);

        System.out.println("Tea: 2. Add tea leaves");
        Thread.sleep(2);
        System.out.println("Tea: 3. Add sugar");
        Thread.sleep(2);
        System.out.println("Tea: 4. Add milk");
        Thread.sleep(2);
        System.out.println("Tea: 5. Stir well");
        Thread.sleep(2);
        System.out.println("Tea: 6. Tea is ready to serve");
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    }
}

public class MultiThreadingDemo
{
    public static void main(String[] args) {
        Chapati aai = new Chapati();
        aai.start(); // Start the thread

        Tea chai = new Tea();
        chai.start(); // Start the thread
    }
}
