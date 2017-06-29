package module13;

import java.util.concurrent.CountDownLatch;

/**
 * Created by citsym on 29.06.17.
 */
public class UseRunners {


    public static final int ONE_SECOND = 1000;

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch count = new CountDownLatch(5);

        Trek trek = new Trek(100);

        (new Runner("Joe", 9, trek, count)).start();
        (new Runner("Nick", 8, trek, count)).start();
        (new Runner("Erick", 11, trek, count)).start();


        while (count.getCount() > 0){
            Thread.sleep(ONE_SECOND);
            count.countDown();
            System.out.println(count.getCount());
        }
    }
}
