package module13;

import java.util.concurrent.CountDownLatch;

/**
 * Created by citsym on 29.06.17.
 */
public class Runner extends Thread{
    private final String name;
    private final int speed;
    private final Trek trek;
    private final CountDownLatch count;

    public Runner(String name, int speed, Trek trek, CountDownLatch count) {

        this.name = name;
        this.speed = speed;
        this.trek = trek;
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println(name + " is waiting");

        try {
            count.await();
        } catch (InterruptedException e) {
            System.out.println("OOOps. I was interrupted");
        }

        workToBeDone();
    }

    private void workToBeDone() {
        System.out.println( name + ": I started running");

        runDistance(trek.getDistance());


        System.out.println(name +  ": Yuuhooo - I reached finish");
    }

    private void runDistance(int distance) {
        while (distance > 0) {
            try {
                Thread.sleep(1000 / speed);
                distance--;
            } catch (InterruptedException e) {
                System.out.println("OOOps. I was interrupted");
            }
        }
    }
}
