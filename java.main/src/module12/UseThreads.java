package module12;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by citsym on 22.06.17.
 */
public class UseThreads {

    static AtomicLong count = new AtomicLong(0);

    static long before;

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            for (int i = 0; i < 100_000; i++) {
                count.incrementAndGet();
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 100_000; i++) {
                count.decrementAndGet();
            }
        };

        before = System.nanoTime();
        Thread thread1 = createAndStartThread(task);
        Thread thread2 = createAndStartThread(task);
        Thread thread3 = createAndStartThread(task2);

        thread1.join();
        thread2.join();
        thread3.join();


//        for (int i = 0; i < 300_000; i++) {
//            increment();
//        }
        System.out.println(Thread.currentThread().getName() + " ended " + count
                + " time: " + (System.nanoTime() - before));

    }

    private static Thread createAndStartThread(Runnable task) {
        Thread thread = new Thread(task);
        thread.start();
        return thread;
    }

//    private static void  increment() {
//        count++;
//    }


}
