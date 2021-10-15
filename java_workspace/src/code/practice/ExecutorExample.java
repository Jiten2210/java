package code.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {
    public static void main(String[] args) {

        System.out.println("Creating Executor Service with a thread pool of Size 2");
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            System.out.println("Jitendra");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };

        Runnable task2 = () -> {
            System.out.println("Bisht");
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };

        System.out.println("Submitting the tasks for execution...");
        executorService.submit(task1);
        executorService.submit(task2);

        executorService.shutdown();
    }
}
