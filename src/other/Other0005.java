package other;

/**
 * @Author czgggggggg
 * @Date 2022/4/21
 * @Description
 */
public class Other0005 {
    private static Integer count = 0;
    private static final Integer FULL = 10;
    private static String LOCK = "lock";

    public static void main(String[] args) {
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
    }

    static class Producer implements Runnable{
        public void run(){
            for(int i = 0; i < FULL; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(LOCK){
                    while(count == FULL){
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName() + "，生产者生产，目前总共有：" + count);
                    LOCK.notifyAll();
                }
            }
        }
    }

    static class Consumer implements Runnable{
        public void run(){
            for(int i = 0; i < FULL; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized(LOCK){
                    while(count == 0){
                        try {
                            LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName() + "消费者消费，目前总共有：" + count);
                    LOCK.notifyAll();
                }
            }
        }
    }
}
