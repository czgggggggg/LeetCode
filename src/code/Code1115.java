package code;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author czgggggggg
 * @Date 2022/3/28
 * @Description
 */
public class Code1115 {
    public static void main(String[] args) {
        int n = 5;
        FooBar fooBar = new FooBar(n);

        Runnable printFoo = new Runnable() {
            @Override
            public void run() {
                System.out.print("foo");
            }
        };
        Runnable printBar = new Runnable() {
            @Override
            public void run() {
                System.out.print("bar");
            }
        };

        Thread a = new Thread(() -> {
            try {
                fooBar.foo(printFoo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread b = new Thread(() -> {
            try {
                fooBar.bar(printBar);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        a.start();
        b.start();
    }
}
class FooBar {
    private int n;
    AtomicInteger tag = new AtomicInteger(0);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            if(tag.get() != 0){
                Thread.yield();
                i--;
            }
            else{
                printFoo.run();
                //0 -> 1
                tag.incrementAndGet();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            if(tag.get() != 1){
                Thread.yield();
                i--;
            }else{
                printBar.run();
                //1 -> 0
                tag.decrementAndGet();
            }
        }
    }
}

//class FooBar {
//    private int n;
//    AtomicInteger tag = new AtomicInteger(0);
//
//    public FooBar(int n) {
//        this.n = n;
//    }
//
//    public void foo(Runnable printFoo) throws InterruptedException {
//
//        for (int i = 0; i < n; i++) {
//            while(tag.get() != 0){
//
//            }
//            printFoo.run();
//            //0 -> 1
//            tag.incrementAndGet();
//        }
//    }
//
//    public void bar(Runnable printBar) throws InterruptedException {
//
//        for (int i = 0; i < n; i++) {
//            while(tag.get() != 1){
//
//            }
//            printBar.run();
//            //1 -> 0
//            tag.decrementAndGet();
//        }
//    }
//}
