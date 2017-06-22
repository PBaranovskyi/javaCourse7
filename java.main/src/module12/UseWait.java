package module12;

/**
 * Created by citsym on 22.06.17.
 */
public class UseWait {

    public static void main(String[] args) throws InterruptedException {

//        while (true){
//
//            Thread.sleep(5000);
//            System.out.println("Hello world");
//        }


        Object monitor = new Object();


        Thread thread1 = createAndStartThread(new Task("One", monitor, 1000), Thread.MAX_PRIORITY);
        Thread thread2 = createAndStartThread(new Task("Two", monitor, 3000), Thread.NORM_PRIORITY);
        Thread thread3 = createAndStartThread(new Task("Three", monitor, 5000), Thread.MIN_PRIORITY);


        Thread.sleep(400);
        synchronized (monitor) {
            monitor.notifyAll();
        }
    }


    private static Thread createAndStartThread(Runnable task, int priority) {
        Thread thread = new Thread(task);
        thread.setPriority(priority);
        thread.start();
        return thread;
    }
}
