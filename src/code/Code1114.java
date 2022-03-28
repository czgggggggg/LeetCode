package code;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author czgggggggg
 * @Date 2022/3/28
 * @Description
 */
public class Code1114 {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();

        Runnable printFirst = new Runnable() {
            @Override
            public void run() {
                System.out.print("first");
            }
        };

        Runnable printSecond = new Runnable() {
            @Override
            public void run() {
                System.out.print("second");
            }
        };

        Runnable printThird = new Runnable() {
            @Override
            public void run() {
                System.out.print("third");
            }
        };

//        Thread a = new Thread(() -> {
//            try {
//                foo.first(printFirst);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        Thread b = new Thread(() -> {
//            try {
//                foo.second(printSecond);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        Thread c = new Thread(() -> {
//            try {
//                foo.third(printThird);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });

        Thread a = new Thread(() -> {
            try {
                foo.first(printFirst);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread b = new Thread(() -> {
            try {
                foo.third(printThird);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread c = new Thread(() -> {
            try {
                foo.second(printSecond);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        a.start();
        b.start();
        c.start();
    }
}

class Foo {
    private AtomicInteger firstJobDone = new AtomicInteger(0);
    private AtomicInteger secondJobDone = new AtomicInteger(0);

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        printFirst.run();

        firstJobDone.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(firstJobDone.get() != 1){

        }

        printSecond.run();
        secondJobDone.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(secondJobDone.get() != 1){

        }

        printThird.run();
    }
}
