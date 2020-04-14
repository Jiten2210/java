package code.concurrency;

public class RunnableExample {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Inside : " + Thread.currentThread().getName());
        };
        System.out.println("Creating Thread...");
        Thread thread = new Thread(runnable);
        System.out.println("Starting Thread...");
        thread.start();
    }
}