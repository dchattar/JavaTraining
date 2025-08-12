package org.multithreading;


//what are different ways of creating threads in java
// 1. Extending Thread class
// 2. Implementing Runnable interface
// 3. Using ExecutorService
// 4. Using Callable interface with Future
// 5. Using ForkJoinPool for parallel processing
// 6. Using CompletableFuture for asynchronous programming
// 7. Using ScheduledExecutorService for scheduled tasks
// 8. Using CountDownLatch for synchronization
// 9. Using CyclicBarrier for synchronization
// 10. Using ThreadPoolExecutor for custom thread pool management

import org.collection.Employee;

import java.util.List;
import java.util.concurrent.ExecutorService;

public class ExectutorDemo {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        ExecutorService pool = java.util.concurrent.Executors.newFixedThreadPool(10);

        // Submit tasks to the thread pool
        List<Employee> employees = List.of(
                new Employee("Alice", "30", 12345),
                new Employee("Bob", "25", 67890),
                new Employee("Charlie", "35", 54321),
                new Employee("David", "28", 98765)
                );

        for (int parcel = 0; parcel < 6; parcel++) {
            final int taskId = parcel + 1; // Task ID for identification
            pool.submit(() -> {
                System.out.println("Delivery for parcel " + taskId + " is completed by Delivery Boy: " + Thread.currentThread().getName());
                try {
                    // Simulate some work with sleep
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.err.println("Task " + taskId + " was interrupted.");
                }
            });
        }

        // Shutdown the executor service
        pool.shutdown();
    }
}
