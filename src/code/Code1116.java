package code;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

/**
 * @Author czgggggggg
 * @Date 2022/3/28
 * @Description
 */
public class Code1116 {
    public static void main(String[] args) {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(13);

        IntConsumer printNumber = new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.print(value);
            }
        };

        Thread a = new Thread(() -> {
            try {
                zeroEvenOdd.zero(printNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread b = new Thread(() -> {
            try {
                zeroEvenOdd.odd(printNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread c = new Thread(() -> {
            try {
                zeroEvenOdd.even(printNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        a.start();
        b.start();
        c.start();
    }
}
class ZeroEvenOdd {
    private int n;
    private volatile int num = 1;
    private AtomicInteger zeroDown = new AtomicInteger(0);
    private AtomicInteger oddDown = new AtomicInteger(0);
    private AtomicInteger evenDown = new AtomicInteger(1);

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    public void zero(IntConsumer printNumber) throws InterruptedException {
        while(num <= n){
            if(zeroDown.get() == 0 && (oddDown.get() == 1 || evenDown.get() == 1)){
                printNumber.accept(0);
                zeroDown.incrementAndGet();
            }
            else{
                Thread.yield();
            }
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        while(num <= n) {
            if (zeroDown.get() == 1 && evenDown.get() == 1) {
                printNumber.accept(num++);
                zeroDown.decrementAndGet();
                evenDown.decrementAndGet();
                oddDown.incrementAndGet();
            } else {
                Thread.yield();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        while(num <= n){
            if(zeroDown.get() == 1 && oddDown.get() == 1){
                printNumber.accept(num++);
                zeroDown.decrementAndGet();
                oddDown.decrementAndGet();
                evenDown.incrementAndGet();
            }else{
                Thread.yield();
            }
        }
    }
}