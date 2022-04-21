package concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author czgggggggg
 * @Date 2022/4/20
 * @Description
 */
public class Code0003 {
    static volatile int num = 0;
    public static void main(String[] args) {
//        AtomicInteger nums = new AtomicInteger(0);
//        Object obj = new Object();
        Lock lock = new ReentrantLock();

        Thread t1 = new Thread(() -> {
            while(true){
                lock.lock();
                if(num % 2 == 1){
                    System.out.println(num++);
                }
                if(num >= 100)
                    break;
                lock.unlock();
//                synchronized (obj){
////                    if(num.get() % 2 == 1){
////                        System.out.println(num.getAndIncrement());
////                    }
////                    if(num.get() >= 100)
////                        break;
//                    if(num % 2 == 1){
//                        System.out.println(num);
//                    }
//                    if(num >= 100)
//                        break;
//                }
            }
        });
        Thread t2 = new Thread(() -> {
            while(true){
                lock.lock();
                if(num % 2 == 0){
                    System.out.println(num++);
                }
                if(num >= 100)
                    break;
                lock.unlock();
//                synchronized (obj){
////                    if(num.get() % 2 == 0){
////                        System.out.println(num.getAndIncrement());
////                    }
////                    if(num.get() >= 100)
////                        break;
//                    if(num % 2 == 1){
//                        System.out.println(num);
//                    }
//                    if(num >= 100)
//                        break;
//                }
            }
        });

        t1.start();
        t2.start();
    }
}
