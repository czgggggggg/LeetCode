package concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author czgggggggg
 * @Date 2022/4/20
 * @Description
 */
public class Deadlock {
    public static void main(String[] args) {
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Thread t1 = new Thread(() -> {
            lock1.lock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock2.lock();
            System.out.println("t1");
        });
        Thread t2 = new Thread(() -> {
            lock2.lock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock1.lock();
            System.out.println("t2");
        });

        t1.start();
        t2.start();
    }
}
