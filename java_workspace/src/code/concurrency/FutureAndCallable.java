package code.concurrency;

import java.util.concurrent.*;

public class FutureAndCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> {
            System.out.println("Entered Callable");
            Thread.sleep(2000);
            return "Hello from Callable";
        };

        System.out.println("Submitting Callable");
        Future<String> future = executorService.submit(callable);
        String result = future.get(); // Future.get() blocks until the result is available
        System.out.println(result);

        executorService.shutdown();
    }
}
