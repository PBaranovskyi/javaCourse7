package module12;

/**
 * Created by citsym on 22.06.17.
 */
public class Task implements Runnable {

    private final String variable;
    private final Object monitor;
    private final long sleepCount;

    public Task(String variable, Object monitor, long sleepCount) {
        this.variable = variable;
        this.monitor = monitor;
        this.sleepCount = sleepCount;
    }

    @Override
    public void run() {
        synchronized (monitor) {
            try {
                print();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void print() throws InterruptedException {
        try {
            monitor.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(sleepCount);

        System.out.println(variable);
    }
}
